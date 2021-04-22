import java.util.Scanner;

class Triangle extends GeometricObject{
	public static void main(String[] args) {
		  Scanner x = new Scanner(System.in);
		  System.out.println("Enter the value of the side of the triangle: ");
		  double side1 = x.nextDouble();
		  double side2 = x.nextDouble();
		  double side3 = x.nextDouble();
		  System.out.println("Enter a color: ");
	      String s = x.next();
		  System.out.println("Is the triangle filled (True or False) ");
		  boolean fill = x.nextBoolean(); 
		  
	    Triangle t = new Triangle(side1, side2, side3,s,fill);
	    System.out.println("Area: " + t.getArea());
	    System.out.println("Perimeter: " + t.getPerimeter());
	    System.out.println("Color: " + t.getColor());
	    System.out.println("Is filled: " + t.isFilled());
	  }
	private double side1, side2, side3;
	private GeometricObject g;
	public Triangle(){
		this(1, 1, 1,"white",true);
	}
	
	public Triangle(double side1, double side2, double side3, String color, Boolean fill){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		g = new GeometricObject(color,fill);
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public String getColor() {
		return g.getColor();
	}
	
	public boolean isFilled() {
		return g.isFilled();
	}
	
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow((s *(s-side1) * (s-side2) * (s-side3)), .5);
		
		return area;
	}
	
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	public String toString(){
		return String.format("Triangle: side1 = %f, side2 = %f, side3 = %f", side1, side2, side3);
	}
}


