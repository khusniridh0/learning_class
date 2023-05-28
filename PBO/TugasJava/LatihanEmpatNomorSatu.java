public class LatihanEmpatNomorSatu {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
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
                System.out.println("kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Hari Libur");
                break;
            case 7:
                System.out.println("Hari Libur");
                break;
            default:
                System.out.println(
                        "Satu minggu hanya ada 7 hari, jika ada hari ke 8 dan seterusnya, semoga itu hari libur. Karna saya suka libur");
                break;
        }
    }
}