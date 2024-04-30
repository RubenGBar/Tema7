package boletin1.ejercicio3;

import java.util.HashMap;

public class Principal {
	public static void main(String[] args) {
		String texto = "En un agujero en el suelo, vivía un hobbit. "
				+ "No un agujero húmedo, sucio, repugnante, con restos de gusanos y olor a fango, "
				+ "ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse "
				+ "o que comer: era un agujero-hobbit, y eso significa comodidad";
		
		HashMap<String, Integer> mapa1 = new HashMap<>();
		
		String textoMinusculas = texto.toLowerCase();
		
		for(int i = 0; i < textoMinusculas.length(); i++) {
			
			if(!mapa1.containsKey(textoMinusculas.charAt(i))) {
				mapa1.put(textoMinusculas.charAt(i) + "", null);
			}
		}
		
	}

}
