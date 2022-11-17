package com.mycompany.ppbo_04_latihan1;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

import java.util.Scanner;

public class PPBO_04_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB : 
    - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
        => Tidak

    - Tulis output yang muncul!
        => Exception in thread "main" java.util.InputMismatchException
                at java.base/java.util.Scanner.throwFor(Scanner.java:939)
                at java.base/java.util.Scanner.next(Scanner.java:1594)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
                at com.mycompany.ppbo_04_latihan1.PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:21)
           Command execution failed.

    - Jelaskan maksud dari output tersebut!
        => Pada output tersebut terjadi input mismatch exception, artinya tipe data dari input yang dimasukkan tidak 
           sesuai dengan tipe data yang diharapkan.
*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB :
    - Tulis output yang muncul!
        => 5 / 0 = Infinity

    - Jelaskan maksud dari output tersebut!
        => Output tersebut menghasilkan Infinity, karena tipe data dari variabel hasil adalah double sehingga 
           memungkinkan pembagian suatu bilangan dengan 0. Apabila tipe data dari variabel hasil adalah integer, 
           maka akan terjadi arithmethic exception karena division by zero.
*/
