import java.util.*;
class WhileDemo{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the maximum value for natural number printing:");
		int n = s.nextInt();
		for(int i = 1; i <= n; i++){
			if(i==5)
				continue;
			System.out.println(i);
		}
	}
}