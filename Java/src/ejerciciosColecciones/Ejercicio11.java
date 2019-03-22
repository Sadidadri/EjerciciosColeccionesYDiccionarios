package ejerciciosColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Realiza un programa que escoja al azar 5 palabras en español 
 * del minidiccionario del ejercicio anterior. El programa irá 
 * pidiendo que el usuario teclee la traducción al inglés de cada 
 * una de las palabras y comprobará si son correctas. Al final, 
 * el programa deberá mostrar cuántas respuestas son válidas y 
 * cuántas erróneas.
 * 
 * @author d18momoa
 */

public class Ejercicio11 {
	static HashMap<String,String> diccionario = new HashMap<String,String>();
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Arraylist que contendra todas las palabras en espagnol
		ArrayList<String> recogeLLaves = new ArrayList<String>();
		
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
		
		//for que recoge las palabras espagnoles
		for(Map.Entry pareja: diccionario.entrySet()) {
			recogeLLaves.add((String) pareja.getKey());
		}
		Collections.shuffle(recogeLLaves);
		
		System.out.println("Vamos a jugar a un juego de traduccion espagnol - ingles:");
		int aciertos = 0;
		for(int i = 0;i<5; i++) {
			System.out.println("Ronda "+(i+1));
			System.out.println("Introduzca la traduccion de "+recogeLLaves.get(i));
			String respuesta = entrada.nextLine();
			if (respuesta.equals(diccionario.get(recogeLLaves.get(i)))) {
				aciertos++;
				System.out.println("Correcto!");
			}
			else {
				System.out.println("Fallaste :(");
			}
		}
		
		System.out.println("En total has acertado: "+aciertos);
		System.out.println("Y has fallado "+(5-aciertos));
	}

}
