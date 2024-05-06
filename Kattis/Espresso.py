def calcular_rellenados(n, S, pedidos):
    rellenados = 0
    agua_disponible = S

    for pedido in pedidos:
        cantidad, tipo = int(pedido[0]), pedido[1:]
        if tipo == 'L':
            cantidad += 1  # Sumar una onza adicional para café con leche
        if cantidad > agua_disponible:
            rellenados += 1
            agua_disponible = S  # Rellenar el tanque de agua
        agua_disponible -= cantidad

    return rellenados

def main():
    n, S = map(int, input().split())
    pedidos = [input().strip() for _ in range(n)]

    rellenados = calcular_rellenados(n, S, pedidos)
    print(rellenados)

if __name__ == "__main__":
    main()