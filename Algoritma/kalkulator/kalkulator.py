import re

def hitung(opp, n1, n2):
  if opp == '+':
    print(n1, 'Tambah', n2, '=', n1+n2)
  elif opp == '-':
    print(n1, 'Kurang', n2, '=', n1-n2)
  elif opp == '*':
    print(n1, 'Kali', n2, '=', n1*n2)
  elif opp == '/':
    print(n1, 'Bagi', n2, '=', n1/n2)
  elif opp == '%':
    print(n1, 'Modulus', n2, '=', n1%n2)
  elif opp == '**':
    print(n1, 'Pangkat', n2, '=', n1**n2)
  else:
    print('Ndak ada itu, isi lah yang bener')


ints = '40 + 21 - 25 * 65 / 20 ^ 2 % 3'
inst = ints.replace(" ", "")
strings = re.findall(r"\d+", ints)
opp = []
for i in re.findall(r"\D", ints):
    if i != ' ':
      opp.append(i)




print(strings)
print(opp)

# print('Operasi matematik yang tersedia')
# print('=' * 25)
# print('  [1] Tambah')
# print('  [2] Kurang')
# print('  [3] Kali')
# print('  [4] Bagi')
# print('  [5] Modulus')
# print('  [6] Pangkat')
# print('=' * 25)
# print('\n')
# operasi = input('Pilih operasi matematik (1/2/3/4/5/6) : ')
# print('\n')
# val_1 = eval(input('Masukkan bilangan pertama : '))
# val_2 = eval(input('Masukkan bilangan kedua : '))
# print('\n')
# hitung(operasi, val_1, val_2)