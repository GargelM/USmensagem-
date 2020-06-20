package br.com.gargel.usmensagem.util;

public class USUtil {

	public static Integer converterParaInteiro(String validarEntrada) {
		try {
			return Integer.valueOf(validarEntrada);
		} catch (Exception e) {
			return null;
		}
	}

}
