package exercicios2;

import java.util.Scanner;

public class Problema4H {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vol, comp, larg, alt;
		
		System.out.print("Digite o comprimento da caixa: ");
		comp = sc.nextDouble();
		
		System.out.print("Digite a largura da caixa: ");
		larg = sc.nextDouble();
		
		System.out.print("Digite a altura da caixa: ");
		alt = sc.nextDouble();
		
		vol = comp * larg * alt;
		
		System.out.print("O volume da caixa é: ");
		System.out.println(String.format("%.2f", vol));
		sc.close();
	}

}
