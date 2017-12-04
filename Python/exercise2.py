#All code was tested in Microsoft Visual Studio

#Explain the output of the following statements:
print("\nExercise 2:\n")
#print("(a) 2000.3 ** 200:          ", 2000.3**200) 
#Prints an overflow error
print("(b) 1.0 + 1.0 - 1.0:         ", 1.0+1.0-1.0)
#Prints 1.0; following the operations: 1.0 is added to 1.0 and then 1.0 is subtracted, thusly returning a float
print("(c) 1.0 + 1.0e20 - 1.0e20:   ", 1.0+1.0e20-1.0e20)
#Prints 0.0; 1.0 is added to 1.0e20, which is already an enormous number, so the addition of 1.0 is so minute, 1.0e20 remains the same.
#Subtracting 1.0e20 from 1.0e20 results in 0.0