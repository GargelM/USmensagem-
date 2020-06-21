package br.com.gargel.usmensagem.exibicao.menu.acoes;

import java.util.Scanner;

import br.com.gargel.usmensagem.service.ChatService;

public class ExecutarChatAcao implements AcaoMenu {

	@Override
	public void executar(Scanner leitor) {
		new ChatService().abrirChat(leitor);
	}

}
