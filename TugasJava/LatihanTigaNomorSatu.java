import java.util.Scanner;

public class LatihanTigaNomorSatu {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Masukan total orang: ");
            int people = scn.nextInt();
            System.out.print("Masukan total mobil: ");
            int cars = scn.nextInt();
            System.out.print("Masukan total bus: ");
            int buses = scn.nextInt();

            if (cars > people) {
                System.out.println("Kita harus mengambil mobil.");
            } else if (cars < people) {
                System.out.println("Kita seharusnya tidak mengambil mobil.");
            } else {
                System.out.println("Kita tidak bisa memutuskan.");
            }
            if (buses > cars) {
                System.out.println("Itu terlalu banyak bus");
            } else if (buses < cars) {
                System.out.println("Mungkin kita bisa naik bus.");
            } else {
                System.out.println("Kami masih belum bisa memutuskan.");
            }
            if (people > buses) {
                System.out.println("Baiklah, ayo naik bus saja.");
            } else {
                System.out.println("Baik, mari kita tinggal di rumah kemudian.");
            }
        }
    }
}