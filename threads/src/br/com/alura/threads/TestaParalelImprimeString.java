package br.com.alura.threads;

public class TestaParalelImprimeString {

	public static void main(String[] args) {
		
		Runnable runnable = new ImprimeString();
		Thread threadImprimeString = new Thread(runnable);
		threadImprimeString.start();
	}
	
}
