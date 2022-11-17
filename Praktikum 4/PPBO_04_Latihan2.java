package com.mycompany.ppbo_04_latihan2;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
/* Jawab: 
    Pada source code ini, program akan menangkap input mismatch exception kemudian mengeluarkan output 
    "Input salah, masukkan angka". Setelah itu program akan kembali menjalankan source code yang ada di
    dalam try{}, sehingga program dapat tetap berjalan. Berbeda dengan source code sebelumnya, dimana 
    akan terjadi input mismatch exception, karena tidak ada yang menangani exception tersebut.
*/