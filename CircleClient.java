import java.util.Scanner;

public class CircleClient 
{
	public static void main(String a[]){
		int x,y,rad;
		Scanner s =new Scanner(System.in);
			System.out.println("Please enter the x co-ordinate of the center of the circle");
		x=s.nextInt();
			System.out.println("Please enter the y co-ordinate of the center of the circle");
		y=s.nextInt();
			System.out.println("Please enter the radius of the circle");
		rad=s.nextInt();
		Point p=new Point(x, y);
		Circle c=new Circle(p, rad);
			System.out.println(c.toString());
			System.out.println("The circumference of the circle is: "+c.getCircumference());
			System.out.println("The area of the circle is: "+c.getArea());
		Point p1=new Point(5, 7);
		if(c.contains(p1))
			System.out.println("The point (5,7) lies within the circle "+c.toString());
		else
			System.out.println("The point (5,7) does not within the circle "+c.toString());
		}
	}