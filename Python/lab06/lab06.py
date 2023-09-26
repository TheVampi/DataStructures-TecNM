import pandas as libPandas
import openpyxl as openpyxl

allData = libPandas.read_excel("music.xlsx")
print(allData.first_valid_index)

class Music():
    def __init__(self):
        album = []
        year = []
        album = []
        artist = []
        genre = []
        subgenre = []

    def llenar(self,unaRuta):