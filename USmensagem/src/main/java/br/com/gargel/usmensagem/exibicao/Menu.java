package br.com.gargel.usmensagem.exibicao;

import java.util.Scanner;

import br.com.gargel.usmensagem.exception.USmensagemException;

public class Menu {

	Scanner leitor = new Scanner(System.in);

	public void exibirMenu() {
		System.out.println("Bem-vindo ao menu!\n");
		System.out.println("Selecione umas das opções");
		System.out.print("0");
		System.out.print(" - Sair do sistema");
		System.out.print("\n\nDigite sua opcao: ");
		realizarAcao(converterParaInteiro(validarEntrada(leitor.nextLine())));
	}

	private Integer converterParaInteiro(String validarEntrada) {
		return Integer.valueOf(validarEntrada);
	}

	public boolean isInt(String text) {
		try {
			Integer.parseInt(text);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isNumberPositive(Integer number) {
		return number >= 0;
	}
	
	private String validarEntrada(String nextLine) {
		String retorno = nextLine;
		
		
		try {
			if(nextLine.isEmpty()) {
				throw new USmensagemException("Linha Vazia");
			}
			
			if(isInt(nextLine)) {
				if(isNumberPositive(converterParaInteiro(nextLine)))
				System.out.println("È um numero");
			}
			
			
//			if(nextLine.contentEquals("teste")) {
//				System.out.println("ENTROU NO TESTE");
//				throw new USmensagemException("Linha Vazia");
//			}
			Integer numero = Integer.valueOf(nextLine);
		} catch (USmensagemException e) {
			System.err.println(e.getLocalizedMessage());
			retorno = "0";
		}catch (Exception e) {
			System.out.println("Caiu na exception padrao");
			retorno = "0";
		}
		System.out.println("Entrando no retorno");
		return retorno;
	}

	private void realizarAcao(Object validarEntrada) {

	}
}
