class Historial:
    def __init__(self):
            self.paginas = []

    def visitarPaginas(self,pagina):
        self.paginas.append(pagina)

    def retroceder(self):
        self.paginas.pop()

#Creando el objeto
historial = Historial()
#Agregando paginas al historial (pila)
historial.visitarPaginas("facebook.com")
historial.visitarPaginas("google.com")
historial.visitarPaginas("nec.com")


for i in historial.paginas:
    print(i)

historial.retroceder()

for i in historial.paginas:
    print(i)