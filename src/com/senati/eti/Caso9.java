package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float l1 = 0, l2 = 0;
		
		System.out.print("Primer número: ");
		l1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		l2 = sc.nextFloat();
		
		int area = (int) (l1 * l2);
		int perimetro = (int) ((l1*2) + (l2 *2));
		
		System.out.println("\n====================");
		System.out.println("Resultados");
		System.out.println("====================");
		System.out.println("Área del rectángulo: " + area);
		System.out.println("Perímetro del rectángulo: " + perimetro);

	}

}
