# EJERCICIO 1: Tupla con edades de 8 amigos
edades = (25, 28, 24, 23, 28, 29, 26, 30)

# Solicitar edad a buscar
edad_buscar = int(input("Ingrese la edad a buscar: "))

# Contar cuántos amigos tienen esa edad
cantidad = edades.count(edad_buscar)

# Mostrar resultado
print(f"Número de amigos con {edad_buscar} años: {cantidad}")

--------------------------------------------
# Ejercicio 2: Tupla con nombres de 10 amigos
nombres = ("Yubi", "Luis", "Brayan", "Joyce", "Kadir", "Annia", "Ariel", "Liliana", "Roger", "Paola")

# Solicitar índice al usuario
indice = int(input("Ingrese el índice del amigo (0 al 9): "))

# Validar índice y mostrar nombre correspondiente
if 0 <= indice < len(nombres):
    print(f"El nombre del amigo en la posición {indice} es: {nombres[indice]}")
else:
    print("Índice fuera de rango.")

----------------------------------------------
# Ejercicio 3: los 12 meses
meses = ("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
         "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre")

while True:
    numero = int(input("Ingrese el número del mes (1-12), o un número negativo/cero para salir: "))
    
    if numero <= 0:
        print("Fin del programa.")
        break
    elif 1 <= numero <= 12:
        print(f"El mes es: {meses[numero - 1]}")
    else:
        print("Número inválido. Debe estar entre 1 y 12.")

------------------------------------------------
#Ejercicios 4: Notas de estudiantes
notas = (8, 14, 19, 12, 10, 13, 10, 12, 11, 12,
         13, 12, 17, 19, 12, 14, 11, 8, 12, 16)

# Contar desaprobados (<13)
desaprobados = sum(1 for nota in notas if nota < 13)

# Contar aprobados (>=13)
aprobados = sum(1 for nota in notas if nota >= 13)

# Mostrar resultados
print(f"Número de desaprobados: {desaprobados}")
print(f"Número de aprobados: {aprobados}")
--------------------------------------------------
# Ejercicio 5: Ingresar 10 notas
listaNotas = []
for i in range(10):
    nota = float(input(f"Ingrese la nota {i+1}: "))
    listaNotas.append(nota)

# Convertir a tupla ordenada de mayor a menor
tuplaNotas = tuple(sorted(listaNotas, reverse=True))

# Convertir la tupla a una nueva lista
listaFinal = list(tuplaNotas)

# Calcular el promedio
promedio = sum(listaFinal) / len(listaFinal)

# Reemplazar notas <= 10 con el promedio
for i in range(len(listaFinal)):
    if listaFinal[i] <= 10:
        listaFinal[i] = promedio

# Mostrar notas finales
print("Notas finales:", listaFinal)
