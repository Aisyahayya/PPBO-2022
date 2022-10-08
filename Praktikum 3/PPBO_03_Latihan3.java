/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ppbo_03_latihan3;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        /*for (int i = 1; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }*/
        for(int i = 0; i < 5; i++){
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab: Source code tersebut kurang tepat karena seharusnya sebuah array dimulai dengan index 0.
// Tetapi dalam source sode tersebut, index dimulai pada angka 1, yang dimana hal itu menyebabkan
// ruang yang berlebihan pada index dalam array tersebut.