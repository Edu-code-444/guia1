package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float prom = (n1 + n2)/2;
		double aum = n1 * 0.2;
		double aum1 = n1 + aum;
		double dism = n1 * 0.3;
		double dism1 = n1 + dism;
		

		System.out.println("\n======== R E S U L T A D O S ========");
		System.out.println("Promedio......................: " + prom);
		System.out.println("1er número aumentado en 20%...: " + aum1);
		System.out.println("2do número disminuido en 30%..: " + dism1);

	}

}
