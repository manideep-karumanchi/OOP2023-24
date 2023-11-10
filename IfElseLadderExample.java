import java.util.*;
class IfElseLadderExample{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter an integer:");
		int num = s.nextInt();
		
		if(num > 0){
			System.out.println(num+" is +ve number");
		}
		else if(num < 0){
			System.out.println(num+" is -ve number");
		}
		else{
			System.out.println(num+" is Zero");
		}
		System.out.println("Program Execution Completed");
	}
}