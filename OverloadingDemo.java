class Overloading{
	int n1, n2;
	Overloading(){
		n1 = 10;
		n2 = 20;
	}
	Overloading(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	int add(){
		return (n1 + n2);
	}
	int add(int n3){
		return (n1 + n2 + n3);
	}
	double add(double n3){
		return (n1 + n2 + n3);
	}
}
class OverloadingDemo{
	public static void main(String[] args){
		Overloading ov = new Overloading();
		Overloading ov1 = new Overloading(5,5);
		System.out.println("ov.add()"+ov.add());
		System.out.println("ov.add(5)"+ov.add(5));
		System.out.println("ov.add(71.24)"+ov.add(71.24));
		System.out.println("ov1.add()"+ov1.add());
		System.out.println("ov1.add(25)"+ov1.add(25));
		System.out.println("ov1.add(71.24)"+ov1.add(71.24));
		
	}
}