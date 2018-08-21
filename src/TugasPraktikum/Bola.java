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
public class Bola {
      public static void main(String[] args) {
        System.out.println("Program Luas Permukaan Bola");
        Scanner bil = new Scanner(System.in);
        System.out.print("Masukkan r : ");
        Float r = bil.nextFloat();
        System.out.println("Luas permukaan bola adalah : " + ((3.14 * r * r) *4));
    }
}
