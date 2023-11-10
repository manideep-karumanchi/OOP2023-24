class StaticDemo{
	static int sv;
	int nsv;
	static void show(StaticDemo sd){
		System.out.println("sv="+sv+"\tnsv="+sd.nsv);
	}
	static{
		System.out.println("===========Static Demo===============");
	}
	public static void main(String[] args){
		StaticDemo[] sd = new StaticDemo[5];
		for(int i=0;i<5; i++){
			sd[i]=new StaticDemo();
			sd[i].sv++;
			sd[i].nsv++;
			show(sd[i]);
		}
	}
}