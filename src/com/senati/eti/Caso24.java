package com.senati.eti;

import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Monto 1: ");
		int m1 = sc.nextInt();

		System.out.print("Monto 2: ");
		int m2 = sc.nextInt();

		System.out.print("Monto 3: ");
		int m3 = sc.nextInt();
		
		float cal1= (m1/5) + (m2*0.2f);
		float cal2= ((m3*0.6f) + m3)/2;
		float cal3= ((m1 + m2 + m3) - (m1 + m2 + m3) * 0.8f);
		
		System.out.println("\n========= Resultados ==========");
		System.out.println("Cálculo 1: " + cal1);
		System.out.println("Cálculo 2: " + cal2);
		System.out.println("Cálculo 2: " + cal3);
	}

}
