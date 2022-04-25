Overview

The official definition for the Bridge design pattern introduced by Gang of Four
(GoF) is to decouple an abstraction from its implementation so that the two can vary independently.

This means to create a bridge interface that uses OOP principles to separate out responsibilities into different abstract classes

This is a good choice in the following cases:

When we want a parent abstract class to define the set of basic rules, and the concrete classes to add additional rules

When we have an abstract class that has a reference to the objects, and it has abstract methods that will be defined in each of the concrete classes