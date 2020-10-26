/**
 * 
 */
package com.TheMasterMindGroup;
import java.util.Scanner;
/**
 * @author anubhav
 *
 */
public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is for first number
		System.out.println("Enter number 1: ");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		
		//this is for second number
		System.out.println("Enter number 2: ");
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();
		
		//this is for second number
		System.out.println("Enter number 3: ");
		Scanner sc3 = new Scanner(System.in);
		int num3 = sc3.nextInt();
		
		//computation
		float num4 = (num1+num2+num3)/3;
		
		//output of the program
		System.out.println("The average of these 3 numbers : "+num4);
		
		//closing all the respective classes
		sc1.close();
		sc2.close();
		sc3.close();
		
	}

}
