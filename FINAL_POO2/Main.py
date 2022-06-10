#Kenny Alejandro Garces Cabrera

import Pal_Cap

n=1

while n != 0:

    print("\n_____CAPICÚA & PALÍNDROMO_____\n")
    print("1.CAPICÚA")
    print("2.PALÍNDROMO")
    print("0.SALIR\n")
    n = int(input("Seleccione una opcion:"))
    if n == 1:
        C1 = Pal_Cap.Capicua(input("Ingrese la palabra a comprobar: "))
        C1.comprobarC()
        

    elif n == 2:
        P1 = Pal_Cap.palindromo(input("Ingrese la frase a comprobar: "))
        P1.comprobarP()

    else:
        break

