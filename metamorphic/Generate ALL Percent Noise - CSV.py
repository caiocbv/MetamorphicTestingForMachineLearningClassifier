from pathlib import Path
import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
import sweetviz as sv
from ydata_profiling import ProfileReport, profile_report
import random
import gc
from pathlib import Path

root_dir = Path(__file__).resolve().parent

#THESE ARE ALL CSV FILES FROM ALL TAGS Mifare and Fakes
df = pd.read_csv(root_dir / "dataset" / "AllTags.csv")

dataf = pd.DataFrame(df).copy()


# Set the percentage of pixels that should contain noise
noise_percentage = [1.5625,3.125,4.6875,6.25,7.8125,9.375,10.9375,12.5,14.0625,15.625,17.1875,18.75,20.3125,21.875,23.4375,25,26.5625,28.125,29.6875,31.25,32.8125,34.375,35.9375,37.5,39.0625,40.625,42.1875,43.75,45.3125,46.875,48.4375,50,51.5625,53.125,54.6875,56.25,57.8125,59.375,60.9375,62.5,64.0625,65.625,67.1875,68.75,70.3125,71.875,73.4375,75,76.5625,78.125,79.6875,81.25,82.8125,84.375,85.9375,87.5,89.0625,90.625,92.1875,93.75,95.3125,96.875,98.4375,100]

# Determine how many block is going to be noised based on the noise percentage
#noise_size = int(noise_percentage*0.64) #64 columns divided by 100 to get percentage 0 to 64 blocks noised
#print("NOISE_SIZE")
#print(noise_size)

for noise_level in range(64):    #The range of blocks will be noised
    df_noised = dataf.copy()
    #print((pd.RangeIndex(df_noised.axes[0])).stop)
    for i in range(0,((pd.RangeIndex(df_noised.axes[0])).stop)): #Iterate by rows
        j_index=1
        # Randomly select indices for adding noise.
        random_indices = random.sample(range(1, 65), noise_level+1) # It returns a list of unique items chosen randomly from the sequence
        random_indices.sort()
        #print(random_indices)
        # Min and MAx values from ALL tags -> See how to get this in file: Get Min and Max Values from dataset- CSV.py
        min_max_arr = [2568,2608]
        
        # Create a noise list with random placements of min and max values of the image pixels.
        noised_list = np.random.choice(min_max_arr, noise_level+1) 
        #print(noised_list)
        for j in df.columns:
            if(j_index < 65):
                for rIndex in range(len(random_indices)):
                    #print(str(df_noised.loc[i,j]) + " => " + str(noised_list[rIndex] ))
                    if(random_indices[rIndex] == j_index):
                        df_noised.loc[i,j] = noised_list[rIndex] 
            j_index=j_index+1        

    df_noised.to_csv(root_dir / "dataset" / "DataNoised" / str("noised_"+str(noise_percentage[noise_level])+"_percent.csv"),index=False)
    del df_noised
    gc.collect()