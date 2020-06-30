package br.com.gargel.usmensagem.exibicao.menu.acoes;

import java.util.Scanner;

import br.com.gargel.usmensagem.service.IpService;

/**
 * Classe que tem como função chamar a rotina de cadastro do ip do usuário globalmente.
 */
public class CadastrarIpAcao implements AcaoMenu {

	@Override
	public void executar(Scanner leitor) {
		new IpService().cadastrarIp(leitor);
	}

}
