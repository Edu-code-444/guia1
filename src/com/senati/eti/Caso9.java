package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float l1 = 0, l2 = 0;
		
		System.out.print("Primer n�mero: ");
		l1 = sc.nextFloat();
		
		System.out.print("Segundo n�mero: ");
		l2 = sc.nextFloat();
		
		int area = (int) (l1 * l2);
		int perimetro = (int) ((l1*2) + (l2 *2));
		
		System.out.println("\n====================");
		System.out.println("Resultados");
		System.out.println("====================");
		System.out.println("�rea del rect�ngulo: " + area);
		System.out.println("Per�metro del rect�ngulo: " + perimetro);

	}

}
