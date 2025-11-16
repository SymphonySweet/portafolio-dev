cursos = ["Matemáticas", "Comunicación", "Física", "Electricidad", "Programación"]
promedios = [15.2, 13.5, 14.0, 12.8, 16.7]

print("Lista de cursos:")
print(cursos)
print("\nLista de promedios:")
print(promedios)

--------------------------------------

# Ejercicio 2:
numeros = []

for i in range(5):
    num = float(input(f"Ingrese el número {i+1}: "))
    numeros.append(num)

promedio = sum(numeros) / len(numeros)

print("Números ingresados:", numeros)
print("Promedio:", promedio)

---------------------------------------

# ejercicio 3: Mayor y menor de 5 números
numeros = []

for i in range(5):
    num = float(input(f"Ingrese el número {i+1}: "))
    numeros.append(num)

mayor = max(numeros)
menor = min(numeros)

print("Números ingresados:", numeros)
print("Número mayor:", mayor)
print("Número menor:", menor)


-----------------------------
# Ejercicio 4: Operaciones con 'n' números
numeros = []
n = int(input("¿Cuántos números desea ingresar? "))

i = 0
while i < n:
    num = float(input(f"Ingrese el número {i+1}: "))
    numeros.append(num)
    i += 1

suma = sum(numeros)
promedio = suma / n
mayor = max(numeros)
menor = min(numeros)

print("Números ingresados:", numeros)
print("Suma:", suma)
print("Promedio:", promedio)
print("Número mayor:", mayor)
print("Número menor:", menor)
