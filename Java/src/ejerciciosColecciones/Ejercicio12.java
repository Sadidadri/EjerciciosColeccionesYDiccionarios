package ejerciciosColecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;

/**
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una estructura de la clase ArrayList que contiene objetos de la clase Carta.
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
 * → 3, rey → 4; el resto de cartas no vale nada.
 * 
 * @author d18momoa
 *
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		int puntosTotales = 0;
		
		//Declaramos dos arraylists y el EnumMap
		EnumMap<Figura, Integer> diccionario = new EnumMap<Figura, Integer>(Figura.class);
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		ArrayList<Carta> cartasEscogidas = new ArrayList<Carta>();
		//Agnadimos elementos dentro de nuestro diccionario asignando a cada carta su valor
		diccionario.put(Figura.AS, 11);
    diccionario.put(Figura.DOS, 0);
    diccionario.put(Figura.TRES, 10);
    diccionario.put(Figura.CUATRO, 0);
    diccionario.put(Figura.CINCO, 0);
    diccionario.put(Figura.SEIS, 0);
    diccionario.put(Figura.SIETE, 0);
    diccionario.put(Figura.ZOTA, 2);
    diccionario.put(Figura.CABALLO, 3);
    diccionario.put(Figura.REY, 4);
		//Ciclo que genera la baraja
		for (Figura figura : Figura.values()) {
			for (Palo palo : Palo.values()) {
				baraja.add(new Carta(figura, palo));
			}
		}
		//Desordeno la baraja de cartas
		Collections.shuffle(baraja);
		//For que obtiene las 5 cartas aleatorias
		for (int i = 0; i < 5; i++) {
			cartasEscogidas.add(baraja.remove(0));
		}
		for(Carta carta : cartasEscogidas) {
			System.out.println(carta);
			puntosTotales += diccionario.get(carta.getFigura());
		}
		System.out.println("Puntos totales: "+puntosTotales);
	}

}
