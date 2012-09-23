package fr.tse.info.tp7.exercice1;

public class Compteur {

	int compteur;

	public Compteur() {
		this.compteur = 0;
	}

	public void incrementCompteur() {

		int tmp = compteur;
		tmp++;
		try {
			Thread.sleep((long) (Math.random() * 50));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.compteur = tmp;

	}

	public int getCompteur() {
		return compteur;
	}

}
