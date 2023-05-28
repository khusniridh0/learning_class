import java.util.Scanner;

public class JavaApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan Nilai Pertama ");
        int nilai1 = scn.nextInt();
        System.out.print("Masukan Nilai Kedua: ");
        int nilai2 = scn.nextInt();
        int hasilnya = nilai1 + nilai2;
        System.out.println(nilai1 + " + " + nilai2 + " = " + hasilnya);
        System.out.println("Dikerjakan oleh Khusni Ridho NIM = 22201022");
    }
}