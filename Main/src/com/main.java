package com;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Luas obj1 = new Luas();
        String lagi = "y";

        while(lagi.equalsIgnoreCase("Y")){
            System.out.println();
            System.out.println("--- Operasi Bangun Datar Segitiga ---");

            System.out.println();
            System.out.print("Masukkan Alas : ");
            obj1.setAlas(input.nextInt());
            
            System.out.print("Masukkan Tinggi : ");
            obj1.setTinggi(input.nextInt());
            
            System.out.println();
            System.out.println("-------- Hasil --------");
            System.out.println("Alas segitiga : " + obj1.getAlas());
            System.out.println("Tinggi segitiga : " + obj1.getTinggi());
            System.out.println("Luas segitiga : " + obj1.getLuas());
            
            System.out.println();
            System.out.println("Ingin Menghitung Lagi? [Y/T] : ");
            lagi = input.next();
        }
    }
}