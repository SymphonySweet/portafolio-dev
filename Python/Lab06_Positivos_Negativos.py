nums = [4, 78, 9, 84]
for n in nums:
    print(nums)

---------------------------
suma = 0
for i in [1, 2, 3, 4]:
    suma = suma + i
print("La suma de los números de 1 a 4 es", suma)

----------------------------
n = int(input("¿Cuántos números deseas ingresar?: "))
suma = 0
for i in range(n):
    num = float(input(f"Ingrese el número {i+1}: "))
    suma += num
promedio = suma / n if n != 0 else 0
print("La suma es:", suma)
print("El promedio es:", promedio)

--------------------------
pares = impares = positivos = negativos = neutros = 0

for i in range(5):
    num = int(input(f"Ingrese el número {i+1}: "))

    if num % 2 == 0:
        pares += 1
    else:
        impares += 1

    if num > 0:
        positivos += 1
    elif num < 0:
        negativos += 1
    else:
        neutros += 1

print("Cantidad de pares:", pares)
print("Cantidad de impares:", impares)
print("Cantidad de positivos:", positivos)
print("Cantidad de negativos:", negativos)
print("Cantidad de neutros:", neutros)
