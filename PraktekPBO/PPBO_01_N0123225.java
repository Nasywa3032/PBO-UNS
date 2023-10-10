//package
package PraktekPBO;

// Nama : Nasywa Sakha Ningrum
// NIM  : N0123225

import java.util.Scanner;

public class PPBO_01_N0123225 {
        //Atribut 
        private String brandLaptop;
        private int hargaLaptop;
        private String warnaLaptop;

        //constructor
        public PPBO_01_N0123225 (String brandLaptop, int hargaLaptop, String warnaLaptop){
            this.brandLaptop = brandLaptop;
            this.hargaLaptop = hargaLaptop;
            this.warnaLaptop = warnaLaptop;
        }

        //method menampilkan komputer yang dimiliki
        public void menampilkan(){
            System.out.println("Laptop " + brandLaptop + " dengan harga " + hargaLaptop + " juta, dengan warna " + warnaLaptop );
        }

        public static void main(String[] args) {
            PPBO_01_N0123225  laptop1 = new PPBO_01_N0123225 ("Asus",4,"Hitam");
            laptop1.menampilkan();
        }
    }