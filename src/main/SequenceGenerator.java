package main;

import java.util.ArrayList;
import java.util.Random;

public class SequenceGenerator {
	private int size;
	private ArrayList<Integer> a; 
	
	public SequenceGenerator(int length) {
		size = length;
	}
	
	public void GenerateSequence() {
		Random random = new Random();
		a = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			a.add(random.nextInt(100));
		}
	}
	
	
	public ArrayList<Integer> getSequence(){
		return a;
	}
	
	public void printSequence() {
		System.out.println(a);
	}
}
