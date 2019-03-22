package ejerciciosColecciones;

import java.util.ArrayList;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * @author d18momoa
 *
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		//Declaracion del arraylist de numeros
		ArrayList<Integer> lista = new ArrayList<Integer>();
		//Obtiene el tamagno de la lista entre 10 y 20
		int tamagnoLista = (int)(Math.random()*11 + 10);
		//Declaracion de las variables que se piden
		int maximo = -1;
		int sumatorio = 0;
		double media = 0;
		//For que rellena la lista de valores aleatorios y calcula el sumatorio y el maximo
		for(int i = 0; i<tamagnoLista;i++) {
			int numeroAleatorio = (int)(Math.random()*101);
			lista.add(numeroAleatorio);
			sumatorio += numeroAleatorio;
			if (maximo < numeroAleatorio) {
				maximo = numeroAleatorio;
			}
		}
		//Calculo de la media
		media = (double)sumatorio / lista.size();
		System.out.println("La lista contiene "+tamagnoLista+" numeros:");
		//For que muestra el contenido de la lista
		for(int i : lista) {
			System.out.print(i+"|");
		}
		//Resultado de los valores pedidos
		System.out.println("\nEl numero mayor es: "+maximo);
		System.out.println("Todos los numeros de la lista, suman: "+sumatorio);
		System.out.println("La media de los numeros escogidos es: "+media);
	}
}
