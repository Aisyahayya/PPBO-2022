package com.mycompany.ppbo_04_latihan3;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan3 {
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
                //double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
                int hasil = bil1 / bil2;
                
                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            } 
            // Tambahkan catch statement tambahan di sini
            catch (ArithmeticException e){
                System.out.println("Pembagian dengan 0 tidak diperbolehkan!");
            } 
        }

        sc.close();
    }
}

// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// tambahan untuk menangani pembagian dengan 0 pada source code tersebut!

/*
    Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
    tambahan untuk menangani pembagian dengan 0 pada source code tersebut!
    => catch (ArithmeticException e){
            System.out.println("Pembagian dengan 0 tidak diperbolehkan!");
       }

    Selain catch statement tambahan untuk menangani pembagian 0, terdapat bagian source code yang diganti, yaitu :
    
    double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

    menjadi :

    int hasil = bil1 / bil2;

    Hal tersebut dikarenakan, apabila tipe data dari variabel hasil adalah double, maka pembagian dengan 0 masih dapat
    dilakukan. Sehingga exception tidak akan terjadi.
*/

