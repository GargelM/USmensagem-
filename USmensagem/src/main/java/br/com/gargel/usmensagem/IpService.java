package br.com.gargel.usmensagem;

import java.util.Scanner;

import br.com.gargel.usmensagem.exibicao.Menu;

public class IpService {

	private static String ip = "";
	
	public void cadastrarIp(Scanner leitor, Menu menu) {
		System.out.println("entrou");
		
		menu.exibirMenu();
	}

	public String getIp() {
		return ip;
	}	
	

}
