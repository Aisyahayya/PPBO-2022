package com.mycompany.ppbo_02_latihan3;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

public class PPBO_02_Latihan3 {
    String nim, nama, alamat;
    char jenisKelamin;

    PPBO_02_Latihan3(String nim, String nama, char jenisKelamin, String alamat){
            this.nim = nim;
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.alamat = alamat;
        }
    
    void cetakData() {
            System.out.println("Data Mahasiswa");
            System.out.println("NIM             : " + nim);
            System.out.println("Nama            : " + nama);
            System.out.println("Jenis kelamin   : " + jenisKelamin);
            System.out.println("Alamat          : " + alamat);
        }

    public static void main(String[] args) {
        PPBO_02_Latihan3 mhs = new PPBO_02_Latihan3("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        mhs.cetakData();
    }
}
