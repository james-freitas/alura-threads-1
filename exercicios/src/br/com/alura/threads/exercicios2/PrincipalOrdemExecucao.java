package br.com.alura.threads.exercicios2;

public class PrincipalOrdemExecucao {

	public static void main(String[] args) {
		
		new Thread(new TarefaImprimeNumeros()).start();
		new Thread(new TarefaImprimeNumeros()).start();
	}
	
}
