package main;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSub {
private SequenceGenerator sg;
	
	public SequenceGenerator getSG() {
		return sg;
	}
	
	public void getLength() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter length of ArrayList: ");
		int in = input.nextInt();
		
		sg = new SequenceGenerator(in);
		sg.GenerateSequence();
		
	}
	
	public void findLIS() {
		System.out.print("Sequence: ");
		sg.printSequence();
		
		ArrayList<Integer> sequence = sg.getSequence();
		
		
		
		int start = 0, end = 0, longest = 0, tempStart = 0, tempLongest = 0;
		
		for (int i = 1; i < sequence.size(); i++) {
			
			if (sequence.get(i) > sequence.get(i-1)) {
				if (tempLongest == 0) {
					tempStart = i;
				}
				tempLongest++;
			} else if (tempLongest > longest) {
				start = tempStart;
				longest = tempLongest;
				tempLongest = 0;
				end = i;
			} else {
				tempLongest = 0;
			}
			
		}
		
		System.out.print("Longest Subsequence: ");
		for (int j = start - 1; j < end; j++ ) {
			System.out.print(sequence.get(j) + " ");
		}
		System.out.println();
		
	}
}
