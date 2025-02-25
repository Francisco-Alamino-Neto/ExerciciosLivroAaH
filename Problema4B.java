package exercicios2;

import java.util.Scanner;

public class Problema4B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double C, F; //Celsius, Fahrenheit
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		F = sc.nextDouble();
		
		C = ((F - 32) * 5) / 9; //Cálculo de conversão, Fahrenheit para Celsius
		
		System.out.print("A temperatura em Celsius é: ");
		System.out.println(String.format("%.1f", C ) + " °C");
		sc.close();
		
	}

}
