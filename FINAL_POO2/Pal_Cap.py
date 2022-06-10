#Kenny Alejandro Garces Cabrera
class Pal_Cap:
    def __init__(self, palabra, frase ):
        self.palbra = palabra
        self.frase = frase


class palindromo(Pal_Cap):
    def __init__(self, frase ):
        self.frase = frase
    def comprobarP(self):
        if str(self.frase) == str(self.frase)[::-1] :
            print("\nLA PALABRA ES PALINDROMO\n")
        else:   
            print("\nLA PALABRA NO ES PALINDROMO\n") 


class Capicua(Pal_Cap):
    def __init__(self, palabra ):
        self.palabra = palabra
    def comprobarC(self):
        if str(self.palabra) == str(self.palabra)[::-1]:
            print("\nLA PALABRA ES CAPICUA\n")
        else:   
            print("\nLA PALABRA NO ES CAPICUA\n")     


        



