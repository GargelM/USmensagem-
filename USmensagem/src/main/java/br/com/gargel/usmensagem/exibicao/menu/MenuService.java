package br.com.gargel.usmensagem.exibicao.menu;

/**
 * Classe responsável pela inicialização do Menu ao console e seu loop.
 *
 */
public class MenuService {

	private static Menu menu;
	private static MenuEstado proximoEstado = MenuEstado.CONTINUACAO;

	public MenuService() {
		menu = new Menu();
		this.executarLoopMenu();
	}

	private void executarLoopMenu() {
		while (proximoEstado.equals(MenuEstado.CONTINUACAO)) {
			executarProcedimentoPadrao();
		}
	}

	private void executarProcedimentoPadrao() {
		menu.exibirMenu();
		String textoRecebido = menu.lerAcao();
		String textoValidado = menu.validarEntrada(textoRecebido);
		OperacaoEnum operacao = menu.getEnum(textoValidado);
		if (operacao != null) {
			menu.realizarAcao(operacao.getAcao());
		}
	}

	public static MenuEstado getEstado() {
		return proximoEstado;
	}

	public static void setEstado(MenuEstado estado) {
		proximoEstado = estado;
	}

}
