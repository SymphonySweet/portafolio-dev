# Ejercicio 1 suma de números de dos cifras (del 10 al 99)
i = 10
suma = 0

while i <= 99:
    suma += i
    i += 1

print("La suma de todos los números de dos cifras es:", suma)

-------------------------------------------------
filas = int(input("Ingrese número de filas: "))
columnas = int(input("Ingrese número de columnas: "))

i = 1
while i <= filas:
    j = 1
    while j <= columnas:
        if i == 1 or i == filas or j == 1 or j == columnas:
            print("*", end=" ")
        else:
            print(" ", end=" ")
        j += 1
    print()
    i += 1
