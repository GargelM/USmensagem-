package br.com.gargel.usmensagem.exibicao.menu.acoes;

import java.util.Scanner;

/**
 * Interface que tem como função possuir implementações de ações no menu do usuário.
 */
public interface AcaoMenu {

	public void executar(Scanner leitor);

}
