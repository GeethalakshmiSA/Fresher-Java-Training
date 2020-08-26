package question1;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int radius){
		super("Circle");
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double calculateArea(){
		return (3.14 * radius * radius);
	}
}
