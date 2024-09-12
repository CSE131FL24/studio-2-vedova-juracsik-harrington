package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		double count; 
		int grandTotal = 0;
		System.out.println("How many days are you playing: ");
		int totalSimulations = in.nextInt();
		System.out.println("How much money are you playing with: ");
		int startAmount = in.nextInt();
		System.out.println("What are your chances of winning?");
		double winChance = in.nextDouble();
		System.out.println("When do you want to cash out?");
		int winLimit = in.nextInt();
		for(int days = 1; days <= totalSimulations; days++) {
			int plays = 0;
			count = startAmount;
			while (count < winLimit && count > 0){
				double random = Math.random();
				if (random <= winChance) {
				count++;
				}
				else {
				count--;
				}
				plays++;
			}
			if (count == 0) {
			System.out.println("Day " + days + " took " + plays + " plays to lose all of your money!");
			grandTotal -= winLimit;
			}
			else {
			System.out.println("Day " + days + " took " + plays + " plays to win $" + winLimit + "!");
			grandTotal += (winLimit - startAmount);
			}
		}
		System.out.print("Your net money is $"+grandTotal);
	
	
	
	
	}

}
