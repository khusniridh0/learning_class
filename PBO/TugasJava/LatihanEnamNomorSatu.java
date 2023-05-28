import java.util.Scanner;

public class LatihanEnamNomorSatu {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            boolean mulai = true;
            do {
                System.out.print("Masukkan hari 1-7: ");
                int hari = scn.nextInt();

                switch (hari) {
                    case 1:
                        System.out.println("Senin");
                        break;
                    case 2:
                        System.out.println("Selasa");
                        break;
                    case 3:
                        System.out.println("Rabu");
                        break;
                    case 4:
                        System.out.println("Kamis");
                        break;
                    case 5:
                        System.out.println("Jum'at");
                        break;
                    case 6:
                        System.out.println("Saptu");
                        break;
                    case 7:
                        System.out.println("Minggu");
                        break;
                    default:
                        System.out.println(
                                "Satu minggu hanya ada 7 hari, jika ada hari ke 8 dan seterusnya, semoga itu hari libur. Karna saya suka libur");
                        break;
                }

                System.out.print("Lanjutkan program? (y/n): ");
                String condition = scn.next();
                if (condition.equalsIgnoreCase("n")) {
                    mulai = false;
                }

            } while (mulai);
        }
    }
}
