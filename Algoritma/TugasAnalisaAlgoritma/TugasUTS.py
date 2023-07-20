import random

i = 0
data = []
panjang_data = 20
while True:
    x = random.randint(0, 9)
    if x % 2 == 1:
        data.append(x)

    if len(data) > panjang_data:
        break


def soalPertama():
    data = [7, 5, 9, 6, 4, 6, 1, 2, 8, 9, 1]
    cari = input('Cari angka? ')
    y = 0
    for i in range(len(data)):
        if data[i] == int(cari):
            y += 1
            print(data[i], 'berada di index ke-', str(i + 1))
    print('Total ditemukan', y)


def soalKeDua():
    for i in range(-2, 10):
        print('Angka ke-', i)


def soalKeTiga():
    user = input('Masukan angka ganjil yang dicari: ')
    exists = 0
    for i in data:
        if i == int(user):
            exists += 1

    if exists != 0:
        print('Angka', user, ': Ditemukan')
        print('Total ditemukan:', exists)
    else:
        print('Angka', user, ': Tidak ditemukan')
        print('Total ditemukan:', exists)


def soalKeEmpat():
    for i in range(9):
        print('Perulangan ke-'+str(i) if i != 7 else 'Lewati')


def main():
    while True:
        print('''
======== Menu ========
1. Buatlah program untuk menemukan jumlah bilangan dalam satuan list [7,5,9,6,4,6,1,2,8,9,1]?
2. Buatlah kode program perulangan for untuk mencetak angka -2 s/d 9
3. Buatlah kode program phyton untuk mencari bilangan ganjil dengna For.
4. Buatlah program perulangan nilai variable angka 0 sampai 9 dengan syarat nilai 7 tidak ditampilkan
5. Keluar
======================
        ''')
        user = input("Pilih jawaban soal: ")
        try:
            user = int(user)
            if user == 5:
                run = False
                break
            else:
                run = True

            while run:
                match user:
                    case 1:
                        soalPertama()
                        break
                    case 2:
                        soalKeDua()
                        break
                    case 3:
                        soalKeTiga()
                        break
                    case 4:
                        soalKeEmpat()
                        break
                    case _:
                        print('Menu tidak tersedia')
        except:
            print('''
========== Peringatan ==========
Hanya boleh menginputkan angka
================================
        ''')


main()
