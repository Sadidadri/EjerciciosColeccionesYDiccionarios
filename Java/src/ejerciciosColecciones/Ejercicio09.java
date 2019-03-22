package ejerciciosColecciones;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 * @author d18momoa
 *
 */
public class Ejercicio09 {

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
		//Linea que se encarga de ordenar las 10 cartas escogidas
		Collections.sort(cartasEscogidas);
		System.out.println("Nuestras 10 cartas ordenadas son: ");
		for(Carta c : cartasEscogidas) {
			System.out.println(c);
		}
	}
}
