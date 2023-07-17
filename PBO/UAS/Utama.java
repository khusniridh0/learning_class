import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;

class Utama {
    private int modalAwal;
    private int modalBerjalan;
    private int pendapatan;
    private int saldo;
    private int keuntungan;
    private ArrayList<Buku> daftarBuku;
    private DecimalFormat harga = new DecimalFormat("#,###,###.##");

    public static void main(String[] args) {
        System.out.println("\n----------------------------------------------------");
        System.out.println("|            By. Khusni Ridho, 22201022            |");
        System.out.println("----------------------------------------------------");
        Utama utama = new Utama();
        utama.daftarBuku = new ArrayList<>();
        utama.bukuBaru(new Fiksi("Buku Test 1", 10000, 13000, "Fiksi", 24));
        utama.bukuBaru(new NonFiksi("Buku Test 2", 20000, 25000, "Non Fiksi", 24));
        utama.bukuBaru(new Majalah("Buku Test 2", 15000, 18000, "Majalah", 24));

        for (Buku buku : utama.daftarBuku) {
            utama.modalAwal = buku.hargaBeli * buku.stok;
            utama.modalBerjalan = utama.modalAwal;
        }

        boolean selesai = true;

        Scanner fitur = new Scanner(System.in);
            do {
                System.out.println("\n----------------------------------------------------");
                System.out.println("|              Program Penjualan Buku              |");
                System.out.println("----------------------------------------------------");
                System.out.println("1. Daftar Buku");
                System.out.println("2. Tambah Buku");
                System.out.println("3. Jual Buku");
                System.out.println("4. Beli Buku");
                System.out.println("5. Tampilkan Laporan");
                System.out.println("0. Exit");
                System.out.print("Pilih menu: ");
                int input = fitur.nextInt();

                switch (input) {
                    case 1:
                        utama.hapusLayar();
                        utama.lihatDaftar();
                        break;
                    case 2:
                        utama.hapusLayar();
                        utama.tambahBukuBaru();
                        break;
                    case 3:
                        utama.jualBuku();
                        break;
                    case 4:
                        utama.beliBuku();
                        break;
                    case 5:
                        utama.hapusLayar();
                        utama.laporan();
                        break;
                    case 0:
                        utama.hapusLayar();
                        selesai = false;
                        break;
                    default:
                        System.out.println("Menu tidak tersedia");
                        break;
                }
            } while (selesai);

        fitur.close();
    }

    public void bukuBaru(Buku buku) {
        daftarBuku.add(buku);
    }

    public void lihatDaftar() {
        System.out.println("------------------------------------");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println("No          : " + (i + 1));
            daftarBuku.get(i).lihatBuku();
            System.out.println("------------------------------------");
        }
    }

    public void tambahBukuBaru() {
        Scanner tambah_buku_baru = new Scanner(System.in);
        System.out.print("Judul Buku: ");
        String judul_buku = tambah_buku_baru.nextLine();

        System.out.print("Harga Beli: ");
        int harga_beli = tambah_buku_baru.nextInt();

        System.out.print("Harga Jual: ");
        int harga_jual = tambah_buku_baru.nextInt();

        System.out.print("Stok : ");
        int stok = tambah_buku_baru.nextInt();

        System.out.println();
        System.out.println("\n1. Fiksi\n2. Non Fiksi\n3. Majalah");
        System.out.print("Kategori (1/2/3): ");
        int kategori = tambah_buku_baru.nextInt();

        int total = harga_beli * stok;

        if (total <= this.saldo){
            switch (kategori) {
                case 1:
                    bukuBaru(new Fiksi(judul_buku, harga_beli, harga_jual, "Fiksi", stok));
                    this.saldo -= total;
                    break;
                case 2:
                    bukuBaru(new NonFiksi(judul_buku, harga_beli, harga_jual, "Non Fiksi", stok));
                    this.saldo -= total;
                    break;
                case 3:
                    bukuBaru(new Majalah(judul_buku, harga_beli, harga_jual, "Majalah", stok));
                    this.saldo -= total;
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } else {
            System.out.println("Saldo anda kurang");
        }

    }

    public void beliBuku() {
        Scanner jual_buku = new Scanner(System.in);
        System.out.print("Nomor Buku: ");
        int index = jual_buku.nextInt();
        System.out.print("Jumlah Buku: ");
        int jumlah = jual_buku.nextInt();

        Buku buku = daftarBuku.get(index - 1);
        int total = buku.hargaBeli * jumlah;

        if (this.saldo > total) {
            buku.tambahStok(jumlah);
            this.saldo -= total;
        } else {
            System.out.println("Saldo anda kurang");
        }
    }

    public void jualBuku() {
        Scanner jual_buku = new Scanner(System.in);
        System.out.print("Nomor Buku: ");
        int index = jual_buku.nextInt();
        System.out.print("Jumlah Buku: ");
        int jumlah = jual_buku.nextInt();

        Buku buku = daftarBuku.get(index - 1);
        if (buku.jual(jumlah)) {
            this.modalBerjalan += buku.hargaJual * jumlah;
            this.pendapatan += buku.hargaJual * jumlah;
            this.keuntungan += (buku.hargaJual * jumlah) - (buku.hargaBeli * jumlah);
            this.saldo += buku.hargaJual * jumlah;
        }
    }

    public void laporan() {
        System.out.println("Modal Awal     :  " + harga.format(this.modalAwal) + " IDR");
        System.out.println("Modal Berjalan :  " + harga.format(this.modalBerjalan) + " IDR");
        System.out.println("Pendapatan     :  " + harga.format(this.pendapatan) + " IDR");
        System.out.println("Keuntungan     :  " + harga.format(this.keuntungan) + " IDR");
        System.out.println("Saldo          :  " + harga.format(this.saldo) + " IDR");
    }

    public void hapusLayar() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ex) {
            System.out.println("Gagal membersihkan layar.");
        }
    }
}
