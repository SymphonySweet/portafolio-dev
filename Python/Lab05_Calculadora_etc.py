numero = int(input("Ingrese un número: "))
"""verifica si el número es par o impar"""
if numero % 2 == 0:
    print("El numero es par")
else:
    print("El numero es impar")

-------------------------------
operacion = input("Seleccione una operación (s = suma, r = resta, m = multiplicación, d = división): ")

numero_1 = int(input("Ingrese el dato 1: "))
numero_2 = int(input("Ingrese el dato 2: "))

if operacion == "s":
    print("Resultado:", numero_1 + numero_2)
elif operacion == "r":
    print("Resultado:", numero_1 - numero_2)
elif operacion == "m":
    print("Resultado:", numero_1 * numero_2)
elif operacion == "d":
    if numero_2 != 0:
        print("Resultado:", numero_1 / numero_2)
    else:
        print("Error: división por cero")
else:
    print("Operación no válida")

--------------------------------------

"""Ingresar el monto de la compra"""
monto = float(input("Ingrese el monto total de la compra (S/.): "))

"""Verificar si aplica el descuento"""
if monto > 1000:
    descuento = monto * 0.20
    total_pagar = monto - descuento
    print(f"Se aplicó un descuento de S/. {descuento:.2f}")
else:
    total_pagar = monto
    print("No se aplicó ningún descuento.")

"""Mostrar el total a pagar"""
print(f"El total a pagar es: S/. {total_pagar:.2f}")


--------------------------------------
"""Ingresar el monto de ventas"""
ventas = float(input("Ingrese el importe de ventas del empleado (S/.): "))

"""Calcular la comisión según el importe"""
if ventas < 100:
    comision = 0
elif 100 <= ventas <= 300:
    comision = ventas * 0.10
else:
    comision = ventas * 0.20

"""Mostrar la comisión"""
print(f"La comisión del empleado es: S/. {comision:.2f}")
