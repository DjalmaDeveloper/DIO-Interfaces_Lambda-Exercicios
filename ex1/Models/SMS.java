package models;

import interfaces.MessageService;

public class SMS implements MessageService {
	
	private static String complemento = "Enviando SMS: ";

	@Override
	public String sendMessage(String message) {
		return complemento + message;
	}

	@Override
	public void printMessage(String result) {
		System.out.println(result);
	}

}
