package com.mycompany.ppbo_05_soal3;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

import java.util.Scanner;

public class PPBO_05_Soal3 {
    public static void main(String args[] ) {
        char a, b, temp;
        
        Scanner Sc = new Scanner(System.in);

        a = Sc.next().charAt(0);
        b = Sc.next().charAt(0);
        Sc.close();
        
        if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }

        String output = "";
        while(a <= b) {
            output += a;
            a++;
        }
        
        System.out.print(output);
    }
}