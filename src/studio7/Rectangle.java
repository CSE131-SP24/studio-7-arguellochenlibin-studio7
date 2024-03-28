package studio7;

public class Rectangle {
	
	// instance variables 
	private double length;
	private double width; 
	
	// constructor 
	public Rectangle(double x, double y)
	{
		length = x;
		width = y; 
	}
	
	// calculate area 
	public double area()
	{
		return length*width;
	}
	
	// calculate perimeter 
	public double perimeter()
	{
		return (2*length) * (2*width);
	}
	
	// Draw 
	public void StdDraw()
	{
		edu.princeton.cs.introcs.StdDraw.filledRectangle(length, length, width, length);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle x = new Rectangle (0.1,0.2);
		System.out.println(x.area());
		System.out.println(x.perimeter());
		x.StdDraw();
	}

}
