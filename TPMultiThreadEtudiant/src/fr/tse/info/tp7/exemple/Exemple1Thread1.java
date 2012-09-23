package fr.tse.info.tp7.exemple;

public class Exemple1Thread1 implements Runnable {
	int numero;

	public Exemple1Thread1(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 5) {
			System.out.println("Thread " + numero);
			i++;
		}
	}

}
