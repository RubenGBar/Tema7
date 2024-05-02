package boletin1.ejercicio3;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {
		String texto = "En un agujero en el suelo, vivia un hobbit. "
				+ "No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, "
				+ "ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse "
				+ "o que comer: era un agujero-hobbit, y eso significa comodidad";
		
		HashMap<Character, Integer> letras = new HashMap<>();
		
		String textoMinusculas = texto.toLowerCase();
		
		Character caracter;
		
		Set<Entry<Character, Integer>> caracteres = letras.entrySet();
		
		for(int i = 0; i < textoMinusculas.length(); i++) {
			
			caracter = textoMinusculas.charAt(i);
			
			if(Character.isLetter(caracter)) {
				if(letras.containsKey(caracter)) {
					letras.put(caracter, letras.get(caracter)+1);
				} else {
					letras.put(caracter, 1);
				}
			}
		}
		
		for(Entry<Character, Integer> entrada : caracteres) {
			System.out.println(entrada.getKey() + " -> " + entrada.getValue());
		}
		
	}

}
