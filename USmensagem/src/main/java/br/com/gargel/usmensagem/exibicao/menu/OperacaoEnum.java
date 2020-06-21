package br.com.gargel.usmensagem.exibicao.menu;

import br.com.gargel.usmensagem.exibicao.menu.acoes.AcaoMenu;
import br.com.gargel.usmensagem.exibicao.menu.acoes.CadastrarIpAcao;
import br.com.gargel.usmensagem.exibicao.menu.acoes.EncerrarSistemaAcao;
import br.com.gargel.usmensagem.exibicao.menu.acoes.ExecutarChatAcao;
import br.com.gargel.usmensagem.exibicao.menu.acoes.ExibirIpAcao;

public enum OperacaoEnum {

	A0(new EncerrarSistemaAcao()),
	A1(new ExibirIpAcao()),
	A2(new CadastrarIpAcao()),
	A3(new ExecutarChatAcao());

	private AcaoMenu acao;

	private OperacaoEnum(AcaoMenu acao) {
		this.acao = acao;
	}
	public AcaoMenu getAcao() {
		return acao;
	}

}
