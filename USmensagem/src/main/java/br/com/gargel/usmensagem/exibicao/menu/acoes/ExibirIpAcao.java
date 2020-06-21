package br.com.gargel.usmensagem.exibicao.menu.acoes;

import java.util.Scanner;

import br.com.gargel.usmensagem.service.IpService;

public class ExibirIpAcao implements AcaoMenu{

	@Override
	public void executar(Scanner leitor) {
		System.out.println(IpService.getIp());
	}

}
