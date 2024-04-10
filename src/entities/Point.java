package entities;

public class Point {
	protected int y,x;
	public Point() {
		x=0;
		y=0;
		System.out.println("Point construtor: "+this);
	}
	public Point(int xCoordinate,int yCoordinate) {
		x = xCoordinate;
		y = yCoordinate;
		System.out.println("Point construtor : "+this);
	}
	protected void finalize() {
		System.out.println("Point finalizer : "+this);
	}
	public String toString() {
		
		return "[" + x +", " + y + "]" ;
	}
}
