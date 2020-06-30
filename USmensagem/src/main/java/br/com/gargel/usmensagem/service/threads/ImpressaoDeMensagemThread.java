package br.com.gargel.usmensagem.service.threads;

/**
 * Classe que deve ser executada como Thread que tem como função imprimir uma
 * mensagem recebida no console.
 */
public class ImpressaoDeMensagemThread implements Runnable {

	private String mensagem;

	public ImpressaoDeMensagemThread(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public void run() {
		System.out.println(mensagem);
	}

}
