# Lectura de entrada
numeros = list(map(int, input().split()))
orden_deseado = input().strip()

# Ordenamiento
orden = {'A': min(numeros), 'B': 0, 'C': max(numeros)}
orden['B'] = sum(numeros) - orden['A'] - orden['C']

# Generación de salida
resultado = [orden[l] for l in orden_deseado]
print(*resultado)
