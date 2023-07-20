import time
import random

start_porgram = time.time()

def waktu(detik):
    menit = detik // 60
    detik = detik % 60
    if menit != 0.0 or menit != 0:
        print('Selesai', round(menit), 'menit', round(detik, 2), 'detik')
    else:
        print('Selesai', round(detik, 2), 'detik')

class Kontak:
    def __init__(obj, nama, nomor):
        obj.nama = nama
        obj.nomor = nomor
        obj.next = None
    
class Main:
    def __init__(obj):
        obj.head = None
        
    def add(obj, nama, nomor):
        kontak = Kontak(nama, nomor)
        if obj.head is None:
            obj.head = kontak
        else:
            tmp = obj.head
            while tmp.next is not None:
                tmp = tmp.next
            tmp.next = kontak

    def read(obj):
        tmp = obj.head
        print('-'*50)
        while tmp is not None:
            print('Nama :', tmp.nama, '\nNomor:', tmp.nomor)
            print('-'*50)
            tmp = tmp.next
        

kontak = Main()
nama = ['husni', 'ridho', 'farhan', 'tama', 'angel', 'sarah', 'febe']
nomor = ['081286748394', '081285739573', '081275859392', '081286738476', '08127683985', '081276835738', '081276537564']

for i in range(999999):
    kontak.add(nama[random.randint(0, (len(nama)-1))], nomor[random.randint(0, (len(nomor)-1))])
kontak.read()
waktu(time.time() - start_porgram)