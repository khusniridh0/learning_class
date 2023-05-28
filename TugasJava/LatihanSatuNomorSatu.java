import java.util.Scanner;

public class LatihanSatuNomorSatu {
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {
            int age;
            System.out.print("Berapa usia kamu? ");
            age = scn.nextInt();
            System.out.print("Kamu: ");
            if (age < 13) {
                System.out.println("Terlalu muda untuk membuat akun Facebook");
            } else if (age < 16) {
                System.out.println("Terlalu muda untuk mendapatkan SIM");
            } else if (age <= 18) {
                System.out.println("Terlalu muda untuk menikahi seseorang");
            } else if (age < 35) {
                System.out.println("Terlalu muda untuk mencalonkan diri sebagai Presiden RI");
            }
        }
    }
}