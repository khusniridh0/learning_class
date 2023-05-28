import java.io.PrintWriter;
import java.io.FileReader;

public class UTS {
    public static void main(String[] args) throws Exception {
        PrintWriter read = new PrintWriter("data.txt");
        Identitas data = new Identitas();
        int[] NilaiInt = {2,4,6,5,2,4,6,6,5,6};
        String[] nama = {"Husni", "Ridho", "Farhan", "tama", "Sarah"};

        for(int n : NilaiInt){
            read.print(n + ", ");
        }
        read.println();
        for(String n : nama){
            read.print(n + ", ");
        }
        read.println();
        read.println("Nama         : " + data.nama);
        read.println("NIM          : " + data.NIM);
        read.println("Alamat       : " + data.alamat);
        read.println("Usia         : " + data.usia);
        read.println("Tinggi badan : " + data.tinggi);
        read.println("Berat badan  : " + data.berat);
        read.close();

        try (
            FileReader file = new FileReader("data.txt")) {
            int character;
            while ((character = file.read()) != -1) {
                System.out.print((char) character);
            }
        }
    }
}

class Identitas{
    String nama = "Khusni Ridho";
    int NIM = 22201022;
    String alamat = "Jl. Soekarno Hatta Jl. Rembuksari No.1 A, Mojolangu, Kec. Lowokwaru, Kota Malang, Jawa Timur 65113";
    int usia = 20;
    Double tinggi = 165.5;
    Double berat = 55.5;
}