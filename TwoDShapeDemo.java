interface TwoDShape{
	double PI = 3.14;
	double area();
	double perimeter();
	default void show(){
		System.out.println("Interface: TwoDShape");
	}
}
interface CommonUtils{
	double PI = 3.14;
	double area();
	default void show(){
		System.out.println("Interface: CommonUtils");
	}
	static void display(){
		System.out.println("Display Method: CommonUtils");
	}
}
class Rectangle implements TwoDShape{
	double l, b;
	Rectangle(double l, double b){
		this.l = l;
		this.b = b;
	}
	public double area(){
		return l*b;
	}
	public double perimeter(){
		return 2*(l+b);
	}
}
class Circle implements TwoDShape, CommonUtils{
	double r;
	Circle(double r){
		this.r = r;
	}
	public void show(){
		System.out.println("=================Circle=====================");
	}
	public double area(){
		return TwoDShape.PI*r*r;
	}
	public double perimeter(){
		return 2*TwoDShape.PI*r;
	}
}
class TwoDShapeDemo{
	public static void main(String[] args){
		Circle c = new Circle(5.0);
		c.show();
		System.out.println("Area of the Circle: "+c.area());
		System.out.println("Perimeter of the Circle: "+c.perimeter());
		CommonUtils.display();
	}
}