package br.com.gargel.usmensagem.util;

/**
 * Classes com funções para auxilio nas rotinas do sistema.
 *
 */
public class USUtil {

	public static Integer converterParaInteiro(String validarEntrada) {
		try {
			return Integer.valueOf(validarEntrada);
		} catch (Exception e) {
			return null;
		}
	}

	public static void mostrarPontos(long tempo) {
		for (int i = 0; i < 4; i++) {
			try {
				Thread.sleep(tempo * 500);
				System.out.print(".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
