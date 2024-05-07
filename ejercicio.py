d= {}
n,q = [int(i) for i in input().split()]
restart = 0
for i in range(q):
    a,*b = input().split()
    if a=="PRINT":
        try:
            print(d[b[0]])
        except:
            print(restart)
    elif a=="SET":
        d[b[0]]=b[1]
    elif a=="RESTART":
        restart = int(b[0])
        d = {}
        
