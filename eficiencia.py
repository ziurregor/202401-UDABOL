numNaves = int(input())
distancia = float(input())
eficiencias = {}
for _ in range(numNaves):
    nombre, velocidad, combustible = input().split()
    velocidad = float(velocidad)
    combustible = float(combustible)  
    tasaCombustible = combustible / velocidad
    eficiencia = velocidad / tasaCombustible
    eficiencias[nombre] = eficiencia
ganador = max(eficiencias, key=eficiencias.get)
print(ganador)