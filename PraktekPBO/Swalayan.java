package PraktekPBO;

// Nama : Nasywa Sakha Ningrum
// NIM  : N0123225

//variabel static (variabel class)
 
//Variabel Non-Static (varaibel sinstance)

//Variabel lokal
public class Swalayan {
    // Array Barang
    private Barang[] daftarBarang;
    
    // Variabel Static
    private static int jumlahTransaksi = 0;
    
    // Variabel Non-Static
    private int uangKas;
    
    // Konstanta Pajak Pertambahan Nilai
    private static final double PAJAK = 0.11;
    
    // Konstruktor untuk inisialisasi toko
    public Swalayan(Barang[] daftarBarang, int uangKas) {
        this.daftarBarang = daftarBarang;
        this.uangKas = uangKas;
    }
    
    // Method jualBarang untuk melakukan transaksi penjualan
    public void jualBarang(String namaBarang, int jumlahBeli) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equals(namaBarang)) {
                if (barang.getStok() >= jumlahBeli) {
                    // Mengurangkan stok barang yang dibeli
                    barang.kurangiStok(jumlahBeli);
                    
                    // Menghitung total belanjaan (termasuk pajak)
                    double totalBelanja = barang.getHarga() * jumlahBeli * (1 + PAJAK);
                    
                    // Menambah uang kas toko
                    uangKas += totalBelanja;
                    
                    // Menambah jumlah transaksi
                    jumlahTransaksi++;
                    
                    // Menghitung kembalian
                    double kembalian = totalBelanja - (barang.getHarga() * jumlahBeli);
                    
                    // Menampilkan struk transaksi
                    System.out.println("Barang: " + namaBarang);
                    System.out.println("Jumlah: " + jumlahBeli);
                    System.out.println("Total Belanja: " + totalBelanja);
                    System.out.println("Kembalian: " + kembalian);
                    System.out.println("Transaksi berhasil!");
                    return;
                } else {
                    System.out.println("Stok barang tidak mencukupi!");
                    return;
                }
            }
        }
        
        System.out.println("Barang tidak ditemukan!");
    }
    
    // Method restokBarang untuk melakukan restok barang
    public void restokBarang(String namaBarang, int jumlahRestok) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equals(namaBarang)) {
                // Menambah stok barang yang di-restok
                barang.tambahStok(jumlahRestok);
                System.out.println(namaBarang + " berhasil di-restok sebanyak " + jumlahRestok + " barang.");
                return;
            }
        }
        
        System.out.println("Barang tidak ditemukan!");
    }
    
    // Method untuk menampilkan jumlah uang kas toko
    public void tampilkanUangKas() {
        System.out.println("Uang Kas Toko: " + uangKas);
    }
    
    // Method untuk menampilkan jumlah transaksi
    public static void tampilkanJumlahTransaksi() {
        System.out.println("Jumlah Transaksi: " + jumlahTransaksi);
    }
    
    public static void main(String[] args) {
        // Contoh inisialisasi daftar barang
        Barang[] daftarBarang = {
            new Barang("Barang1", 100, 10),
            new Barang("Barang2", 200, 20),
            new Barang("Barang3", 50, 5)
        };
        
        // Inisialisasi toko
        Toko toko = new Toko(daftarBarang, 1000);
        
        // Contoh transaksi
        toko.jualBarang("Barang1", 3);
        toko.jualBarang("Barang2", 2);
        
        // Contoh restok barang
        toko.restokBarang("Barang1", 5);
        
        // Menampilkan jumlah uang kas dan jumlah transaksi
        toko.tampilkanUangKas();
        Toko.tampilkanJumlahTransaksi();
    }
}

class Barang {
    private String nama;
    private int harga;
    private int stok;
    
    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }
    
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }
}