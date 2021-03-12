package com.senati.eti;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese lado 1: ");
		int la1 = sc.nextInt();

		System.out.print("Ingrese lado 2: ");
		int la2 = sc.nextInt();

		System.out.print("Ingrese lado 3: ");
		int la3 = sc.nextInt();
		
		int peri = la1 + la2 + la3;

		System.out.println("\n========= Resultados ==========");
		System.out.println("Perímetro del triángulo: " + peri);
		

	}

}
