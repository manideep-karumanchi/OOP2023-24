import java.util.*;
class JaggedArray{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[][] nums = new int[4][];
		nums[0] = new int[3];
		nums[1] = new int[7];
		nums[2] = new int[2];
		nums[3] = new int[4];
		for(int i=0; i<nums.length; i++){
			System.out.println("Enter "+nums[i].length+" values for "+ (i+1) +"th row:");
			for(int j=0; j<nums[i].length; j++){
				nums[i][j] = s.nextInt();
			}
		}
		System.out.println("Array Elements are:");
		for(int i=0; i<nums.length; i++){
			for(int j=0; j<nums[i].length; j++){
				System.out.print(nums[i][j]);
			}
			System.out.println();
		}
	}
}