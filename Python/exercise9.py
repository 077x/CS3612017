#All code was tested in Microsoft Visual Studio

#Consider having a list with lists as elements, e.g. [[1,3],[3,6]].
#Write a function that takes such list, and returns a list with as 
#elements the elements of the sublists, e.g. [1,3,3,6].

print("\nExercise 9:\n")
exList = [[1,3],[3,6]]
def merge_list(l):
    finalList = list()
    for sublist in l:
        for i in sublist:
            finalList.append(i)
    return finalList
print(merge_list(exList))