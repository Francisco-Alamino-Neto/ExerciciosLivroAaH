package exercicios2;

import java.util.Scanner;

public class Problema4F {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		int a = sc.nextInt();
		
		System.out.print("Digite o valor de b: ");
		int b = sc.nextInt();
		
		System.out.println("Antes da troca: a = " + a + ", b = " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		
		System.out.print("Após a troca de valores, a é: " + a + ", e b é: " + b);
		sc.close();
		
	}

}
