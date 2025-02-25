package exercicios2;

import java.util.Scanner;

public class ProblemaIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double alt, peso, imc;
		
		System.out.print("Peso: ");	
		peso = sc.nextDouble();
		
		System.out.println("Altura: ");
		alt = sc.nextDouble();

		imc = peso / (alt * alt);
		
		System.out.print("O IMC é: ");
		System.out.println(String.format("%.2f", imc));
		sc.close();
	}

}
