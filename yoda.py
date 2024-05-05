s1, s2 = input(), input()

s1 = s1[::-1]
s2 = s2[::-1]

while len(s1) < len(s2):
    s1 += '0'
while len(s1) > len(s2):
    s2 += '0'

t1, t2 = '', ''

for i in range(len(s1)):
    if s1[i] >= s2[i]:
        t1 += s1[i]
    if s2[i] >= s1[i]:
        t2 += s2[i]

while len(t1) > 1 and t1[-1] == '0':
    t1 = t1[:-1]
while len(t2) > 1 and t2[-1] == '0':
    t2 = t2[:-1]

t1 = t1[::-1]
t2 = t2[::-1]

if len(t1) > 0:
    print(t1)
else:
    print("YODA")

if len(t2) > 0:
    print(t2)
else:
    print("YODA")
