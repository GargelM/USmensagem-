package br.com.gargel.usmensagem.service.threads;

public class ImpressaoDeMensagemThread implements Runnable{

	private String mensagem;

	public ImpressaoDeMensagemThread( String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public void run() {
		System.out.println(mensagem);
	}

}
