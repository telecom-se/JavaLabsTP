package fr.tse.info.tp.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 * @author Julien
 * 
 */
public class Exercice1c {

	
	public static void main(String[] args) {
	}

	/**
	 * 
	 * @return une ligne entrée au clavier
	 */
	public static String litUneLigne() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			return reader.readLine();
		} catch (IOException e) {
			System.err.println("Erreur de lecture I/O, fermeture du programme");
			// A éviter, mais vous verrez les exceptions dans un prochain TP
			return null;
		}
	}
}
