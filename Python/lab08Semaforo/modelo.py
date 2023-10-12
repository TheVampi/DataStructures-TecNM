import random

#Numero de peatones aleatorios para encolar
def addPeaton():
    return(random.randint(1,5))

#Numero de carros aleatorios para encolar
def addCarro():
    return(random.randint(1,5))

#Bucle para peatones llegando
colaPeatones = []
condicion = true
