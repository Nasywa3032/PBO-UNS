package PraktekPBO;

import java.util.*;

class Barang {
    private String nama;
    private double harga;
    private int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            throw new IllegalArgumentException("Stok tidak mencukupi.");
        }
    }
}

public class PPBO_04_N0123225 {
    public static void main(String[] args) {
        List<Barang> daftarBarang = new ArrayList<>();
        daftarBarang.add(new Barang("Buku", 10.0, 50));
        daftarBarang.add(new Barang("Pensil", 2.0, 100));
        daftarBarang.add(new Barang("Penghapus", 1.0, 75));

        Scanner input = new Scanner(System.in);
        double totalHarga = 0;

        while (true) {
            try {
                System.out.println("Daftar Barang:");
                for (int i = 0; i < daftarBarang.size(); i++) {
                    Barang barang = daftarBarang.get(i);
                    System.out.println(i + 1 + ". " + barang.getNama() + " - Harga: " + barang.getHarga() + " - Stok: " + barang.getStok());
                }

                System.out.print("Pilih barang yang ingin dibeli (nomor): ");
                int pilihan = input.nextInt();
                assert pilihan >= 1 && pilihan <= daftarBarang.size() : "Pilihan tidak valid.";

                System.out.print("Jumlah yang ingin dibeli: ");
                int jumlah = input.nextInt();
                assert jumlah > 0 : "Jumlah harus lebih dari 0.";

                Barang barangDipilih = daftarBarang.get(pilihan - 1);

                if (jumlah <= barangDipilih.getStok()) {
                    barangDipilih.kurangiStok(jumlah);
                    double hargaBarang = barangDipilih.getHarga() * jumlah;
                    totalHarga += hargaBarang;
                    System.out.println("Barang " + barangDipilih.getNama() + " sejumlah " + jumlah + " berhasil dibeli.");
                    System.out.println("Total harga sementara: " + totalHarga);
                } else {
                    System.out.println("Maaf, stok tidak mencukupi.");
                }

                System.out.print("Ingin membeli barang lain? (y/n): ");
                String lanjut = input.next();
                if (!lanjut.equalsIgnoreCase("y")) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                input.nextLine(); // Membersihkan input yang salah
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Terima kasih telah berbelanja!");
        System.out.println("Total harga yang harus dibayar: " + totalHarga);

        input.close();
    }
}

