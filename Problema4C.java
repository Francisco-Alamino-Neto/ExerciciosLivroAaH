package exercicios2;

import java.util.Scanner;

public class Problema4C {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vol, R, alt; //vol = volume, R = raio, alt = altura
		
		System.out.println("Em centímetros, digite os seguintes valores de uma lata de óleo:");
		
		System.out.print("Raio: ");
		R = sc.nextDouble();
		
		System.out.print("Altura: ");
		alt = sc.nextDouble();
	
		vol = 3.14159 * ((R * R) * alt); //Cálculo do volume da lata de óleo
		
		System.out.print("O volume da lata de óleo é: ");
		System.out.println(String.format("%.2f", vol) + " cm³");
		sc.close();
		
	}

}
