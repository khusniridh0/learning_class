import java.util.Random;
import java.util.Scanner;

public class LatihanTujuhNomorDua {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            Random mesinRandom = new Random();

            System.out.print("Tuliskan Pesan: ");
            String pesan = scn.nextLine();

            int randomNun = mesinRandom.nextInt(20);
            int pengulangan = 10;

            if (randomNun > 10) {
                System.out.print("Bilangan random yang didapat terlalu besar\n");
                pengulangan = 5;
            }

            System.out.print("Pesan akan diulang: " + pengulangan + " kali\n");

            for (int i = 0; i < pengulangan; i++) {
                System.out.print(pesan + "\n");
            }
        }
    }
}
