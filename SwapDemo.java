class SwapExample{
	void swap(TwoNumbers tn){
		int temp = tn.a;
		tn.a = tn.b;
		tn.b = temp;
	}
	void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
}
class TwoNumbers{
	int a,b;
	static TwoNumbers set(int a, int b){
		TwoNumbers t = new TwoNumbers();
		t.a = a;
		t.b = b;
		return t;
	}
}
class SwapDemo{
	public static void main(String[] args){
		TwoNumbers tn = TwoNumbers.set(10,20);
		//tn.a = 10; tn.b = 20;
		SwapExample se = new SwapExample();
		System.out.println("Before Swap using Object:\ntn.a="+tn.a+"\ttn.b="+tn.b);
		se.swap(tn);
		System.out.println("After Swap using Object:\ntn.a="+tn.a+"\ttn.b="+tn.b);
		int a = 100, b = 100;
		System.out.println("Before Swap using Primitive Types:\na="+a+"\tb="+b);
		se.swap(a,b);
		System.out.println("After Swap using Primitive Types:\na="+a+"\tb="+b);
		
		
	}
}