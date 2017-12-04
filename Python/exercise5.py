#All code was tested in Microsoft Visual Studio

#Use a while loop to find the first 20 numbers that are divisible by 
#5, 7, and 11, and print them:
print("\nExercise 5:")
def exe5():
    nofound = 0
    x = 11
    ans = list()
    while nofound < 20:
        if (x % 5 == 0 and x % 7 == 0 and x % 11 == 0):
            ans.append(x)
            nofound += 1     
        x += 1
    return(ans)
print(exe5())