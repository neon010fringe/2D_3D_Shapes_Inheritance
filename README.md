CMSC 335 Project 1

Overview

In the project you will use Java Inheritance to create a series of related classes with a “Shape” theme.
Before completing this exercise, be sure to review and try the Java class and inheritance examples and
materials found on the Oracle Java Tutorials:

https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html

Note: Be sure to review is-a and has-a class relationships prior to starting this exercise as well.

Assignment Details

Design, implement and test a Java class Inheritance hierarchy that would satisfy the following is-a and
has-a relationships:

• A Shape is an object

• A TwoDimensionalShape is a Shape

• A ThreeDimensionalShape is a Shape

• A Circle is a TwoDimensionalShape

• A Square is a TwoDimensionalShape

• A Triangle is a TwoDimensionalShape

• A Rectangle is a TwoDimensionalShape

• A Sphere is a ThreeDimensionalShape

• A Cube is a ThreeDimensionalShape

• A Cone is a ThreeDimensionalShape

• A Cylinder is a ThreeDimensionalShape

• A Torus is a ThreeDimensionalShape

• A Shape has a NumberofDimensions

• A TwoDimensionalShape has an area

• A ThreeDimensionalShape has a volume

Note you should fill in additional methods and variables that make sense for each of the classes. Also
some assumptions about shape types is appropriate and should be documented in the code and
documents submitted. For example, type of triangle …

Create a command line driven menu that allows a user to construct each of the TwoDimensional and
ThreeDimensional Shape subclasses. The menu should continue to loop prompting for a specific class
and then prompt for appropriate input parameters. The values returned should be the volume or area
as appropriate to the shape. Error checks should be in developed to make sure appropriate menu items
and types of data were input and prompt the user to enter to correct data. An option to exit the
program should be available as well that will provide an appropriate Thank you message along with the
current date and time.

The following represents a possible menu session for a user:

*********Welcome to the Java OO Shapes Program **********

Select from the menu below:
1. Construct a Circle
2. Construct a Rectangle
3. Construct a Square
4. Construct a Triangle
5. Construct a Sphere
6. Construct a Cube
7. Construct a Cone
8. Construct a Cylinder
9. Construct a Torus
10. Exit the program

2

You have selected a Rectangle

What is the length?
4

What is the Width?
9.5

The area of the Rectangle is 38.

Would you like to continue? (Y or N)

3

Sorry I do not understand. Enter Y or N

Y

Select from the menu below:
1. Construct a Circle
2. Construct a Rectangle
3. Construct a Square
4. Construct a Triangle
5. Construct a Sphere
6. Construct a Cube
7. Construct a Cone
8. Construct a Cylinder
9. Construct a Torus
10. Exit the program
10
Thanks for using the program. Today is Nov 11 at 1:40 PM.
