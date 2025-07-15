package models;

import interfaces.Taxes;

public class Alimentacao implements Taxes {

	private static final String type = "Alimentação";
	private static final double tax = 1;
	
	@Override
	public double calculateTax(double value) {
		return (value * 1) / 100;
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
