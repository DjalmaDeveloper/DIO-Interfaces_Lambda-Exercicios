package models;

import interfaces.Taxes;

public class SaudeBemEstar implements Taxes {
	
	private final static String type = "Saúde e Bem Estar";
	private final static double tax = 1.5;

	@Override
	public double calculateTax(double value) {
		return (value * tax) / 100;
	}

	@Override
	public void printValues(double value) {
		System.out.printf("\nTipo: %s", type);
		System.out.printf("\nImposto: %s%%", tax);
		System.out.printf("\nValor do produto: R$%s", value);
		System.out.printf("\nValor do imposto: R$%s", calculateTax(value));
		System.out.printf("\nValor total: R$%s\n", value + calculateTax(value));
	}

}
