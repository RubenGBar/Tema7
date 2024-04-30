package boletin1.ejercicio2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		int i = 0;
		Random rand = new Random();
		
		while(set1.size() < 10) {
			set1.add(rand.nextInt(1, 21));
		}
		
		System.out.println("Conjunto Único:\n" + set1);
		
	}
	
}
