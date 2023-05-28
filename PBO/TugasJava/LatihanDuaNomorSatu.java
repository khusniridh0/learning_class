import java.util.Scanner;

public class LatihanDuaNomorSatu {
    public static void main(String[] args) {
        int variabel1 = inputNilaiInteger("variabel1");
        int batasBawah = inputNilaiInteger("batasBawah");
        int batasAtas = inputNilaiInteger("batasAtas");

        if (variabel1 < batasBawah) {
            System.out.println("Variabel1 = " + variabel1 + "kurang dari batasBawah yang bernilai " + batasBawah);
        }
        if ((variabel1 < batasBawah) && (variabel1 < batasAtas)) {
            System.out.println("Variabel1 = " + variabel1 + "kurang dari batasBawah yang bernilai " + batasBawah
                    + " dan kurang dari batasAtas juga yang bernilai: " + batasAtas);
        }
        if (variabel1 <= batasBawah || variabel1 >= batasAtas) {
            System.out.println("Variabel 1 nilainya tidak berada di antara batasBawah dan batasAtas");
        }
    }

    static int inputNilaiInteger(String namaVariabel) {
        try (Scanner scn = new Scanner(System.in)) {
            int nilaiInput;
            System.out.println("Silakan input nilai untuk variabel " + namaVariabel);
            nilaiInput = scn.nextInt();
            return nilaiInput;
        }

    }
}