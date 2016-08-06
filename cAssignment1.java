package assignment3;

import java.util.Scanner;

public class cAssignment1 {

	public static void mComputeResult(double pNumber)
	{
		double lSqRootAnswer  = Math.sqrt(pNumber);
		double lCubeRootAnswer  = Math.cbrt(pNumber);
		System.out.println("Square Root of " + pNumber + " = " + lSqRootAnswer);
		System.out.println("Cube Root of " + pNumber + " = " + lCubeRootAnswer);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double lNumber = 0;

		System.out.println("Please enter number.");
		lNumber = scan.nextInt();
		mComputeResult(lNumber);
		
	}

}
