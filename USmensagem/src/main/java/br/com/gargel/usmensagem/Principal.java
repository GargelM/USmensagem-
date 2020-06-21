package br.com.gargel.usmensagem;

import br.com.gargel.usmensagem.exibicao.menu.MenuService;
import br.com.gargel.usmensagem.util.USUtil;

public class Principal {

	public static void main(String[] args) throws Exception {
		exibirMensagem();
		new MenuService();
	}

	private static void exibirMensagem() {
		System.out.println(" _   _ _____                                                     \r\n"
				+ "| | | /  ___|                                                    \r\n"
				+ "| | | \\ `--. _ __ ___   ___ _ __  ___  __ _  __ _  ___ _ __ ___  \r\n"
				+ "| | | |`--. \\ '_ ` _ \\ / _ \\ '_ \\/ __|/ _` |/ _` |/ _ \\ '_ ` _ \\ \r\n"
				+ "| |_| /\\__/ / | | | | |  __/ | | \\__ \\ (_| | (_| |  __/ | | | | |\r\n"
				+ " \\___/\\____/|_| |_| |_|\\___|_| |_|___/\\__,_|\\__, |\\___|_| |_| |_|\r\n"
				+ "                                             __/ |               \r\n"
				+ "                                            |___/                \r");
		System.out.print("\nInicializando Sistema");
		USUtil.mostrarPontos(1);
		System.out.println();
		System.out.println("Pronto!");
	}

}
