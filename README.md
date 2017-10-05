Define a class named Circle.  A Circle object stores a radius(integer) and the (x, y) coordinates of its center point (using Point class). Each Circle object should have 2 private fields, a Point object and radius. Each Circle object should have the following public methods: 

•	Circle(Point center,int radius)
Constructs a new circle with a center specified by the given Point center and with the given integer radius. 

•	getCenter()
Returns point object for the center of the circle. 

•	getRadius()
Returns the circle's radius. 

•	getArea()
Returns the area occupied by the circle, using the formula πr2. 

•	getCircumference()
Returns the circle's circumference (distance around the circle), using the formula 2πr. 

•	toString()
Returns a string representation of the circle, such as "Circle[center=(75, 20),radius=30]". 

•	contains(Point p)
Returns true if the point p lies within the circle else returns false. [Hint: calculate the distance between the center and the point p (using distance method in Point class) and compare it with the radius].

Define a Point class. It should have at least two private fields to store x and y coordinates of a point. Each Point object should have the following public methods:

•	Point(int x, int y)
Constructs a new point with given x & y co-ordinates. 

•	getX()
Returns x co-ordinate of the point object.

•	getY()
Returns x co-ordinate of the point object.

•	toString()
Returns a string representation of the Point, such as "(x,y)". 

•	distance(Point p)
Returns the distance between the Point p and center of the circle.

Write a client class named CircleClient. 

•	Ask the user to input the center(x,y) and radius of the circle. 

•	Create an object of class Circle and pass the center and radius of circle. 

•	Print the object.

•	Print out its circumference and area. 

•	Check If point (5,7) lies within the circle by calling contains(Point p) method. If the point lies within the circle print “(5,7) lies within the circle” else print “(5,7) doesnot lie within the circle”.

Sample Output:

Please enter the x co-ordinate of the center of the circle
10

Please enter the y co-ordinate of the center of the circle
5

Please enter the radius of the circle
7
Circle[center =(10,5), radius = 7]

The circumference of the circle is 43.982297150257104

The area of the circle is 153.93804002589985

The point (5,7) lies within the circle Circle[center =(10,5), radius = 7]
