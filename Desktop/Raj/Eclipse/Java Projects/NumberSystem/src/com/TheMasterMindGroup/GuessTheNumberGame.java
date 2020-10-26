package com.TheMasterMindGroup;
import java.util.Scanner;
import java.lang.Math;
public class GuessTheNumberGame {

	public static void main(String args[]) {
		// Auto-generated method stub
		System.out.println("Welcome to this number game");
		// Asking for the number of rounds
		System.out.println("Enter the number of rounds you want to play? ");
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Guess a number : ");
			Scanner sc1 = new Scanner(System.in);
			int answer = sc1.nextInt();
			int num = (int)(Math.random()*100);
			
			
			//comparing these number with the random generated number
			if (answer > num)// num stores the random generated number
			{
				System.out.print("Input is greater than the required number !");
			}else if(answer < num) {
				System.out.print("Input is less than the required number !");
			}else if(answer==num) {
				System.out.print("Yeah! You hit the bull's eye ");
			}else {
				System.out.print("Error : Invalid character entered !");
			}
			
			sc1.close();
		}
		
		sc.close();
	}
		

}
