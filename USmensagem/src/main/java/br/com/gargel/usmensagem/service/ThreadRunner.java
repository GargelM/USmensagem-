package br.com.gargel.usmensagem.service;

/**
 * Classe utilitária para a execução de Threads.
 */
public class ThreadRunner {

	public static void run(Runnable... objetos) {
		for(Runnable objeto: objetos) {
			new Thread(objeto).start();
		}
	}
	
}
