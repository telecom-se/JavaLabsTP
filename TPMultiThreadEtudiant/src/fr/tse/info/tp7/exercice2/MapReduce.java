package fr.tse.info.tp7.exercice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

;
public class MapReduce {

	private static final int CAPACITY = 10; // A adapter à votre machine
	public static String[] volumes;
	static Map<String, Integer> result = new HashMap<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Lecture des 6 volumes du livre
		volumes = VolumeReader.readVolumes();
		// Création de l'executor service
		ExecutorService service = Executors.newFixedThreadPool(CAPACITY);
		List<Future<Worker>> tasks = new ArrayList<Future<Worker>>();
		long t1 = System.currentTimeMillis();
		/**
		 * Map phase
		 */
		//TODO Compléter ici
		/**
		 * Reduce Phase
		 */
		//TODO Compléter ici
		service.shutdown();
		long t2 = System.currentTimeMillis();
		long time = t2 - t1;
		System.out.println("Time required for map reduce " + time + " ms");

	}
}
