'''
Created on 6 mar. 2019
Crea un mini-diccionario espagnol-ingles que contenga, al menos, 20 palabras
(con su correspondiente traduccion). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedira una palabra en espagnol
y dara la correspondiente traduccion en ingles.
@author: d18momoa
'''
#Creacion del diccionario con sus respectivas traducciones
minidiccionario =  {
                   "ensalada":"salad","cancion":"song","mundo":"world","grande":"big",
                   "comida":"food","mapa":"map","saltar":"jump","comer":"eat",
                   "rapido":"fast","enfadado":"angry","alegre":"happy","juego":"game",
                   "torre":"tower","mar":"sea","sol":"sun","flor":"flower",
                   "mesa":"table","silla":"chair","ventana":"window","nevera":"freezer"
                   }

print("Introduzca una de las siguientes palabras y te ensegnare su traduccion:")
#Un for que muestra las palabras que contienen el diccionario en espagnol
for x in minidiccionario:
    print(x+"|",end="")
print()
palabraElegida = None
#Bucle que no acaba hasta que el usuario meta una palabra valida
while(minidiccionario.get(str(palabraElegida)) == None):
    palabraElegida = input()
    if(minidiccionario.get(str(palabraElegida)) == None):
        print("No se ha podido encontrar esa palabra, comprueba que esta bien escrita")
    else:#La palabra es valida y se muestra su traduccion
        resultado = minidiccionario.get(str(palabraElegida))
        print("La traduccion de la palabra -"+str(palabraElegida)+"- es -"+resultado+"-")