package br.com.gargel.usmensagem.service.chat;

public class ChatFactory {

	public static Chat getInstance(String fabricaDeTopic, String nomeDoTopico, String nomeDeUsuario, String ip) {
		Chat chat = null;
		try {
			chat = new Chat(fabricaDeTopic, nomeDoTopico, nomeDeUsuario, ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chat;
	}
	
}
