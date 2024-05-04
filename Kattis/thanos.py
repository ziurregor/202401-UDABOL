T = int(input())
i=0
anio = 0
tierra = []
while(i<T):
    aux = input().split()
    P,R,F=int(aux[0]),int(aux[1]),int(aux[2])
    x = F - P
    while(True):
        if x >= 0:
            anio+=1
        elif x < 0:
            break
        
        P = P * R
        x = F - P
    tierra.append(anio)
    anio = 0
    i+=1

for key in tierra:
    print(key)