package br.com.gargel.usmensagem.service;

public class ThreadRunner {

	public static void run(Runnable... objetos) {
		for(Runnable objeto: objetos) {
			new Thread(objeto).start();
		}
	}
	
}
