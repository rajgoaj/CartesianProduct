#Class to find CartesianProduct

The class has two methods.
1. Product
 - The finds cartesian product for the given rows in the input file. 
 
2. ProductnoDups
 - This method to be used specifically for requirements like distance calculation where the distance between site A and B = Site B and A.  In these cases, it is not required to find the duplicate distances.  Also distance between Site A = A. 
 
 
A main method has been included to demonstrate the results. 

#Usage

Input file to contain the following data
Almada,120,300,14.0
Alphine,200,400,0
Allen,300,600,12.3
Wells,120,90,16
Georgio,160,240,22

Call the program as java CartesianProduct.java /inputfilepath/filename.txt