package fr.tse.info.tp7.exercice2;

import java.util.HashMap;
import java.util.Map;

public class Worker implements Runnable {

	int volumeNumber;
	Map<String, Integer> m;

	public Worker(int i) {
		this.volumeNumber = i;
		m = new HashMap<String, Integer>();
	}

	@Override
	public void run() {
		// TODO Compléter ici, inspirez-vous du code dans Compteur.java

	}

	public Map<String, Integer> getM() {
		return m;
	}

}
