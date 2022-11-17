package com.mycompany.ppbo_07_latihan2;

// Nama : Aisyah Hayya Imani
// NIM  : M0521008

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.util.Scanner;

public class PPBO_07_Latihan2 {
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
		File outFile = new File("sample4.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			DataOutputStream outStream = new DataOutputStream(outFileStream);
			outStream.writeBytes(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException io) {
                        io.printStackTrace();
                }
	}

	public static void main(String[] args) {
		PPBO_07_Latihan2 it = new PPBO_07_Latihan2();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}

/*
Jelaskan perbedaan cara kerja dari PrintWriter.write() dan DataOutputStream.writeBytes()

PrintWriter.write() bekerja dengan cara mengubah tipe data primitif (int, float, char, dll)
ke dalam format teks. Sedangkan DataOutputStream.writeBytes() bekerja dengan cara mencetak
byte yang mewakili tipe data primitif. PrintWriter cocok digunakan untuk data teks dan
DataOutputStream cocok digunakan untuk data biner.
*/
