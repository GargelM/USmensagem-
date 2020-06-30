package br.com.gargel.usmensagem.exibicao.menu.acoes;

import java.util.Scanner;

import br.com.gargel.usmensagem.exibicao.menu.MenuEstado;
import br.com.gargel.usmensagem.exibicao.menu.MenuService;
import br.com.gargel.usmensagem.util.USUtil;

/**
 * Classe que tem como função trocar o estado global de execução do sistema para ENCERRAMENTO, saindo do loop do menu.
 */
public class EncerrarSistemaAcao implements AcaoMenu {

	@Override
	public void executar(Scanner leitor) {
		MenuService.setEstado(MenuEstado.ENCERRAMENTO);
		System.out.print("\n\nEncerrando");
		USUtil.mostrarPontos(1);
	}

}
