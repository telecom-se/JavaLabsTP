package fr.tse.info.tp7.exercice1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Exercice 1 : Synchronization d'un compteur
 * 
 * Dans cet exercice, le compteur (Class compteur) n'est pas synchronisé
 * correctement. 10 threads tentent de l'incrémenter 10 fois chacun, le résultat
 * attendu est donc 100.
 * 
 * Cependant si vous exécutez ce programme vous n'obtiendrez pas ce résultat.
 * Vous allez synchroniser ce programme de 3 manières différentes
 * <ol>
 * <li>Utiliser le mot clé synchronized pour résoudre le problème</li>
 * <li>Dans la classe compteur, utiliser des locks pour synchroniser</li>
 * <li>Rechercher dans le package java.util.concurrent.atomic une classe
 * permettant de réaliser la synchonisation</li>
 * </ol>
 * 
 * @author Julien Subercaze
 * 
 */
public class Exercice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Utilisation d'un threadpool, regardez la doc pour en savoir plus.
		// Permet de gérer l'exécution d'un ensemble de thread
		ExecutorService service = Executors.newFixedThreadPool(10);
		Compteur compteur = new Compteur();
		// Lance 10 threads qui modifient le même compteur
		for (int i = 0; i < 10; i++) {
			service.execute(new ThreadModifieur(compteur));
		}
		// Attendre la fin de l'exécution
		shutdownAndAwaitTermination(service);
		System.out.println("Valeur du compteur :" + compteur.getCompteur());
	}

	/**
	 * Bonne pratique : méthode reprise de la Javadoc
	 * 
	 * @param pool
	 */
	static void shutdownAndAwaitTermination(ExecutorService pool) {
		pool.shutdown(); // Disable new tasks from being submitted
		try {
			// Wait a while for existing tasks to terminate
			if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
				pool.shutdownNow(); // Cancel currently executing tasks
				// Wait a while for tasks to respond to being cancelled
				if (!pool.awaitTermination(60, TimeUnit.SECONDS))
					System.err.println("Pool did not terminate");
			}
		} catch (InterruptedException ie) {
			// (Re-)Cancel if current thread also interrupted
			pool.shutdownNow();
			// Preserve interrupt status
			Thread.currentThread().interrupt();
		}
	}

}
