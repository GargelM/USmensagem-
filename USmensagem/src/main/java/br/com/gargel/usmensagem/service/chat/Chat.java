package br.com.gargel.usmensagem.service.chat;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.InitialContext;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Chat implements MessageListener {

	private TopicSession pubSession;
	private TopicPublisher publisher;
	private TopicConnection connection;

	Chat(String fabricaDeTopic, String nomeDoTopico, String nomeDeUsuario, String ip) throws Exception {

		InitialContext contexto = new InitialContext();

		TopicConnectionFactory fabricaDeConexaoDeTopic = new ActiveMQConnectionFactory("admin", "admin",
				"tcp://" + ip + ":61616");
		TopicConnection conexao = fabricaDeConexaoDeTopic.createTopicConnection();
		TopicSession sessaoPublisher = conexao.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TopicSession sessaoSubscriber = conexao.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

		Topic topicDoChat = (Topic) contexto.lookup(nomeDoTopico);

		TopicPublisher publisher = sessaoPublisher.createPublisher(topicDoChat);
		TopicSubscriber subscriber = sessaoSubscriber.createSubscriber(topicDoChat);

		subscriber.setMessageListener(this);

		this.connection = conexao;
		this.pubSession = sessaoPublisher;
		this.publisher = publisher;
		conexao.start();
	}

	public void onMessage(Message mensagem) {
		TextMessage textMessage = (TextMessage) mensagem;
		try {
			System.out.println(textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	public void escreverMensagem(String usuario, String texto) throws JMSException {

		TextMessage message = pubSession.createTextMessage();
		message.setText(usuario + " diz: " + texto);
		publisher.publish(message);
	}

	public void close() throws JMSException {
		connection.close();
	}
}
