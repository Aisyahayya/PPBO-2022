package com.mycompany.ppbo_07_latihan1;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PPBO_07_Latihan1 {
	  // method ini untuk input teks oleh user melalui keyboard
	  public String ketikTeks() {
		System.out.println("Ketik kalimat yang akan disimpan :");
		Scanner sc = new Scanner(System.in);
		// ambil 1 kalimat, setelah tekan enter teks akan diambil
		String str1 = sc.nextLine();
		return str1;
	}

	  // untuk menyimpan teks yang diketik user ke file
	  public void simpanTeks(String teks) {
		// set up file and stream
		// ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
		File outFile = new File("sample3.data");
		FileOutputStream outFileStream;
		try {
			 outFileStream = new FileOutputStream(outFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			outStream.print(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PPBO_07_Latihan1 it = new PPBO_07_Latihan1();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}

/*
Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya.

Ketika source dijalankan, user akan diminta untuk menginputkan kalimat. Kalimat tersebut kemudian akan 
disimpan ke dalam file teks yang bernama "sample3.data". Apabila file dibuka, isinya adalah kalimat yang
telah diinput sebelumnya.
*/
