import math

def longitud_cerca(area_past):
    lado_past = math.sqrt(area_past)  # Calcula la longitud del lado del pasto (raíz cuadrada del área)
    longitud_cerca = lado_past * 4  # Calcula la longitud total de la cerca (4 veces el lado)
    return longitud_cerca

# Entrada del usuario: área del pasto
area_past = int(input())

# Calcula la longitud total de la cerca
longitud_total = longitud_cerca(area_past)

# Imprime el resultado con precisión de 10 decimales
print("{:.10f}".format(longitud_total))
