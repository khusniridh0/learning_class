/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/* @KhusniRidho */

public class JavaApplication1 {
    /* @param args the command line arguments */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan nama anda: ");
        String name = scn.nextLine();
        System.out.println();
        
        int A = 10;
        int B = 20;
        double husni = 3.2;
        double ridho = 3.4;
        boolean isPlus = true;
        
        System.out.println("Selemat Datang " + name);
        System.out.println();
        
        System.out.println(A + " ditambah " + B + " sama dengan " + (A+B));
        System.out.println(B + " dikurang " + A + " sama dengan " + (B-A));
        System.out.println("Total IPK Husni: " + husni);
        System.out.println("Total IPK Husni: " + ridho);
        System.out.println(isPlus);
        
        System.out.println();
        System.out.print("Masukan Nilai: ");
        int nilaiA = scn.nextInt();
        A = nilaiA;

        System.out.println();
        System.out.print("Masukan Nilai: ");
        int nilaiB = scn.nextInt();
        B = nilaiB;
        
        System.out.println(A + " ditambah " + B + " sama dengan " + (A+B));
        System.out.println(B + " dikurang " + A + " sama dengan " + (B-A));
    }   
}
