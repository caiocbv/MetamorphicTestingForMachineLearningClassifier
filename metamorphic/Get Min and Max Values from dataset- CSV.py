from pathlib import Path
import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
from pandas.api.types import is_numeric_dtype
import sweetviz as sv
from ydata_profiling import ProfileReport, profile_report
import random
from pathlib import Path

root_dir = Path(__file__).resolve().parent
# Give you the file path
#print(root_dir.__str__)

#THESE ARE FILE THAT CONTAINS ALL CSV FILES FROM ALL TAGS Mifare and Fakes
df = pd.read_csv(root_dir / "dataset" / "AllTags.csv")

min = 10000000 
max = 0

for i in df.columns:
    # i give us all columns names
    #print(i)
    if(is_numeric_dtype(df[i])):
        for j in (df.loc[:,i]):
            if(min > j):
                min = j
            if(max < j):
                max = j
    
    
    
print("Min -> " + str(min))
print("Max ->" + str(max))    