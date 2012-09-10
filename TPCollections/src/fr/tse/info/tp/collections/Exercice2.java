package fr.tse.info.tp.collections;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

/**
 * 
 * @author Julien Subercaze
 * 
 *         Premier exercice du TP 2 sur les collections
 * 
 */
public class Exercice2 {

	// Longueur des différentes listes
	private static final int LONGUEUR_LISTE = 50000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclarations
		List<Integer> array = new ArrayList<>();
		List<Integer> linked = new LinkedList<>();
		List<Integer> vector = new Vector<>();

		

	}

	@SuppressWarnings("deprecation")
	public static void pause() {
		System.out.println("Pause, appuyer sur entrée pour continuer");
		litUneLigne();

	}

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
