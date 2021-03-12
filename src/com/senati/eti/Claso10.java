package com.senati.eti;

import java.util.Scanner;

public class Claso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float r = 0;
		
		System.out.print("Radio del círculo: ");
		r = sc.nextFloat();
		
		float area = (float) (3.1416 * Math.pow(r, 2));
		float peri = (float) (2 * 3.1416 * r);
		
		System.out.println("\n====================");
		System.out.println("Resultados");
		System.out.println("====================");
		System.out.println("Área del círculo: " + area);
		System.out.println("Perímetro del círculo: " + peri);

	}

}
