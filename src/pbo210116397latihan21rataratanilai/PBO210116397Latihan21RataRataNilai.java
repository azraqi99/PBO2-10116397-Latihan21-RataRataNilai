/*
@author 
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Rata Rata nilai
 */
package pbo210116397latihan21rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int jumMhs;
        int i = 1;
        double rataNilai;
        double jumNilai = 0;
        double nilaiMhs;

        Scanner value = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa = ");
        jumMhs = (int) value.nextDouble();

        while (i <= jumMhs) {
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");

            nilaiMhs = value.nextDouble();
            jumNilai = jumNilai + nilaiMhs;
            i++;

        }
        System.out.print(" ");

        //menghitung rata-rata nilai mahasiswa
        rataNilai = jumNilai / jumMhs;
        System.out.println("Maka, Rata-rata nilainya adalah " + rataNilai);
        System.out.println("Developed by : Muhammad Azraqi Saputra");
    }
    
}
