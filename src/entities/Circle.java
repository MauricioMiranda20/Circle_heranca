package entities;

public class Circle extends Point{

	protected double radius;

	public Circle() {
		radius = 0;
		System.out.println("Circle Constructor: "+this);
	}

	public Circle( double radius,int xCoordinate, int yCoordinate) {
		super(xCoordinate, yCoordinate);
		this.radius = radius;
		System.out.println("Circle constructor: "+this);
	}
	protected void finalize() {
		System.out.println("Circle finalizer : "+this);
		super.finalize();
		
	}
	public String toString() {
		return "Center = " + super.toString() + "; Radius " + radius;
	}
	
	
	
}
