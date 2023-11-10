package ds;
public class _Stack{
	int[] stk;
	public int tos;
	public _Stack(){
		stk = new int[10];
		tos = -1;
	}
	public _Stack(int size){
		stk = new int[size];
		tos = -1;
	}
	public void push(int ele){
		stk[++tos]=ele;
	}
	public int pop(){
		return stk[tos--];
	}
}