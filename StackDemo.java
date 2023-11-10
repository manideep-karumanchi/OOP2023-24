import ds.*;
class StackDemo{
	public static void main(String[] args){
		_Stack s = new _Stack(10);
		for(int i=0;i<5;i++){
			s.push(i+1);
		}
		for(int i=0;i<5;i++)
			System.out.println("Element at the "+s.tos+" position is:"+s.pop());
	}
}