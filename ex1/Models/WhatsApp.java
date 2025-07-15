package models;

import interfaces.MessageService;

public class WhatsApp implements MessageService{
	
	private static String complemento = "Enviando mensagem do WhatsApp: ";

	@Override
	public String sendMessage(String message) {
		return complemento + message;
	}

	@Override
	public void printMessage(String result) {
		System.out.println(result);
	}
}
