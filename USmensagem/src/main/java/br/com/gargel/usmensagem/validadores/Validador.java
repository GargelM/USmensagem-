package br.com.gargel.usmensagem.validadores;

import br.com.gargel.usmensagem.exception.USmensagemException;

public interface Validador {

	boolean validar(String objeto) throws USmensagemException;

}
