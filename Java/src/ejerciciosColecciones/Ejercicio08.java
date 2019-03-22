package ejerciciosColecciones;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * @author d18momoa
 *
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		//Declaracion de la baraja y la pila de 10 cartas aleatorias
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		ArrayList<Carta> cartasEscogidas = new ArrayList<Carta>();
		
		//For que rellena el contenido de la baraja (40 naipes)
		for (Figura figura : Figura.values()) {
			for (Palo palo : Palo.values()) {
				baraja.add(new Carta(figura, palo));
			}
		}
		//Linea que se encarga de desordenar la baraja, para que no sea lo mismo
		Collections.shuffle(baraja);
		
		//For que escoge 10 cartas al azar
		for(int i=0;i<10;i++) {
			cartasEscogidas.add(baraja.get(i));
		}
		
		System.out.println("Nuestras 10 cartas son: ");
		for(Carta c : cartasEscogidas) {
			System.out.println(c);
		}
	}
}
