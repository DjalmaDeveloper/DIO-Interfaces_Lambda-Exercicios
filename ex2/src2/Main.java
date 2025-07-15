package src2;

import java.util.Scanner;

import models.Alimentacao;
import models.Cultura;
import models.SaudeBemEstar;
import models.Vestuario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		String produto = sc.nextLine();
		System.out.println("Digite o valor do produto");
		double value = sc.nextDouble();  
		System.out.println("\nDigite a categoria do produto:");
		System.out.println("1 - Alimentação");
		System.out.println("2 - Saúde e Bem Estar");
		System.out.println("3 - Vestuário");
		System.out.println("4 - Cultura");
		int cat = sc.nextInt();
		switch(cat) {
		case 1:
			Alimentacao food = new Alimentacao();
			food.printValues(value);
			break;
		case 2:
			SaudeBemEstar sb = new SaudeBemEstar();
			sb.printValues(value);
			break;
		case 3:
			Vestuario vest = new Vestuario();
			vest.printValues(value);;
			break;
		case 4:
			Cultura cult = new Cultura();
			cult.printValues(value);
			break;
		default:
			System.out.println("Valor inválido!");
		}
	}

}
