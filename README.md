# GeometricObject-inheritance-Relationship

The following UML class diagram illustrates an inheritance relationship, wherein the classes Circle and Rectangle have been extended from the class GeometricObject.
 
 ![image](https://user-images.githubusercontent.com/77692425/130325565-f272c207-7184-43df-a046-757b61eaab8f.png)

the classes GeometricObject and Rectangle are implemented. 
The Rectangle class contains:
	Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1.0 for both width and height.
	A no-arg constructor that creates a default rectangle.
	A constructor that creates a rectangle with the specified width and height.
	A method named getArea() that returns the area of this rectangle.
	A method named getPerimeter() that returns the perimeter.
	A method named toString() that returns a string description for the rectangle.
The toString() method shall be implemented as follows:
return "Rectangle: width = " + width + " height = " + height;
The test program prompts the user to enter width and height of the rectangle, a color, and a Boolean value to indicate whether the rectangle is filled. The program creates a Rectangle object and sets the color and filled properties using the input. The program displays the area, perimeter, color, and true or false to indicate whether it is filled or not.
