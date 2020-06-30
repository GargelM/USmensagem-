package br.com.gargel.usmensagem.validadores;

import br.com.gargel.usmensagem.exception.USmensagemException;

/**
 * Classe que deve validar se uma String está vazia.
 */
public class StringVaziaValidador implements Validador {

	@Override
	public boolean validar(String objeto) throws USmensagemException {
		try {
			String texto = (String) objeto;
			return texto.trim().isEmpty();
		} catch (Exception e) {
			throw new USmensagemException("Erro ao validar String Vazia!");
		}
	}

}
