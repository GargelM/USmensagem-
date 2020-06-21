package br.com.gargel.usmensagem.exibicao.menu.acoes;

import java.util.Scanner;

import br.com.gargel.usmensagem.service.IpService;

public class CadastrarIpAcao implements AcaoMenu{

	@Override
	public void executar(Scanner leitor) {
		new IpService().cadastrarIp(leitor);		
	}

}
