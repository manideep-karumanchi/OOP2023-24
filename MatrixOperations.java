import java.util.*;
class MatrixOperations{
	int[][] m1, m2;
	Scanner s = new Scanner(System.in);
	MatrixOperations(){
		m1 = new int[2][2];
		m2 = new int[2][2];
		System.out.println("Enter "+ 4 + "Integers for Matrix 1:");
		for(int i=0; i < 2; i++){
			for(int j=0; j<2; j++){
				m1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter "+ 4 + "Integers for Matrix 2:");
		for(int i=0; i < 2; i++){
			for(int j=0; j<2; j++){
				m2[i][j] = s.nextInt();
			}
		}
	}
	MatrixOperations(int rows, int cols){
		m1 = new int[rows][cols];
		m2 = new int[rows][cols];
		System.out.println("Enter "+ (rows*cols) + "Integers for Matrix 1:");
		for(int i=0; i < rows; i++){
			for(int j=0; j<cols; j++){
				m1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter "+ (rows*cols) + "Integers for Matrix 2:");
		for(int i=0; i < rows; i++){
			for(int j=0; j<cols; j++){
				m2[i][j] = s.nextInt();
			}
		}
	}
	MatrixOperations(int r1, int c1, int r2, int c2){
		m1 = new int[r1][c1];
		m2 = new int[r2][c2];
		System.out.println("Enter "+ (r1*c1) + "Integers for Matrix 1:");
		for(int i=0; i < r1; i++){
			for(int j=0; j<c1; j++){
				m1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter "+ (r2*c2) + "Integers for Matrix 2:");
		for(int i=0; i < r2; i++){
			for(int j=0; j<c2; j++){
				m2[i][j] = s.nextInt();
			}
		}
	}
	void addMatrices(){
		int[][] res = new int[m1.length][m1[0].length];
		
		if(m1.length == m2.length && m1[0].length == m2[0].length){
			for(int i=0; i< m1.length; i++){
				for(int j=0; j<m1[0].length; j++){
					res[i][j] = m1[i][j] + m2[i][j];
				}
			}
			System.out.println("Matrix addition result:");
			for(int i=0; i< res.length; i++){
				for(int j=0; j<res[0].length; j++){
					System.out.print(res[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Matrix addition is not possible");
		}
	}
	void multiplyMatrices(){
		int res[][] = new int[m1[0].length][m2.length];
		if(m1[0].length == m2.length){
			for(int i=0; i < m1.length; i++){
				for(int j=0; j<m1[0].length; j++){
					for(int k=0; k<m2.length; k++){
						res[i][j] += m1[i][k]*m2[k][j];
					}
				}
			}
			System.out.println("Multiplication Result:");
			for(int i=0; i<res.length; i++){
				for(int j=0; j<m2[0].length; j++){
					System.out.print(res[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Matrix Multiplication is not possible");
		}
	}
	public static void main(String[] args){
		System.out.println("MatrixOperations Object1");
		MatrixOperations mo = new MatrixOperations(2,3,3,3);
		mo.addMatrices();
		mo.multiplyMatrices();
		System.out.println("MatrixOperations Object2");
		MatrixOperations mo1 = new MatrixOperations(3,3);
		mo1.addMatrices();
		mo1.multiplyMatrices();
	}
}