mother(linda, paul).
mother(cathy, andrew).
mother(cathy, laura).

female(linda).
female(cathy).
female(laura).

sibling(X,Y) :- mother(Z,X), mother(Z,Y), X\=Y.

sister(X,Y) :- female(X), sibling(X,Y).

/*
Implement the function g such that g(x) = x+5:
*/

g(X,Y) :- Y is X + 5.

/*
?- g(5,Y)
	Y = 10
 */
