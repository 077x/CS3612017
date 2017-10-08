parent(victoria, edward_vii).
parent(edward_vii, george_v).
parent(alexandra, george_v).
parent(george_v, george_vi).
parent(george_vi, elizabeth_ii).
parent(elizabeth_ii, charles).
parent(charles, william).
parent(william, george).
parent(kate, george).
parent(william, charlotte).
parent(kate, charlotte).

male(edward_vii).
male(george_v).
male(george_vi).
male(charles).
male(william).
male(george).

female(victoria).
female(alexandra).
female(elizabeth_ii).
female(kate).
female(charlotte).

father(X,Y) :- male(X),parent(X,Y).
mother(X,Y) :- female(X),parent(X,Y).