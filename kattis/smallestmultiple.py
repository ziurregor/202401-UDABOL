def gcd(a, b):
    if b == 0:
        return a
    else:  
        return gcd(b, a % b) 

while True:
    try:
        ans = 1
        l = [int(i) for i in input().split()]
        for i in range(len(l)):
            a = ans
            b = l[i]
            while b:
                a, b = b, a % b
            ans = ans * l[i] // a
        print(ans)
    except:
        break