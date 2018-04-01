package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) {
		
		//String nome = "da";
		
		/*
		 *  procurando nomes que começam com Dan ou Chad
		 *  \\s - significa whitespace, um espaço ou tab
		 *	\\w - significa word, um caractere ou número
		 */
		String nome = "(Dan|Chad)(\\s|\\w)*";
		
		Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));
		Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome));
		Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", nome));
		
		threadAssinaturas1.start();
		threadAssinaturas2.start();
		threadAutores.start();
	}

}
