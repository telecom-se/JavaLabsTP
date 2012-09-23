package fr.tse.info.tp7.exercice2;

import java.util.HashMap;

public class Compteur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] volumes = VolumeReader.readVolumes();
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		long t1 = System.currentTimeMillis();

		for (int i = 0; i < volumes.length; i++) {
			String[] words = volumes[i].split("\\s");
			for (String word : words) {
				Integer freq = m.get(word); // fréquence actuelle
				m.put(word, (freq == null) ? 1 : freq + 1); // 1 si nouveau,
															// +1
															// sinon
			}
		}

		long time = System.currentTimeMillis() - t1;
		System.out.println("Time required " + time + " ms");
	}

}
