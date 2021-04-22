public class Circle {
    private double radius;
    public Circle() {
        radius = 1;
    }

    public Circle(int r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
		return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2*Math.PI * radius;
    }
}

class Cylinder extends Circle{
	private double length=1;
	private Circle base;
	//constructor here

	public Cylinder(double length, double radius) {
	super(radius);
	this.length = length;
	}
	public double getArea() {
		return 2*base.getArea()+ base.getPerimeter() * length;
    }
	public double getVolume() {
        return base.getArea() * length;
    }
}


		


