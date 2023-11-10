import java.util.*;
class SwitchExample{
	public static void main(String[] args){
		int num1, num2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Integer Values");
		num1 = s.nextInt();
		num2 = s.nextInt();
		System.out.println("Enter a or s or m or d for deciding the operation to perform");
		char sv = s.next().charAt(0);
		switch(sv){
			case 'a': System.out.println(num1 + " + " + num2 + "=" + (num1+num2)); break;
			case 's': System.out.println(num1 + " - " + num2 + "=" + (num1-num2)); break;
			case 'm': System.out.println(num1 + " * " + num2 + "=" + (num1*num2)); continue;
			case 'd':System.out.println("Enter / - division or % - modulo division");
					switch(s.next().charAt(0)){
						case '/': System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); break;
						case '%':System.out.println(num1 + " % " + num2 + " = " + (num1%num2)); break;
						default:System.out.println("Enter / or % only");
					}; break;
			default: System.out.println("Enter a or s or m only");
		}
	}
}