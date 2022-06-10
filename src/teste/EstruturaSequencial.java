package teste;

import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		double a1, a2, a3, soma;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a 1 altura:");
		a1 = entrada.nextDouble();
		System.out.println("Digite a 2 altura:");
		a2 = entrada.nextDouble();
		System.out.println("Digite a 3 altura:");
		a3 = entrada.nextDouble();
		soma = (a1+a2+a3)/3;
		System.out.println("As alturas digitados foram: " + a1 + ", " + a2 + " e " + a3 + ". A media das alturas e: " + soma);
		entrada.close();
	}

}
