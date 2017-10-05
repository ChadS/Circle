public class Point
{
	private int x;
	private int y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
		}
	public int getX() {
		return x;
		}
	public int getY() {
		return y;
		}
	public String toString()
	{
		return "("+x+","+y+")";
		}
	public double distance(Point p){
		return Math.sqrt((p.x-x)*(p.x-x) + (p.y-y)*(p.y-y));
		}
	}