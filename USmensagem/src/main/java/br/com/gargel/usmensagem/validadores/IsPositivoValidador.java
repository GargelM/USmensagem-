package br.com.gargel.usmensagem.validadores;

import br.com.gargel.usmensagem.exception.USmensagemException;
import br.com.gargel.usmensagem.util.USUtil;

public class IsPositivoValidador implements Validador {

	@Override
	public boolean validar(Object objeto) throws USmensagemException {
		try {
			Integer numero = USUtil.converterParaInteiro((String) objeto);
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
