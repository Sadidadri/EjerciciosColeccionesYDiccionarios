#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Created on 15 mar. 2019
Realiza un programa que escoja al azar 5 palabras en espa�ol del minidiccionario del ejercicio anterior. El programa ira pidiendo que el usuario
teclee la traduccion al ingles de cada una de las palabras y comprobara si
son correctas. Al final, el programa debera mostrar cuantas respuestas son
validas y cuantas erroneas.
@author: d18momoa
'''
import random
minidiccionario =  {
                   "ensalada":"salad","cancion":"song","mundo":"world","grande":"big",
                   "comida":"food","mapa":"map","saltar":"jump","comer":"eat",
                   "rapido":"fast","enfadado":"angry","alegre":"happy","juego":"game",
                   "torre":"tower","mar":"sea","sol":"sun","flor":"flower",
                   "mesa":"table","silla":"chair","ventana":"window","nevera":"freezer"
                   }
lista =[]
#For que recorre las llaves(keys) del diccionario y las convierte a lista
for x,y in minidiccionario.items():
    lista += [x]
print(lista)
#Creamos la lista que va a tener los indices ya escogidos para evitar que se repitan
numerosYaCogidos = []
#Aqui tenemos una lista que recogera 5 palabras aleatorias de la lista del diccionario
palabrasAleatorias = []
#For que recoge una palabra en cada pasada
for x in range(0,5):
    numero = None
    repetido = True
    #Bucle while que se repite si la palabra es repetida
    while(repetido):
        repetido = False
        #Obtiene un numero aleatorio del 0 al 19
        numero = int(random.randint(0,19))
        #For que comprueba que esta ya escogida la palabra, y en caso de que si se repite el while
        for y in numerosYaCogidos:
            if(y == numero):
                repetido = True
    numerosYaCogidos += [numero]
    palabrasAleatorias += [lista[numero]]  


pruebas = 5
aciertos = 0
print("Vamos a jugar a un juego.")
print("Mostrare una palabra en la pantalla y tienes que meter su correspondiente traduccion.")
print("Al final te mostrare cuantas traducciones acertaste")

for x in range(0,5):
    print(palabrasAleatorias[x])
    respuesta = input("Traduccion:\n")
    if(respuesta == minidiccionario.get(palabrasAleatorias[x])):
        aciertos += 1
        print("Acierto!")
    else:
        print("Fallo :(")
print("Has acertado "+str(aciertos)+" palabras")        
        
