def battles_won(solar_systems, total_ships, finni_ships):
    finni_ships.sort()
    battles_won = 0

    for ships_in_system in finni_ships:
        if ships_in_system < total_ships:  
            battles_won += 1
            total_ships -= (ships_in_system + 1)  

    return battles_won

def main():
    
    solar_systems, total_ships = map(int, input().split())
    finni_ships = list(map(int, input().split()))

    
    print(battles_won(solar_systems, total_ships, finni_ships))

if __name__ == "__main__":
    main()
