#All code was tested in Microsoft Visual Studio

#(a) Create a list 'a' with some entries
#(b) Now set b = a
#(c) Change b[1]
#(d) What happened to 'a'?
#(e) Now set c = a[:]
#(f) Change c[2]
#(g) What happened to 'a'?

print("\nExercise 8:\n")
#8a:
a = [15,63,77,34,23,444,1,100]
print(a)
#8b:
b = a
#8c:
b[1] = 2
#8d:
print(a) #a changed, just as b did, in index 1
#8e:
c = a[:]
#8f:
c[2] = 99
#8g:
print(a) #a did not change in index 2, but c did

def set_first_elem_to_zero(l):
    l[0] = 0
    return l
lTest = [1,1,2,3,4]
print(set_first_elem_to_zero(lTest))

