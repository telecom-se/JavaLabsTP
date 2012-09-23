package fr.tse.info.tp7.exemple;

public class Exemple1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exemple1Thread1 thread1 = new Exemple1Thread1(1);
		Exemple1Thread1 thread2 = new Exemple1Thread1(2);
		new Thread(thread1).start();
		new Thread(thread2).start();

	}

}
