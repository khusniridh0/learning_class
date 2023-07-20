# # Soal petama
# def soal_satu():
#     print('Buatlah program untuk menemukan jumlah bilangan dalam satuan list [7,5,9,6,4,6,1,2,8,9,1]?\n')
#     data = [7,5,9,6,4,6,1,2,8,9,1]
#     cari = input('Angka yang di cari? ')
#     x = 0
#     for i in data:
#         if i == int(cari):
#             x += 1

#     if x != 0:
#         print('data dicari:', cari)
#         print('Data ditemukan:', x)
#     else:
#         print('data tidak di temukan')

# # Soal ke dua
# def soal_dua():
#     print('Buatlah kode program perulangan for untuk mencetak angka -2 s/d 9\n')
#     for i in range(-2, 10):
#         print(i)

# # soal ke tiga
# def soal_tiga():
#     print('Buatlah kode program phyton untuk mencari bilangan ganjil dengna For.\n')
#     batas = int(input('Dalam range berapa: '))
#     for i in range(batas):
#         if i%2 != 0:
#             print(i)

# # soal ke empat
# def soal_empat():
#     print('Buatlah program perulangan nilai variable angka 0 sampai 9 dengan syarat nilai 7 tidak ditampilkan\n')
#     for i in range(9):
#         if i != 7:
#             print(i)

# def utama():
#     while True:
#         print('''
# ======== Menu ========

# 1. Soal Pertama
# 2. Soal ke Dua
# 3. Soal ke Tiga
# 4. Soal ke Empat
# 5. Keluar
# ======================
#         ''')
#         user = int(input("Pilih jawaban soal: "))

#         if user == 1:
#             soal_satu()
#         elif user == 2:
#             soal_dua()
#         elif user == 3:
#             soal_tiga()
#         elif user == 4:
#             soal_empat()
#         elif user == 5:
#             break
#         else:
#             print('Menu tidak tersedia')

#         cons = input('Pilih Soal Lain ? (y/n) :')
#         if cons.lower() != 'y':
#             break
# utama()

# Mencari bilangan ganjil dari input pengguna
odd_numbers = []
while True:
    user_input = input("Masukkan bilangan (atau 'selesai' untuk mengakhiri): ")
    if user_input.lower() == "selesai":
        break
    number = int(user_input)
    if number % 2 != 0:
        odd_numbers.append(number)

# Menampilkan bilangan ganjil menggunakan loop for
print("Bilangan ganjil yang diinputkan:")
for number in odd_numbers:
    print(number)

# Mencari nilai dalam daftar bilangan ganjil
search_number = int(input("Masukkan bilangan yang ingin Anda cari: "))
if search_number in odd_numbers:
    print(f"Bilangan {search_number} ditemukan dalam daftar bilangan ganjil.")
else:
    print(
        f"Bilangan {search_number} tidak ditemukan dalam daftar bilangan ganjil.")
