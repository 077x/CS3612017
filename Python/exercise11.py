#All code was tested in Microsoft Visual Studio

#Write two functions, one that uses iteration, and the other using
#recursion, that achieve the following:
#The input of the function is a list with numbers. The function returns
#the product of the numbers in the list.

print("\nExercise 11:\n")
prodList = [1,2,3,4,5]

def iterative_list(l):
    if len(l) == 0:
        return "List is empty"
    product = 1
    for i in l:
        product *= i
    return product
print("Iterative: ")
print(iterative_list(prodList))

def recursive_list(l):
    if len(l) == 1:
        return l[0]
    return recursive_list([l[0]]) * recursive_list(l[1:])
print("Recursive: ")
print(recursive_list(prodList))