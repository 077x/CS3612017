#All code was tested in Microsoft Visual Studio

#Try the following and explain the output:
print("\nExercise 3:\n")
print("(a) float(123):               ", float(123))
#Prints 123.0 because the int 123 is casted as a float
print("(b) float('123'):             ", float('123'))
#Prints 123.0 because the string '123' is casted as a float
print("(c) float('123.23'):          ", float('123.23'))
#Prints 123.23 because the string '123.23' is casted as a float
print("(d) int(123.23):              ", int(123.23))
#Prints 123 because the float 123.23 is casted as an int
#print("(e) int('123.23'):           ", int('123.23')) 
#Prints an int error, because the casting is done on a string which should be first casted as a float
print("(f) int(float('123.23')):     ", int(float('123.23')))
#Prints 123 because the string '123.23' is casted as a float and then casted as an int
print("(g) str(12):                  ", str(12))
#Prints 12, in the form of a string, since the int 12 is casted as a string
print("(h) str(12.2):                ", str(12.2))
#Prints 12.2, in the form of a string, since the float 12.2 is casted as a string
print("(i) bool('a'):                ", bool('a'))
#Prints True, since in Python only 0, as well as empty lists, empty tuplets, and empty strings, evalualte to False 
print("(j) bool(0):                  ", bool(0))
#Prints False
print("(k) bool(0.1):                ", bool(0.1))
#Prints True