#All code was tested in Microsoft Visual Studio

#(a) Implement a non-recursive function that computes the Fn
#(b) Implement a recursive function that computes Fn

print("\nExercise 12:\n")
def recFib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return recFib(n-1) + recFib(n-2)
    return n
print("Recursive Fibonacci: ")
print(recFib(29))

def memoFib(n, _cache={}):
    if n in _cache:
        return _cache[n]
    elif n == 0:
        return 0
    elif n == 1:
        return 1
    elif n > 1:
        return _cache.setdefault(n, memoFib(n-1) + memoFib(n-2))
    return n
print("Memoized Fibonacci: ")
print(memoFib(29))