package com.senati.eti;

import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nota 1: ");
		int n1 = sc.nextInt();

		System.out.print("Nota 2: ");
		int n2 = sc.nextInt();

		System.out.print("Nota 3: ");
		int n3 = sc.nextInt();
		
		float total = (n1 * 0.2f) + (n2 * 0.3f) + (n3 * 0.5f) ;

		System.out.println("\n========= Resultados ==========");
		System.out.println("Nota 1.....: " + n1);
		System.out.println("Nota 2.....: " + n2);
		System.out.println("Nota 3.....: " + n3);
		System.out.println("Nota final.: " + total);

	}

}
