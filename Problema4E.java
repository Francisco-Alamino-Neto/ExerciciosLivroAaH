package exercicios2;

import java.util.Scanner;

public class Problema4E {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double prest, valor, taxa, temp;
		
		System.out.print("Digite o valor total do bem em atraso: ");
		valor = sc.nextDouble();
		
		System.out.print("Digite o valor da taxa: ");
		taxa = sc.nextDouble();
		
		System.out.println("Em meses, digite o tempo de atraso:");
		temp = sc.nextDouble();
		
		prest = valor + (valor * (taxa / 100) * temp);
		
		System.out.print("O valor de uma prestação do bem em atraso: ");
		System.out.println("R$ " + String.format("%.2f", prest));
		sc.close();
		
	}

}

