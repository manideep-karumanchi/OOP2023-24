class Parent{
	int i=100;
	void printi(){
		System.out.println("i="+i);
	}
}
class Child extends Parent{
	int i = 200;
	void printi(){
		System.out.println("Child Class i="+i);
		System.out.println("Super Class i="+super.i);
		super.printi();
	}
}
class SuperDemo{
	public static void main(String[] args){
		new Child().printi();
	}
}