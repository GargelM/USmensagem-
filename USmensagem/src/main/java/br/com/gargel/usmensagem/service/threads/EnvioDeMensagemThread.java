package br.com.gargel.usmensagem.service.threads;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;

/**
 * Classe que deve ser executada como Thread que tem como função enviar uma mensagem ao servidor de mensagens.
 */
public class EnvioDeMensagemThread implements Runnable {

	private TopicSession session;
	private TopicPublisher publisher;
	private String usuario;
	private String mensagem;

	public EnvioDeMensagemThread(TopicSession session, TopicPublisher publisher, String usuario, String mensagem) {
		this.session = session;
		this.publisher = publisher;
		this.usuario = usuario;
		this.mensagem = mensagem;
	}

	@Override
	public void run() {
		try {
			TextMessage message;
			message = session.createTextMessage();
			message.setText(usuario + " diz: " + mensagem);
			publisher.publish(message);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
