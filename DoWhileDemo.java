import java.util.Scanner;
class DoWhileDemo{
	public static void main(String[] args){
		System.out.print("Enter a number: ");
		int n = new Scanner(System.in).nextInt(), i=1, count=0;
		do{
			if(n % i == 0){
				count++;
			}
			i++;
		}while(i <= n);
		if(count == 2){
			System.out.println(n + " is a prime");
		}
		else{
			System.out.println(n + " is not a prime");
		}
	}
}