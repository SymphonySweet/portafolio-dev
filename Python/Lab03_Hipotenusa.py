import math
print("Obtener hipotenusa")

cateto1 = int(input("Ingrese cateto a:\t"))
cateto2 = int(input("Ingrese cateto b:\t"))

hipotenusa = math.sqrt(math.pow(cateto1, 2) + math.pow(cateto2, 2))

print("El cateto A es: ", cateto1)
print("El cateto B es: ", cateto2)
print("La hipotenusa es: ", hipotenusa)

----------------------------------------------------------------
lista = [3,5,6,1,0,88]
print(lista[5])

for i in range (0,11,2):
    print(i)

numero = int(input("Ingrese el dato el numero de la tabla "))
for contador in range (1,10 + 1):
    resultado = numero * contador
    print (f"{numero} x {contador} = {resultado}")
    """f=formato interpolar variables dentro de una cadena de texto""""

    --------------------------------------

    numero = int(input("Ingrese la cantidad de numeros "))
    suma = 0
    for i in range (numero):
        numero = int(input(f"Ingrese el numero {i+1}: "))
        suma = suma + numero
    promedio = (suma / numero) if numero > 0 else 0
    print(f"La suma es {suma}")
    print(f"el promedio es {promedio}")
