package models;

import java.util.Scanner;

import exceptions.SocialException;
import interfaces.MessageService;

public class RedeSocial implements MessageService{
	
	private final static Scanner sc = new Scanner(System.in);

	private static String redeSocial;
	private static String complemento = "Enviando mensagem do ";
	
	@Override
	public String sendMessage(String message) {
		redeSocial = choiceSocialMidia();
		return complemento + redeSocial + message;
	}
	
	private String choiceSocialMidia() {
		System.out.println("Escolha qual rede social você deseja usar:");
		System.out.println("1 - Facebook");
		System.out.println("2 - Instagram");
		System.out.println("3 - X/Twitter");
		System.out.println("4 - Discord");
		int rs = sc.nextInt();
		switch (rs) {
		case 1:
			return "Facebook: ";		case 2:
			return "Instagram: ";		case 3: 
			return "X/Twitter: ";		case 4:
			return "Discord: ";
		default:
			throw new SocialException("Opção inválida! Escolha outra opção");
		}
	}
	
	@Override
	public void printMessage(String result) {
		System.out.println(result);
	}
}
