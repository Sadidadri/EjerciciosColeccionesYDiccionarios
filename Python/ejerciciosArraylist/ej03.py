'''
Created on 6 mar. 2019
Escribe un programa que ordene 10 numeros enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.
@author: d18momoa
'''
#Declaracion variables
lista = []
tamagno = 10
#Un for que rellena el contenido de la lista
for x in range(tamagno):
    lista += [int(input("Introduzca el elemento "+str(x+1)+" de la lista:"))]
#Ordena la lista por tamagno
lista.sort()
#Muestra la lista
print(lista)