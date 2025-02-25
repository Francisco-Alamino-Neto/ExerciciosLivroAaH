package ExerciciosAaH;

import java.util.Scanner;

public class Problema4G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int C = sc.nextInt();
        
        System.out.print("Digite o valor de D: ");
        int D = sc.nextInt();
        
        // Realizando as 6 adições e 6 multiplicações
        // Adições
        int adc1 = A + B;
        int adc2 = A + C;
        int adc3 = A + D;
        int adc4 = B + C;
        int adc5 = B + D;
        int adc6 = C + D;
        
        // Multiplicações
        int mult1 = A * B;
        int mult2 = A * C;
        int mult3 = A * D;
        int mult4 = B * C;
        int mult5 = B * D;
        int mult6 = C * D;
        
        // Resultados das adições
        System.out.println("\nResultados das Adições:");
        System.out.println("A + B = " + adc1);
        System.out.println("A + C = " + adc2);
        System.out.println("A + D = " + adc3);
        System.out.println("B + C = " + adc4);
        System.out.println("B + D = " + adc5);
        System.out.println("C + D = " + adc6);
        
        // Resultados das multiplicações
        System.out.println("\nResultados das Multiplicações:");
        System.out.println("A x B = " + mult1);
        System.out.println("A x C = " + mult2);
        System.out.println("A x D = " + mult3);
        System.out.println("B x C = " + mult4);
        System.out.println("B x D = " + mult5);
        System.out.println("C x D = " + mult6);
        
        sc.close();
		
	}

}
