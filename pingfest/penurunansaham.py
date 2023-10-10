# Membaca input N
N = int(input())

# Inisialisasi variabel-variabel
max_decreasing_length = 1
current_decreasing_length = 1

# Membaca array saham pertama
prev_stock = int(input())

# Loop melalui array saham
for i in range(1, N):
    current_stock = int(input())
    
    # Cek apakah elemen saat ini lebih kecil dari elemen sebelumnya
    if current_stock < prev_stock:
        current_decreasing_length += 1
    else:
        # Perbarui nilai max_decreasing_length jika diperlukan
        max_decreasing_length = max(max_decreasing_length, current_decreasing_length)
        current_decreasing_length = 1
    
    # Perbarui nilai elemen sebelumnya
    prev_stock = current_stock

# Perbarui nilai max_decreasing_length setelah keluar dari loop
max_decreasing_length = max(max_decreasing_length, current_decreasing_length)

# Keluarkan hasil
print(max_decreasing_length)
