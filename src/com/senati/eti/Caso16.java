package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("Ingrese hora trabajadas: ");
		int horas = sc.nextInt();

		System.out.print("Ingrese tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		float paga = horas * tarifa;
		float bono = paga * 0.05f;
		float total = paga + bono;
		
		System.out.println("\n========= Resultados ==========");
		System.out.println("Sueldo...........: " + df.format(paga));
		System.out.println("Bono.............: " + df.format(bono));
		System.out.println("Total............: " + df.format(total));
		System.out.println("Total en dólares.: " + df.format(total/3.24f));
		

	}

}
