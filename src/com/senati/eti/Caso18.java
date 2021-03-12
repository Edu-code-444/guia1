package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese la altura: ");
		int h = sc.nextInt();
		
		System.out.print("Ingrese la base: ");
		int b = sc.nextInt();
		
		float area = b*h/2;

		System.out.println("\n========= Resultados ==========");
		System.out.println("Área del triángulo: " + area);

	}

}
