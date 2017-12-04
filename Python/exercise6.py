#All code was tested in Microsoft Visual Studio

#(a) Write a function is_prime(n) that returns True only if n is prime.
#(b) Note that apart from 2 and 3, all primes are of the form 6k+-1
#    (though not all numbers of the form 6k+-1 are prime, of course).
#    Using this, we can improve the computation time by a factor 3.
#    Uptade your function to use this.
#(c) Write a function that returns all primes up to n.
#(d) Write a function that returns the first n primes.

print("\nExercise 6:\n")
print("6a:", end=' ')
def is_prime(n):
    if n%2 == 0 or n < 2: 
        return False
    for i in range(3, int(n**0.5)+1,2):
        if n%i == 0:
            return False
    return True
print(is_prime(7))

print("\n6b:", end=' ')
def is_prime2(n):
    if n==2 or n==3:
        return True
    if n%2 == 0 or n < 2: 
        return False
    for i in range(3, int(n**0.5)+1,2):
        if n%i == 0:
            return False
    return True
print(is_prime2(7))

print("\n6c:") #https://stackoverflow.com/questions/11619942/print-series-of-prime-numbers-in-python for effecient method
def nPrimes(n):
    solution = list()
    sieve = [True] * (n+1)
    for p in range(2, n+1):
        if (sieve[p]):
            solution.append(p)
            for i in range(p, n+1, p):
                sieve[i] = False
    return solution
print(nPrimes(30))

print("\n6d:")
def firstNprimes(n):
    primes = []
    count = 2
    while len(primes) != n:
        for i in range(2, count // 2 + 1):
            if count % i == 0:
                break
        else:
            primes.append(count)
        count += 1
    return primes
print(firstNprimes(100))