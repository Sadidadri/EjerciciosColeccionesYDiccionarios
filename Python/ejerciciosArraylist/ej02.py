'''
Created on 6 mar. 2019
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el maximo y el minimo de esos
numeros. El tamagno de la lista tambien sera aleatorio y podra oscilar entre 10
y 20 elementos ambos inclusive.
@author: d18momoa
'''
from random import randint

#Crea una variable tamagno que toma un valor aleatorio entre 10 y 20
tamagno = randint(10,20)
#Creacion lista
lista = []

#Un for que rellena la lista con elementos aleatorios
for x in range (tamagno):
    lista += [randint(0,100)]
print("La lista generada aleatoriamente es de tamagno "+str(lista.__len__())+":")
print(lista)
