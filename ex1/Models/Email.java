package models;

import interfaces.MessageService;

public class Email implements MessageService{
	
	private static String complemento = "Enviando e-mail: ";

	@Override
	public String sendMessage(String message) {
		return complemento + message;
	}

	@Override
	public void printMessage(String result) {
		System.out.println(result);
	}
}
