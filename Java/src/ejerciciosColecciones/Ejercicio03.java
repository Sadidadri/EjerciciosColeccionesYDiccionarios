package ejerciciosColecciones;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * @author d18momoa
 *
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Declaracion del arraylist de numeros
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("Dame 10 numeros y lo ordenare");
		//for que introduce los 10 valores por teclado
		for(int i = 0; i<10;i++) {
			System.out.println("Introduzca el numero "+(i+1));
			int numeroIntroducido = entrada.nextInt();
			lista.add(numeroIntroducido);
		}
		//Orden que se encarga de ordenar el arraylist.
		lista.sort(null);
		//for que muestra el contenido de la lista.
		for(int i : lista) {
			System.out.print(i+"|");
		}
	}

}
