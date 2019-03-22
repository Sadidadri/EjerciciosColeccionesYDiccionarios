package ejerciciosColecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 * @author d18momoa
 *
 */
public class Ejercicio10 {
	static HashMap<String,String> diccionario = new HashMap<String,String>();
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Introducce valores en el diccionario
		diccionario.put("vida", "life");
		diccionario.put("casa", "house");
		diccionario.put("llave", "key");
		diccionario.put("alto", "high");
		diccionario.put("cabeza", "head");
		diccionario.put("bajo", "low");
		diccionario.put("cuerpo","body");
		diccionario.put("ordenador", "computer");
		diccionario.put("cascos", "headphones");
		diccionario.put("raton", "mouse");
		diccionario.put("teclado", "keyboard");
		diccionario.put("pantalla", "screen");
		diccionario.put("boton", "button");
		diccionario.put("gente", "people");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("pajaro", "bird");
		diccionario.put("ardilla", "squirrel");
		diccionario.put("pescado", "fish");
		diccionario.put("carne", "meat");
		
		System.out.println("Introduzca alguna de las siguientes palabras para conocer su traduccion:");
		//for que recorre y ensegna las llaves del diccionario
		for(Map.Entry pareja: diccionario.entrySet()) {
			System.out.print(pareja.getKey()+"|");
		}
		System.out.println();
		String respuesta = entrada.nextLine();
		
		try {
			System.out.println("La palabra elegida en ingles es: "+devuelveTraduccion(respuesta));
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	/**
	 * Metodo que devuelve la traduccion al ingles de la palabra introducida
	 * @param respuesta: es la palabra introducida por el usuario en espagnol.
	 * @return La palabra en ingles.
	 * @throws PalabraNoEncontradaException: Cuando la palabra introducida no se encuentra dentro del diccionario.
	 */
	public static String devuelveTraduccion(String respuesta) throws PalabraNoEncontradaException{
		boolean esCorrecto = false;
		for(Map.Entry pareja: diccionario.entrySet()) {
			if(pareja.getKey().equals(respuesta)) {
				esCorrecto = true;
			}
		}
		if(!esCorrecto) {
			throw new PalabraNoEncontradaException("Error, la palabra introducida no corresponde con alguna del diccionario");
		}	
		else {
			return diccionario.get(respuesta);
		}
		
	}
}
