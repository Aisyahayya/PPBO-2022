package com.mycompany.ppbo_05_soal2;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

import java.util.Scanner;

public class PPBO_05_Soal2 {
    public static void main(String args[] ) {
        String s;
        int string_type;
        
        Scanner Sc = new Scanner(System.in);

        s = Sc.nextLine();
        Sc.close();

        if (s.matches("^[AIUEOaiueo].*")) {
            string_type = 1;
        }
        else if (s.matches("^(.*[^ng])(ng)")) {
            string_type = 2;
        }
        else {
            string_type = -1;
        }
        System.out.print(string_type);
    }
}