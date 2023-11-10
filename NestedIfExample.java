class NestedIfExample{
	public static void main(String[] args){
		int n1 = 1, n2 = 10, n3 = 100;
		if(n1 > n2){
			if(n1 > n3){
				System.out.println(n1+" is larger than "+n2+","+n3);
			}
			else{
				System.out.println(n3+" is larger than "+n1+","+n2);
			}
		}
		else{
			if(n2 > n3){
				System.out.println(n2+" is larger than "+n1+","+n3);
			}
			else{
				System.out.println(n3+" is larger than "+n1+","+n2);
			}
		}
	}
}