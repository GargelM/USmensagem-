package br.com.gargel.usmensagem.exibicao.menu;

import java.util.Scanner;

import br.com.gargel.usmensagem.exception.USmensagemException;
import br.com.gargel.usmensagem.exibicao.menu.acoes.AcaoMenu;
import br.com.gargel.usmensagem.exibicao.menu.acoes.CadastrarIpAcao;
import br.com.gargel.usmensagem.validadores.IsPositivoValidador;
import br.com.gargel.usmensagem.validadores.StringVaziaValidador;

/**
 * Classe responsável pela impressão do Menu e seu desvio de fluxo, de acordo com a entrada do usuário. 
 */
public class Menu {

	Scanner leitor = new Scanner(System.in);
	boolean primeiraExecucao = true;

	/**
	 * Construtor escondido no pacote para ser iniciado pelo MenuService.
	 */
	Menu() {

	}

	public void exibirMenu() {
		if (primeiraExecucao) {
			new CadastrarIpAcao().executar(leitor);
			primeiraExecucao = false;
		}
		System.out.println("\nMenu\n");
		System.out.println("Selecione umas das opções");
		System.out.println("0 - Sair do sistema");
		System.out.println("1 - Exibir IP");
		System.out.println("2 - Cadastrar IP");
		System.out.println("3 - Iniciar Chat");
		System.out.print("\nDigite sua opcao: ");

	}

	public String lerAcao() {
		return leitor.nextLine();
	}

	public String validarEntrada(String nextLine) {
		String retorno = nextLine;
		try {
			boolean isVazia = new StringVaziaValidador().validar(nextLine);
			boolean isPositivo = new IsPositivoValidador().validar(nextLine);
			if (isVazia || !isPositivo) {
				throw new USmensagemException("Erro!!");
			}
		} catch (USmensagemException e) {
			System.err.println(e.getMessage());
			retorno = "24";
		}
		return retorno;
	}

	public OperacaoEnum getEnum(String entrada) {
		try {
			OperacaoEnum operacao = OperacaoEnum.valueOf("A".concat(entrada));
			return operacao;
		} catch (Exception e) {
			return null;
		}
	}

	public void realizarAcao(AcaoMenu acao) {
		acao.executar(leitor);
	}
}
