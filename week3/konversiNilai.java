package week3;

import java.util.Scanner;

public class konversiNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan skor_inputangka: ");
        int skor_input = input.nextInt(); //nextInt untuk tipe data dengan inputan integer

        double angaka = 0.0;
        String nilaiHuruf = "";

        if (skor_input >= 85 && skor_input <= 100) {
            angaka = 4.00;
            nilaiHuruf = "A";
        } else if (skor_input >= 80 && skor_input <= 84) {
            angaka = 3.70;
            nilaiHuruf = "A-";
        } else if (skor_input >= 75 && skor_input <= 79) {
            angaka = 3.30;
            nilaiHuruf = "B+";
        } else if (skor_input >= 70 && skor_input <= 74) {
            angaka = 3.00;
            nilaiHuruf = "B";
        } else if (skor_input >= 65 && skor_input <= 69) {
            angaka = 2.70;
            nilaiHuruf = "C+";
        } else if (skor_input>= 60 && skor_input<= 64) {
            angaka = 2.00;
            nilaiHuruf = "C";
        } else if (skor_input>= 55 && skor_input<= 59) {
            angaka = 1.00;
            nilaiHuruf = "D";
        } else {
            angaka = 0.00;
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Angka: " + angaka);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
    }

}
