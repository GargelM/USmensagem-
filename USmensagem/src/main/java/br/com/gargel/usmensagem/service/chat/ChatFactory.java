package br.com.gargel.usmensagem.service.chat;

import br.com.gargel.usmensagem.service.IpService;

public class ChatFactory {

	public static Chat getInstance(String fabricaDeTopic, String nomeDoTopico, String nomeDeUsuario) {
		Chat chat = null;
		try {
			chat = new Chat(fabricaDeTopic, nomeDoTopico, nomeDeUsuario, IpService.getIp());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chat;
	}
	
}
