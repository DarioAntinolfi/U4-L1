package it.epicode.be;

import java.util.Scanner;

public class HelloWorld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		
		int a = 10;
		int b = 3;
		int c = a * b;
		System.out.println(c);
		
		String array [] = {"a", "b", "c", "d", "e", "f"};
		
		for (int i = 0; i<6; i++) {
			System.out.println(array[i]);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Come ti chiami?");
		String name = input.nextLine();
		System.out.println("Ciao " + name + " ^^");
		
		System.out.println("Quanto misura la base?");
		int base = input.nextInt();
		System.out.println("Quanto misura l'altezza?");
		int altezza = input.nextInt();
		int area = base * altezza;
		int perimetro = ( base + altezza ) * 2;
		System.out.println("L'area del rettangolo è " + area);
		System.out.println("Il perimetro del rettangolo è " + perimetro);
		input.close();
		
}}