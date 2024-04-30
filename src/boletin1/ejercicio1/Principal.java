package boletin1.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Integer> lista1 = new ArrayList<>();
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			lista1.add(rand.nextInt(1, 11));
		}
		
		System.out.println("Lista Original:\n" + lista1);
		
		for (int i = lista1.size() - 1; i >= 1; i--) {
            
            Collections.swap(lista1, i, rand.nextInt(i + 1));
        }
		
		System.out.println("Lista Desordenada:\n" + lista1);
		
	}
}
