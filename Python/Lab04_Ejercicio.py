import math
print("Bienvenido a calculator")

# Línea comentada

""" Comentario"""

n1 = float(input("Ingrese un número para obtener RAIZ CUADRADA: "))
raiz = math.sqrt(n1)
print("\tRaiz cuadrada de " + str(n1) + " es: " + str(raiz))

--------------------------------------------------
i = 1
while i <= 5:
    j = i
    contador = 0
    while contador < i:
        print(j, end="   ")
        j += 1
        contador += 1
    print()
    i += 1
