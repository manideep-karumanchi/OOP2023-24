final class FinalExample{
	final int i=100;
	final void init(){
		i=200;
	}
}
class FinalExample1 extends FinalExample{
	void init(){
		i=200;
	}
}
class FinalDemo{
	public static void main(String[] args){
		new FinalExample1();
	}
}