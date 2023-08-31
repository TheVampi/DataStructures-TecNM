U = {1,2,3,4,5,6,7,8,9,10,11,12,13,14}
A = {2,4,6,8,10,12,14}
B = {1,2,3,5,8,13}
C = {1,2,4,6,7,10,11,13}

#A union B
print(A | B)

#B intersection C
print (B & C)

#Complement C
print(U-C)

#B union C
print(B | C)

#A intersection C
print(A & C)

#Complement A
print(U - A)

#B - A
print(B - A)

# C - Complement B
print(C-(U-B))