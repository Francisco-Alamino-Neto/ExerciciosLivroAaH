package exercicios2;

import java.util.Scanner;

public class Problema4D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double temp, velockm, velocM, dist, litrosUsados;
		
		System.out.print("Em minutos, forneça o tempo gasto: ");
		temp = sc.nextDouble();
		
		System.out.print("Em km/h, forneça a velocidade média durante a viagem: ");
		velockm = sc.nextDouble();
		
		velocM = velockm / 60;
		
		dist = temp * velocM;
		
		litrosUsados = dist / 12;
		
		System.out.print("A distância percorrida foi: ");
		System.out.println(String.format("%.1f", dist) + " km");
		
		System.out.print("A quantidade de litros utilizadas durante a viagem foi: ");
		System.out.println(String.format("%.1f", litrosUsados) +" l");
		sc.close();	
	}

}
