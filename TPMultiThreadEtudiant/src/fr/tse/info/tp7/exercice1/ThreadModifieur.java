package fr.tse.info.tp7.exercice1;

public class ThreadModifieur implements Runnable {

	private Compteur compteur;

	public ThreadModifieur(Compteur compteur) {
		this.compteur = compteur;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			compteur.incrementCompteur();
			try {
				Thread.sleep((long) (Math.random() * 50));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}