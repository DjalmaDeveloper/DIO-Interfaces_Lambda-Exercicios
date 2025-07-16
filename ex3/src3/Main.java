package src3;

import java.util.Scanner;

import models.Circle;
import models.Rectangle;
import models.Square;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha a forma que deseja usar:");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Círculo");
		int shape = sc.nextInt();
		switch (shape) {
			case 1:
				System.out.println("Informe o lado do quadrado:");
				double side = sc.nextDouble();
				Square sq = new Square(side);
				System.out.printf("Área: %s", sq.area());
				break;
			case 2:
				System.out.println("Informe a altura do retângulo:");
				double height = sc.nextDouble();
				System.out.println("Informe a largura do retângulo:");
				double width = sc.nextDouble();
				Rectangle rt = new Rectangle(height, width);
				System.out.printf("Área: %s", rt.area());
				break;
			case 3:
				System.out.println("Informe o raio do círculo:");
				double radius = sc.nextDouble();
				Circle cl = new Circle(radius);
				System.out.printf("Área: %s", cl.area());
				break;
			default:
				System.out.println("Opção Inválida!");
		}
	}
}
