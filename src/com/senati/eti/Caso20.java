package com.senati.eti;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Venta 1: ");
		int i1 = sc.nextInt();

		System.out.print("Venta 2: ");
		int i2 = sc.nextInt();

		System.out.print("Venta 3: ");
		int i3 = sc.nextInt();
		
		int total = i1 + i2 + i3;
		float inc = total * 0.42f;

		System.out.println("\n========= Resultados ==========");
		System.out.println("Venta...............: " + total);
		System.out.println("Incremento..........: " + inc);
		System.out.println("Venta incrementada..: " + (total + inc));
	}

}
