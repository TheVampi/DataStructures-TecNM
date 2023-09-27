import datetime as fecha
import random
import time



#Aleatorios de los diferentes campos
def procesosRandom():
    return(random.randint(20,100))
def cpuRandom():
    return(random.randint(1,15))
def prioridadRandom():
    return(random.randint(1,10))
#def segundosRandom():
#   seg = int()
#    return(seg)

#Creando el archivo
with open("lab07\procesos.csv","w") as archivo:
    for i in range(1,procesosRandom()):
        #Sacando la hora actual del sistema
        ahora = fecha.datetime.now()
        horaActual = ahora.time()
        #Escribiendo
        linea = str(i)+","+str(horaActual)+","+str(cpuRandom())+","+str(prioridadRandom())+"\n"
        archivo.writelines(linea)
        time.sleep(random.randint(1,15))
    archivo.close()