package br.com.gargel.usmensagem.service.threads;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;

public class EnvioDeMensagemThread implements Runnable {

	public EnvioDeMensagemThread(TopicSession session, TopicPublisher publisher, String usuario, String mensagem) throws JMSException {
		TextMessage message;
		message = session.createTextMessage();
		message.setText(usuario + " diz: " + mensagem);
		publisher.publish(message);
	}

	@Override
	public void run() {

	}

}
