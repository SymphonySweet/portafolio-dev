# Conjuntos
A = {1, 2, 5, 7, 8}
B = {2, 4, 6, 8}
C = {5, 9, 3, 7}
D = set()  # conjunto vacío

# Elemento 6 al conjunto C
C.add(6)

# Intersección de A y B asignada al conjunto D
D = A & B

# Imprimir la diferencia simétrica entre A y B
diferencia_simetrica = A ^ B

# Mostrar resultados
print("Conjunto C actualizado:", C)
print("Intersección A y B (asignada a D):", D)
print("Diferencia simétrica A y B:", diferencia_simetrica)
