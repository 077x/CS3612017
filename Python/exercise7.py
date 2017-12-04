#All code was tested in Microsoft Visual Studio

#(a) Write a function that prints the elements of a list.
#(b) Write a function that prints the elements of a list in reverse.
#(c) Write your own implementation of the 'len' function that returns
#    the number of elements in a list.

print("\nExercise 7:\n")
print("7a:")
def printList():
    list = [1,2,3,4,5]
    for i in (list):
        print (i, end=' ')
    #print(list)
printList()

print("\n7b:")
def printListbk():
    list = [1,2,3,4,5]
    for i in reversed(list):
        print(i, end=' ')
printListbk()

print("\n7c:")
def listSize():
    list = [1,2,3,4,5]
    length = 0
    for i in (list):
        length += 1
    print(length)
print("Number of elements in the list: ")
listSize()