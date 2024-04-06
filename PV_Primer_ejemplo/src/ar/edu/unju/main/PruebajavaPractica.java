package ar.edu.unju.main;

import java.util.Scanner;

public class PruebajavaPractica {

	public static void main(String[] args) {
		int anio = 2028 ;
		String saludo = "hola pv"; // declaracion de la variabla
		System.out.println(saludo + " " + anio); // muestra lo que declaramos en la variable 
								//el + es para concatenar las variables y si ponemos " " se agrega un espacio 	
		if ( anio <= 2024 ) {
			System.out.println("Año correcto");
		} else {
			System.out.println("el años es incorrecto");
		}
		int tamanio = saludo.length(); 
		//for (int i = 0; 1 < tamanio ; i ++) {
		//System.out.println(saludo.charAt(i));
		//}
		int indice = 0;
		while (indice < tamanio) {
		System.out.println(saludo.charAt(indice));
			indice++;  
		}
	Scanner teclado = new Scanner(System.in); // es para que podamos tomar lectura del telcado
	System.out.println("ingrese un nombre");
	String nombre = teclado.next();
	System.out.println("Hola"+ " " + nombre);
	}
}