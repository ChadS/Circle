public class Circle 
{
	private Point point;
	private int radius;
	public Circle(Point center,int radius){
		point=center;
		this.radius=radius;
		}
	public Point getCenter() {
		return point;
		}
	public int getRadius()
	{
		return radius;
		}
	public double getArea(){
		return Math.PI*radius*radius;
		}
	public double getCircumference(){
		return 2*Math.PI*radius;
		}
	public String toString(){
		return "Circle[center = ("+point.getX()+","+point.getY()+") , radius = "+radius+"]";
		}
	public boolean contains(Point p){
		return point.distance(p)<radius;
		}
	}