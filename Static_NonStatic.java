class Static_NonStatic{
	int a = 200;
	static int s = 100;
	void showNonStatic(){
		System.out.println("a="+a);
	}
	static void showStatic(){
		System.out.println("s="+s);
	}
	void show(){
		System.out.println("a="+a+"s="+s);
	}
	static void sshow(){
		System.out.println("a="+a+"s="+s);
	}
}