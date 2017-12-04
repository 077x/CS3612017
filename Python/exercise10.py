#All code was tested in Microsoft Visual Studio

#Plot the function f(x) = sin^2(x-2)e^-x^2 over the interval [0,2].
#Add proper axis labels, a title, etc.

#Exercise 10:
import matplotlib.pyplot as plt
import numpy as np
def f(x):
    return(np.sin(x-2)**2)*(np.e**(-x**2))

x = np.arange(0.0, 2.0, 0.01)
y = f(x)

plt.plot(x,y)
plt.xlabel('x-axis')
plt.ylabel('y-axis')
plt.title("f(x) = sin^2(x-2) * e^-x^2")
plt.grid(True)
plt.show()