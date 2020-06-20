package br.com.gargel.usmensagem;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

//import org.omg.CORBA.portable.UnknownException;

import br.com.gargel.usmensagem.exibicao.Menu;

public class IpService {

	private static String ip = "";
	
	public void cadastrarIp(Scanner leitor, Menu menu){
	
		System.out.print("IP: ");
		ip = leitor.nextLine();
		if(ip.isEmpty()) cadastrarIp(leitor, menu);
		
		menu.exibirMenu();
	}
//
//	public String pegarIp() throws UnknownHostException  {
//		String ipDaMaquina = InetAddress.getLocalHost().getHostAddress();
//		return ipDaMaquina;
//	}
	public String getIp() {
		return ip;
	}	
	

}
