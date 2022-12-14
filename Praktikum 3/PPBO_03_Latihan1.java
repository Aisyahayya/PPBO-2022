package com.mycompany.ppbo_03_latihan1;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        double diskon = 0;
        
        // tambahkan code untuk menyimpan nominal total pembelian
        int nominal = sc.nextInt();
        System.out.println(nominal);
        
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if (nominal < 50000){
            diskon = 0;
        }
        else if (nominal <= 75000){
            diskon = 0.05;
            System.out.println("Mendapat diskon 5%");
        }
        else if (nominal <= 125000){
            diskon = 0.15;
            System.out.println("Mendapat diskon 15%");
        }
        else if (nominal > 125000){
            diskon = 0.2;
            System.out.println("Mendapat diskon 20%");
        }
        
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan
        double total = nominal - (nominal*diskon);
        System.out.println("Total pembayaran = " + total);

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000
