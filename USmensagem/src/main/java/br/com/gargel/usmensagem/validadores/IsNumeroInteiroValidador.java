package br.com.gargel.usmensagem.validadores;

import br.com.gargel.usmensagem.exception.USmensagemException;

public class IsNumeroInteiroValidador implements Validador {

	@Override
	public boolean validar(String objeto) throws USmensagemException {
		try {
			Integer.parseInt((String) objeto);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
