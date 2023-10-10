import java.util.Scanner; //lib untuk output

public class Mahasiswa{

    //deklarasi variabel
    int nim;
    String nama;
    String jenisKelamin;
    String alamat;

    //construct untuk di panggil di main
    public Mahasiswa(){
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    //method isiData
    public void isiData(int nim, String nama, String jenisKelamin, String alamat){
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    //method tampilData
    public void tampilData(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);

    }
    public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa();
    mhs1.isiData(2123,"Nasywa Sakha Ningrum", "Perempuan" , "Tangerang Selatan" );
    mhs1.tampilData();
    }

}
