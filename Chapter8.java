package csc201;
import java.util.Scanner;
/*
* (Sum elements column by column) Write a method that returns the sum of all the elements
*  in a specified column in a matrix using the following header:    
*       
* public static double sumColumn(double[][] m, int columnIndex)                  
* 
* Write a test program that reads a 3-by-4 matrix and displays the sum of each column. 
* */
public class Chapter8 {

	public static void main(String[] args) {
		double[][]matrix= getMatrix();
		
		for(int column=0; column<matrix[0].length; column++) {
			System.out.println("Sum of the elements in" + column + "is " +sumColumn(matrix,column));
		}
	}

	private static double[][] getMatrix() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int rowSize = 3;
		final int columnSize = 4;
		double[][]m= new double[rowSize][columnSize];
		
		
		System.out.println("Input a 3 x 4 matrix.");
		for(int row = 0; row<m.length;row++)
			for(int column = 0; column< m[row].length; column++) {
				m[row][column]=input.nextDouble();
			}
	
		return m;
	}

	public static double sumColumn(double[][] m, int columnIndex)  { 
	double sum = 0;
	for(int i  = 0; i<m.length; i++) {
		sum+= m[i][columnIndex];
	}
	return sum;
	}
}
