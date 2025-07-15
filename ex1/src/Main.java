package src;

import java.util.Scanner;

import models.Email;
import models.RedeSocial;
import models.SMS;
import models.WhatsApp;

public class Main {
	
	private final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SMS sms = new SMS();
		Email email = new Email();
		RedeSocial rs = new RedeSocial();
		WhatsApp ws = new WhatsApp();
		
		System.out.println("Digite a mensagem que você quer enviar:");		
		String message = sc.nextLine();
		System.out.println("Escolha qual serviço de mensagem que você quer usar:");
		System.out.println("1 - SMS");
		System.out.println("2 - E-mail");
		System.out.println("3 - Rede Social");
		System.out.println("4 - WhatsApp");
		int servico = sc.nextInt();
		switch(servico){
			case 1:
				String result = sms.sendMessage(message);
				sms.printMessage(result);
				break;
			case 2:
				result = email.sendMessage(message);
				email.printMessage(result);
				break;
			case 3:
				result = rs.sendMessage(message);
				rs.printMessage(result);
				break;
			case 4:
				result = ws.sendMessage(message);
				ws.printMessage(result);
				break;
			default:
				System.out.println("Opção inválida!");
		}
	}
}
