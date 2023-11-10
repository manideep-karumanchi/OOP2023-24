class CalculateTotal{
	int calcTotal(int ... marks){
		int total = 0;
		for(int m : marks){
			total += m;
		}
		return total;
	}
	double calcTotal(double ... marks){
		double total = 0;
		for(double m : marks){
			total += m;
		}
		return total;
	}
	
	public static void main(String[] args){
		CalculateTotal ct = new CalculateTotal();
		System.out.println("calcTotal()"+ct.calcTotal());
		System.out.println("calcTotal(100)"+ct.calcTotal(100));
		System.out.println("calcTotal(100,99)"+ct.calcTotal(100,99));
		System.out.println("calcTotal(100,99,77)"+ct.calcTotal(100,99,77));
	}
}