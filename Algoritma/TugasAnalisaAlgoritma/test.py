# soal pertama
data = [7,5,9,6,4,6,1,2,8,9,1]
print(sum(data))

# Soal petama
data = [7,5,9,6,4,6,1,2,8,9,1]
cari = input('Angka yang di cari? ')
for i in range(len(data)):
    if data[i] == int(cari):
        print(data[i])

# Soal ke dua
i = -2
while i <= 9:
    print(i)
    i = i + 1

# soal ke tiga
for i in range(20):
    if i%2 == 1:
        print(i)

# soal ke empat
for i in range(9):
    if i != 7:
        print(i)