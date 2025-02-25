package exercicios2;

import java.util.Scanner;

public class Problema4A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double C, F; //Celsius, Fahrenheit
		
		System.out.print("Digite a temperatura em Celsius: ");
		C = sc.nextDouble();
		
		F = C * 9 / 5 + 32; //Cálculo de conversão, Celsius para Fahrenheit
		
		System.out.print("A temperatura em Fahrenheit é: ");
		System.out.println(String.format("%.1f", F) + " °F");
		sc.close();
		
	}

}
