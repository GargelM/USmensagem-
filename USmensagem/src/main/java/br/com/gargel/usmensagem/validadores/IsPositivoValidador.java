package br.com.gargel.usmensagem.validadores;

import br.com.gargel.usmensagem.exception.USmensagemException;

public class IsPositivoValidador implements Validador {

	@Override
	public boolean validar(String objeto) throws USmensagemException {
		try {
			Double numero = Double.valueOf((String) objeto);
			if (numero >= 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new USmensagemException("Não é numero positivo!");
		}
	}

}
