/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan34_kalkulator;

import java.util.Scanner;

/**
 *
 * @author
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan34_Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        kalkulator myKalkulator = new kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukan Angka ke-1 = ");
        myKalkulator.value1 = scan.nextDouble();
        
        System.out.print("Masukan Nilai Ke-2 = ");
        myKalkulator.value2 = scan.nextDouble();
        
        System.out.println("");
        System.out.println("Hasil Pertambahan = "+myKalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan = "+myKalkulator.kurangBilangan());
        System.out.println("Hasil Pengalian   = "+myKalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian   = "+myKalkulator.bagiBilangan());
        
        
    }
    
}
