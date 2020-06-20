package br.com.gargel.usmensagem.exibicao;

import java.util.Scanner;

public class Menu {

	Scanner leitor = new Scanner(System.in);

	public void exibirMenu() {
		System.out.println("Bem-vindo ao menu!\n");
		System.out.println("Selecione umas das opções");
		System.err.print("0");
		System.out.print(" - Sair do sistema");
		System.out.print("\n\nDigite sua opcao: ");
		realizarAcao(converterParaInteiro(validarEntrada(leitor.nextLine())));
	}

	private Integer converterParaInteiro(String validarEntrada) {
		return null;
	}


	private String validarEntrada(String nextLine) {
		return "";
	}

	private void realizarAcao(Object validarEntrada) {
	}
}
