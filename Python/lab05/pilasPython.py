import time

#with open('historial.dat', 'r') as archivo:
#    contenido = archivo.read()
#    print (contenido)

# Otro ejemplo linea por linea (deja espacios entre las lineas)
#with open('historial.dat', 'r') as	archivo:
#    for linea in archivo:
#        print(linea.strip()) #Strip quita espacios entre las lineas, izquierda y derecha




class Historial():
    def push(self,rutaArchivo, pagina):
        with open(rutaArchivo, 'a+') as	archivo:
            archivo.write(pagina)  #Operacion de push
            archivo.close()
    def pop(self,rutaArchivo):
        #Abrimos primero el archivo
        with open(rutaArchivo,'r') as	archivo:
            todasLineas = archivo.readlines()
        #Eliminando la ultima linea:
        todasLineas = todasLineas [:-1] #El : en un slice especifica un rango en la forma inicio:fin. Si se omite inicio, se asume que es el principio de la lista. Si se omite fin, se asume que es el final de la lista. El -1 es un índice que representa el último elemento de la lista.
        #Volvemos a escribir todo el archivo ahora sin la ultima linea
        with open(rutaArchivo,'w') as	archivo:
            for linea in todasLineas:
                archivo.write(linea)
            archivo.close()

#Haciendo uso del historial enfocado en la pila
obj1 = Historial()
#Quitamos primero la ultima direccion para agregar la nueva
obj1.pop("lab05\historial.dat")
#Un retraso de 2 segundos
time.sleep(1) #Esta dado en segundos
#Agregamos a la pila la ultima (NUEVA) direccion
obj1.push("lab05\historial.dat","https://platzi.com")

time.sleep(3) #Delay para que se vea como se mete y saca otra pagina

#Ahora consultamos otra direccion
obj1.pop("lab05\historial.dat")
time.sleep(1) #Esta dado en segundos
obj1.push("lab05\historial.dat","https://udemy.com")