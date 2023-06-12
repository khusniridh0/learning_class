import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            List<Mobil> arr = new ArrayList<>();
            Random random = new Random();
            int count = 10;
            Profil profil = new Profil(count, 100000000);

            String[] merek = {"Toyota", "Honda", "Suzuki", "Mitsubishi", "Nissan", "Daihatsu", "Mazda", "Isuzu", "Ford", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Hyundai", "Kia", "Peugeot", "Volvo", "Lexus", "Mini" };
            String[] warna = {"Perak", "Hijau", "Biru", "Hitam", "Putih", "Cokelat", "Silver", "Merah", "Kuning", "Pink"};
            int[] kecepatan = {150, 160, 170, 180, 200, 230, 250, 325, 330, 340, 407, 447};
            String[] model = {"Avanza", "Civic", "Ertiga", "Terios", "Xpander", "Livina", "Elf", "CX-5", "Cortez", "Rio"};
            int[] harga = {710000000, 100000000, 590000000, 190000000, 680000000, 720000000, 240000000, 860000000, 300000000, 880000000, 840000000, 480000000, 210000000, 840000000, 430000000, 910000000, 770000000, 970000000, 190000000, 670000000};
            String[] status = {"Baru", "Bekas"};

            for (int i = 0; i < count; i++) {
                if (arr.size() < count){
                    arr.add(new Mobil(merek[random.nextInt(merek.length)], warna[random.nextInt(warna.length)], kecepatan[random.nextInt(kecepatan.length)], model[random.nextInt(model.length)], harga[random.nextInt(harga.length)], status[random.nextInt(status.length)]));
                }
            }

            // Program Interaksi
            while (true) {
                System.out.println("\n 1. Daftar Mobil\n 2. Jual Mobil\n 3. Profil\n 4. Berhenti\n");
                System.out.print("Pilih fitur 1/2/3/4: ");
                int user = scn.nextInt();
                if (user == 1){;
                    for (int i = 0; i < count; i++) {
                        System.out.println("__________________________________________\n");
                        System.out.println("Nomor              : " + (i + 1));
                        System.out.println("__________________________________________\n");
                        Mobil cars = arr.get(i); 
                        cars.read();
                        System.out.println("__________________________________________\n");
                    }
                } else if(user == 2){
                    System.out.println("__________________________________________\n");
                    System.out.println("               Jual mobil");
                    System.out.println("__________________________________________\n");
                    
                    System.out.print("Pilih mobil 1/2/3/dll..: ");
                    int beli = scn.nextInt() - 1;
                    
                    try {
                        Mobil car = (Mobil) arr.get(beli);
                        car.read();
                        System.out.print(" 1. Jual\n 2. batal\nKonfirmasi: ");
                        int confirm = scn.nextInt();

                        if (confirm == 1){
                            profil.Jual(count -= 1, car.get_harga());
                            profil.show();
                            arr.remove(beli);
                        }

                    } catch (Exception e) {
                        System.err.println("Mobil tidak ditemukan!");
                    }
                } else if (user == 3) {
                    System.out.println("__________________________________________\n");
                    System.out.println("                Profil");
                    System.out.println("__________________________________________\n");
                    profil.show();
                } else if (user == 4) {
                    break;
                } else {
                    System.out.println("__________________________________________\n");
                    System.out.println("             Menu tidak tersedia");
                    System.out.println("__________________________________________\n");
                }
            }
        }
    }
}