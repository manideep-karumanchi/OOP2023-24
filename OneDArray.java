import java.util.*;
class OneDArray{
	int[] numbers;
	Scanner s = new Scanner(System.in);
	OneDArray(){
		numbers = new int[10];
		System.out.println("Enter 10 random integers:");
		for(int i=0;i<10;i++){
			numbers[i] = s.nextInt();
		}
	}
	OneDArray(int size){
		numbers = new int[size];
		System.out.println("Enter "+ size + " random integers:");
		for(int i=0;i<size;i++){
			numbers[i] = s.nextInt();
		}
	}
	int min(){
		int m = numbers[0];
		for(int ele : numbers){
			if(ele < m)
				m = ele;
		}
		return m;
	}
	void printArray(){
		System.out.println("Array Elements are");
		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);	
		}
	}
	public static void main(String[] args){
		OneDArray a = new OneDArray(5);
		a.printArray();
		int min = a.min();
		System.out.println("Minimum number in the array: "+min);
	}
}