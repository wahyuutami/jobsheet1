/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        float R, F, K;
        System.out.print("Masukkan suhu Celcius : ");
        float C = masukan.nextInt();
        System.out.print("Pilih Konversi ke R, F, K : ");
        String pilihan = masukan.next();
        switch(pilihan) {
            case "K":
            case "k":
                System.out.println("Hasil : "+ (K = C+273));
                break;
            case "F":
            case "f":
                System.out.println("Hasil : "+ (F = C*9/5+32));
                break;
            case "R":
            case "r":
                System.out.println("Hasil : "+ (R = C*4/5));
                break;
        }
    }
}
