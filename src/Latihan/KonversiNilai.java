/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class KonversiNilai {
    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    System.out.print("Masukan nilai WEB :");
    int nilai = masukan.nextInt();
    if (nilai >= 90)
        System.out.println("Nilai A");
    else if (nilai >= 75)
        System.out.println("Nilai B");
    else if (nilai >=50)
        System.out.println("Nilai C");
    else if (nilai >=35)
        System.out.println("Nilai D");
    else 
        System.out.println("Nilai E");
    }
}
