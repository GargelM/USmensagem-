package br.com.gargel.usmensagem.validadores;

import br.com.gargel.usmensagem.exception.USmensagemException;

/**
 * Interface que tem como função possuir implementações de validações distintas no sistema.
 */
public interface Validador {

	boolean validar(String objeto) throws USmensagemException;

}
