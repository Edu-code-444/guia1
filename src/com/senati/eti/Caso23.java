package com.senati.eti;

import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el nombre del producto: ");
		String pro = sc.nextLine();
		
		System.out.print("Ingrese el precio: ");
		float pre = sc.nextInt();

		System.out.print("Ingrese el cantidad: ");
		int cant = sc.nextInt();
		
		float total = pre * cant;
		float igv = total * 0.18f;
		float desc = total * 0.03f;

		System.out.println("\n========= Resultados ==========");
		System.out.println("Producto..: " + pro);
		System.out.println("Precio....: " + pre);
		System.out.println("Cantidad..: " + cant);
		System.out.println("Descuento.: " + desc);
		System.out.println("Subtotal..: " + total);
		System.out.println("     IGV..: " + igv);
		System.out.println("   Total..: " + (total + igv - desc));

	}

}
