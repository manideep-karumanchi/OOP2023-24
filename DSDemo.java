import ds._Stack;
class DSDemo{
	public static void main(String[] args){
		_Stack s = new _Stack();
		for(int i=0;i<5;i++)
			s.push(i+1);
		for(int i=0;i<5;i++)
			System.out.println("Element at "+s.tos+" position:"+s.pop());
		
	}
}