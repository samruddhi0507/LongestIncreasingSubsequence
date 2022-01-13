package main;

import java.util.Scanner;

public class LongestIncreasingApp {
	
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			String s = "yes";
			while(s.equalsIgnoreCase("yes")){
			
				LongestIncreasingSub lis = new LongestIncreasingSub();
				lis.getLength();
				lis.findLIS();
				
				System.out.println("Would you like to continue? (Yes / No)");
				s = input.next();
			}
		}
		
		System.out.println("End of Program. Have a nice day!");
		
	}
}