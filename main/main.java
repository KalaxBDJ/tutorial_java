package main;

import java.util.Scanner;

import POO.e1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int modelo = 0;
		String marca = "2021";
		
		//Converto from String to Double
		Double marca2 = Double.parseDouble(marca);
		
		//Clase Scanner
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Hola bienvenido , Ingrese el modelo de su coche\n");
		modelo = scan.nextInt();
		System.out.println("Ingrese la marca de su coche\n");
		marca = scan.next();
			
		e1 coche = new e1(marca,modelo);
			
			
		
		
		System.out.println("\nEl Coche 1 Es de la marca : " + coche.marca + ", Y es modelo : " + coche.modelo + "\n");
		
		
		
	}

}
