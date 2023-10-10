package PraktekPBO;

// Nama : Nasywa Sakha Ningrum
// NIM  : N0123225

//ArrayList dan Scanner juga masuk ke dalam metode
import java.util.ArrayList; //untuk menyimpan daftar buah dan sayur
import java.util.Scanner; //untuk menerima input dari pengguna

/*

Penjelasan singkat mengenai metode2 dalam program ini:

Berikut adalah penjelasan singkat tentang masing-masing metode tersebut:

.nextLine(): Metode untuk membaca input dari pengguna dalam bentuk teks menggunakan objek Scanner. 
Membaca satu baris teks dari input dan mengembalikan teks tersebut sebagai String.

.equalsIgnoreCase(): Metode untuk membandingkan dua String tanpa memperhatikan perbedaan huruf besar dan kecil (case-insensitive). 
Jadi, jika ingin memeriksa apakah dua String memiliki nilai yang sama maka metode ini tak peduli dengan huruf besar atau kecilnya.

.substring(): Metode untuk mengambil sebagian dari String, yg di inginkan agar program menjalankan string setelahnya untu di olah
Hasilnya adalah potongan String yang sesuai.

.startsWith(): Metode untuk memeriksa apakah suatu String dimulai dengan teks atau karakter tertentu. 
Metode ini mengembalikan nilai boolean, yaitu 
true jika String dimulai dengan teks atau karakter yang sesuai 
dan false jika tidak.

.matches(): Metode untuk melakukan pencocokan pola pada String tertentu.

.add(): dalam konteks umum, metode .add() untuk menambahkan elemen ke dalam koleksi seperti ArrayList. 

*/

public class PPBO_03_N0123225 {

    //deklarasi 2 ArrayKist kosong dengan nama buahList dan sayurList
    //di deklarasikan dengan variabel statis agar dapat diakses dari metode statis lainya dalam kelas yg sama
    public static ArrayList<String> buahList = new ArrayList<>();
    public static ArrayList<String> sayurList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input; // var input, untuk menyimpan input dari pengguna
        
        //loop do-wgile akan terus di jalankan selama proses di dalam do bernilai true
        do {
            System.out.print("Masukkan nama buah atau sayur (Ketik 'selesai' untuk keluar): ");
            //mengambil input pengguna dengan scanner.nextLine() dan menyimpannya dalam variabel input
            input = scanner.nextLine(); 

            //kondisional if. Kode di dalam blok ini akan dieksekusi jika input pengguna BUKAN "selesai."
                //.equalsIgnoreCase() digunakan untuk memeriksa input tanpa memperhatikan huruf besar atau kecil.
            if (!input.equalsIgnoreCase("selesai")) { 
                //menggunakan metode 1: CheckInput(), dimana var input menerima masukan dari user
                //CheckInput merupakan proses pemValidasian masukan dari user
                CheckInput(input); 
            }
            //kalo ketik "selesai" maka baris code dlm do-while akan berakhir
        } while (!input.equalsIgnoreCase("selesai")); 
        
        System.out.println("Daftar Buah:");
        PrintBuah(); //method 2: daftarbuah
        
        System.out.println("Daftar Sayur:");
        PrintSayur(); //method 3: daftarsayur

        scanner.close();
    }

    //method 1: CheckInput() untuk mengolah validasi inputan klasifikasi buah/sayur
    public static void CheckInput(String input) {

        //kondisi if yang pertama akan cek validasi dari masukan user dr kata 'Buah'
        if (input.startsWith("Buah ")) { // .startWith() untuk cek string 'Buah' kalau benar akan menjalankan baris kode dalam if
            String buahName = input.substring(5); //.subsString akan mengambil nilai potongan string dari .startWith() jika 'True'
            if (isValidInput(buahName)) { //method 2: isValidInput dengan parameter buahName
                AddBuah(buahName); //masuk ke method Addbuah jika parameter buahName 'True'
            } else {
                System.out.println("Input tidak valid."); 
                //kalimat akan di cetak jika string yg di input kan tidak sama 'B u a h'
                //jadi dari penulisan kapital dan huruf kecil serta banyak nya string yg di masukan mempengaruhi program selanjutnya
            }
        
        //sementara kondisi else if yang kedua akan cek validasi dari masukan user dr kata 'Sayur'
        } else if (input.startsWith("Sayur ")) { // .startWith() untuk cek string 'Sayur' kalau benar akan menjalankan baris kode dalam if
            String sayurName = input.substring(6);//.subsString akan mengambil nilai potongan string  dari .startWith() jika 'True'
            if (isValidInput(sayurName)) { //method 2: isValidInput dengan parameter sayurName
                AddSayur(sayurName); //masuk ke method 3: Addbuah jika parameter sayurName 'True'
            } else {
                System.out.println("Input tidak valid.");
                //kalimat akan di cetak jika string yg di input kan tidak sama 'S a y u r'
                //jadi dari penulisan kapital dan huruf kecil serta banyak nya string yg di masukan mempengaruhi program selanjutnya
            }
        } else {
            System.out.println("Input tidak valid.");
        }
    }
    
    //method static 2: isValidInput untuk cek string dari user apakah sesuai dengan kata 'Buah' dan 'Sayur'
    public static boolean isValidInput(String input) { //parameter input
        return input.matches("[a-zA-Z\\s]+"); //pencocokan pola
    }
    
    //method static 3: AddBuah
    public static void AddBuah(String buahName) { //parameter buahName
        buahList.add(buahName); // .add() akan menambahkan masukan dr var buahName ke dalam ArrayLsit buahList
        
        //meberikan info bahwa user berhasil memasukan 'buahName' ke dalam ArrayList pada buahList
        System.out.println("Buah " + buahName + " telah ditambahkan."); 
    }
    
    //method static 4: AddSayur
    public static void AddSayur(String sayurName) { //parameter sayurName
        sayurList.add(sayurName); //.add() akan menambahkan masukan dr var sayurName ke dalam ArrayLsit sayurList
        
        //meberikan info bahwa user berhasil memasukan 'sayurName' ke dalam ArrayList pada sayurList
        System.out.println("Sayur " + sayurName + " telah ditambahkan.");
    }
    
    //method static 5: PrintBuah
    public static void PrintBuah() { 
        for (String buah : buahList) { //for (type variableName : arrayName) 
            //buah akan menjadi nama/nilai dalam akses iterasi yg ada di dlm buahList

            System.out.println("Buah " + buah);
        }
    }
    
    //method static 6: PrintSayur
    public static void PrintSayur() {
        for (String sayur : sayurList) { //for (type variableName : arrayName) 
            //sayur akan menjadi nama/nilai dalam akses iterasi yg ada di dlm sayurList
            System.out.println("Sayur " + sayur);
        }
    }
}