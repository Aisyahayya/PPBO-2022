package com.mycompany.ppbo_02_latihan4;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

public class PPBO_02_Latihan4 {
    public static void main(String[] args) {
        Person dummy1 = new Person();
        Person dummy2 = new Person();
        Person dummy3 = new Person();
        System.out.println( "Jumlah objek Person yang telah terbuat: " + Person.count/* Lengkapi kode disini */);
        
        Person dummy4 = new Person();
        System.out.println( "Jumlah objek Person yang telah terbuat: " + Person.count/* Lengkapi kode disini */);
    }
}


class Person
{
   public static int count = 0;
        Person() {
            count++;
        }
}
