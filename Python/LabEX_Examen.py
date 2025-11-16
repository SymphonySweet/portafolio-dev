fila = 1  # Comienza desde la fila 1

while fila <= 10:  # Se repite hasta la fila 10
    print("* " * fila)  # Imprime tantos asteriscos como el número de la fila
    fila += 1  # Aumenta la fila en 1

--------------------------------------------------

import random  # Importamos la librería random

# Mostramos 100 números aleatorios usando un bucle for
for i in range(100):
    numero = random.randint(1, 1000)  # Genera un número aleatorio entre 1 y 1000
    print(f"Número {i+1}: {numero}")
