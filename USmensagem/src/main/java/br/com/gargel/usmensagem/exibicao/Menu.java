package br.com.gargel.usmensagem.exibicao;

import java.util.Scanner;

import br.com.gargel.usmensagem.IpService;
import br.com.gargel.usmensagem.exception.USmensagemException;
import br.com.gargel.usmensagem.util.USUtil;
import br.com.gargel.usmensagem.validadores.IsPositivoValidador;
import br.com.gargel.usmensagem.validadores.StringVaziaValidador;

public class Menu {

	Scanner leitor = new Scanner(System.in);

	public void exibirMenu() {

		System.out.println("\n\nBem-vindo ao menu!\n");
		System.out.println("Selecione umas das opções");
		System.out.println("0 - Sair do sistema");
		System.out.println("1 - Cadastrar IP");
		System.out.println("2 - Exibir IP");
		System.out.print("\nDigite sua opcao: ");
		realizarAcao(USUtil.converterParaInteiro(validarEntrada(leitor.nextLine())));
	}

	private String validarEntrada(String nextLine) {
		String retorno = nextLine;
		try {
			boolean isVazia = new StringVaziaValidador().validar(nextLine);
			boolean isPositivo = new IsPositivoValidador().validar(nextLine);
			if (isVazia || !isPositivo) {
				throw new USmensagemException("Erro!!");
			}
		} catch (USmensagemException e) {
			System.err.println(e.getMessage());
			retorno = "24";
		}
		return retorno;
	}

	private void realizarAcao(Integer validarEntrada) {
		switch (validarEntrada) {
		case 0: {
			System.out.print("\n\nEncerrando");
			for (int i = 0; i < 4; i++) {
				try {
					Thread.sleep(1000);
					System.out.print(".");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.exit(0);
			break;
		}
		case 1: {
			new IpService().cadastrarIp(leitor, this);
			break;
		}
		case 2: {
			System.out.println(new IpService().getIp());
			this.exibirMenu();
		}
		default: {
			this.exibirMenu();
			break;
		}
		}
	}

}
