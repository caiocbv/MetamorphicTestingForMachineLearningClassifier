from pathlib import Path
import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
import sweetviz as sv
from ydata_profiling import ProfileReport, profile_report
import random

#THESE ARE ALL CSV FILES FROM ALL TAGS Mifare and Fakes
df = pd.read_csv('AllTags_Median_Noise_20_percent.csv')

dataf = pd.DataFrame(df).copy()
print(dataf)

#dataf.pop('class')
#print(dataf)
#dataf.iloc[0]
#print(dataf)

#dataf_size = dataf.size

# Set the percentage of pixels that should contain noise
noise_percentage = 0.1  # Setting to 10%

# Determine the size of the noise based on the noise percentage
noise_size = int(noise_percentage*64) #64 columns
print("NOISE_SIZE")
print(noise_size)


df_noised = dataf.copy()
for i in range(0,len(dataf)):
    # Randomly select indices for adding noise.
    random_indices = random.sample(range(1, 64), noise_size)
    print("RANDOM INDICES")
    print(random_indices)
    #Min and MAx
    #2568 - 2608
    min_max_arr = [2568,2608]
    # Create a noise list with random placements of min and max values of the image pixels.
    noise_list = np.random.choice(min_max_arr, noise_size)
    print("NOISE_LIST")
    print(noise_list)
    
    for r in range(0, len(random_indices)):
        df_noised.iat[i,r] = noise_list[r]

#for i in range(noise_size):
    #print(i)
    #df_noised [random_indices] = noise_list



df_noised.to_csv("noised_10_percent.csv",index=False)