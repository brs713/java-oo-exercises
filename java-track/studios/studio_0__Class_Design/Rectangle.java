package studio_0__Class_Design;

//Rectangle
//
//A rectangle has a length and a width.
//A rectangle should be able to provide its area and perimeter.
//A rectangle can indicate whether it is smaller than another rectangle in terms of area.
//A rectangle can indicate whether it is in fact a square.

public class Rectangle {

	//Props:
		//length - double
		//width - double
	private double length;
	private double width; 
	
	//Behave:
		//-constructor
		//-getPerimeter()
		//-getArea()
		//-isSmaller(Rectangle)
		//-isSquare()
		//-toString()

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getPerimeter() {
		return (this.length * 2) + (this.width * 2);
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public boolean isSmaller(Rectangle otherRect) {
		if (this.getArea() < otherRect.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Length: " + this.length + "  Width" + this.width;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(12, 16);
		System.out.println(rect.getPerimeter());
	}
	


}
