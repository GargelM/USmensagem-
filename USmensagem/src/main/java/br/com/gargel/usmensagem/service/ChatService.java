package br.com.gargel.usmensagem.service;

import java.util.Scanner;

import javax.jms.JMSException;

import br.com.gargel.usmensagem.service.chat.Chat;
import br.com.gargel.usmensagem.service.chat.ChatFactory;

public class ChatService {

	public void abrirChat(Scanner leitor) {
		String nome = obterNome(leitor);
		Chat chat = ChatFactory.getInstance("TopicCF", "topicChat", nome);
		String texto = "";
		while (!texto.equals(":q!")) {
			texto = leitor.nextLine();
			if (!texto.equals(":q!")) {
				try {
					chat.escreverMensagem(nome, texto);
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		}
		fecharChat(chat);
	}

	private String obterNome(Scanner leitor) {
		System.out.print("Digite seu nome:");
		return leitor.nextLine();
	}

	public void fecharChat(Chat chat) {
		try {
			chat.close();
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
