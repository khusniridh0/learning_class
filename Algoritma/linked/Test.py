def waktu(detik):
    menit = detik // 60
    detik = detik % 60
    if menit != 0.0 or menit != 0:
        print('Selesai', round(menit), 'menit', round(detik, 2), 'detik')
    else:
        print('Selesai', round(detik, 2), 'detik')

# Contoh penggunaan
detik = 96.51
waktu(detik)
