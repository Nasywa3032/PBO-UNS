package week3;

import java.util.Scanner;

public class komisiSalesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pendapatan penjualan: Rp ");
        double pendapatan = input.nextDouble();
        double uangJasa = 0;
        double uangKomisi = 0;

        if (pendapatan <= 300000) {
            uangJasa = 10000;
            uangKomisi = 0.10 * pendapatan;
        } else if (pendapatan <= 500000) {
            uangJasa = 20000;
            uangKomisi = 0.15 * pendapatan;
        } else {
            uangJasa = 50000;
            uangKomisi = 0.20 * pendapatan;
        }

        double totalPendapatan = uangJasa + uangKomisi;

        System.out.println("Uang Jasa: Rp " + uangJasa);
        System.out.println("Uang Komisi: Rp " + uangKomisi);
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);

        input.close();
    }
}
