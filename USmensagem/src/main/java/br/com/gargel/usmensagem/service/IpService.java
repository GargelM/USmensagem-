package br.com.gargel.usmensagem.service;

import java.util.Scanner;

/**
 * Classe que tem como função armazenar o ip global do servidor de mensagens.
 */
public class IpService {

	private static String ip = "";

	public void cadastrarIp(Scanner leitor) {
		System.out.print("Digite o IP do servidor de mensagens: ");
		ip = leitor.nextLine();
		if (ip.isEmpty()) {
			cadastrarIp(leitor);
		}
	}

	public static String getIp() {
		return ip;
	}

}
