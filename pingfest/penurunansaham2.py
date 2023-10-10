# Membaca input N (jumlah elemen dalam array)
N = int(input())

# Inisialisasi variabel-variabel
panjang_penurunan_terpanjang = 1
panjang_penurunan_saat_ini = 1

# Membaca nilai saham pertama
saham_sebelumnya = int(input())

# Loop melalui array saham
for i in range(1, N):
    saham_sekarang = int(input())
    
    # Cek apakah nilai saham sekarang lebih kecil dari nilai saham sebelumnya
    if saham_sekarang < saham_sebelumnya:
        panjang_penurunan_saat_ini += 1
    else:
        # Perbarui nilai panjang_penurunan_terpanjang jika diperlukan
        panjang_penurunan_terpanjang = max(panjang_penurunan_terpanjang, panjang_penurunan_saat_ini)
        panjang_penurunan_saat_ini = 1
    
    # Perbarui nilai saham_sebelumnya
    saham_sebelumnya = saham_sekarang

# Perbarui nilai panjang_penurunan_terpanjang setelah keluar dari loop
panjang_penurunan_terpanjang = max(panjang_penurunan_terpanjang, panjang_penurunan_saat_ini)

# Keluarkan hasil
print(panjang_penurunan_terpanjang)
