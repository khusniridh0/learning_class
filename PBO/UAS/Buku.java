import java.util.Random;
import java.text.DecimalFormat;

public class Buku {
    protected String judul;
    protected int hargaBeli;
    protected int hargaJual;
    protected String kategori;
    protected int edisi;
    protected int stok;
    protected DecimalFormat harga = new DecimalFormat("#,###,###.##");


    protected Buku(String judul, int hargaBeli, int hargaJual, String kategori, int stok) {
        Random random = new Random();

        if (kategori.equalsIgnoreCase("majalah")) {
            this.judul = judul;
            this.hargaBeli = hargaBeli;
            this.hargaJual = hargaJual;
            this.kategori = kategori;
            this.edisi = random.nextInt(1000000000, 2147483647);
            this.stok = stok;
        } else {
            this.judul = judul;
            this.hargaBeli = hargaBeli;
            this.hargaJual = hargaJual;
            this.kategori = kategori;
            this.stok = stok;
        }

    }

    protected void lihatBuku() {
        if (kategori.equalsIgnoreCase("majalah")) {
            System.out.println("Judul       : " + judul);
            System.out.println("No-Edisi    : ISBN " + String.valueOf(edisi).substring(0, 1) + "-" + String.valueOf(edisi).substring(1, 3) + "-" + String.valueOf(edisi).substring(3, 8) + "-" + String.valueOf(edisi).substring(8));
            System.out.println("Stok        : " + stok);
            System.out.println("Harga Modal : " + harga.format(hargaBeli));
            System.out.println("Harga Jual  : " + harga.format(hargaJual));
        } else {
            System.out.println("Judul       : " + judul);
            System.out.println("Stok        : " + stok);
            System.out.println("Harga Modal : " + harga.format(hargaBeli));
            System.out.println("Harga Jual  : " + harga.format(hargaJual));
        }
    }

    protected boolean jual(int jumlah) {
        if ((this.stok - jumlah) >= 0) {
            this.stok -= jumlah;
            return true;
        } else {
            System.out.print("Stok tidak cukup, Buku mencapai" + this.stok);
            return false;
        }
    }
    
    protected void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    // protected int stok() {
    //     return stok;
    // }
    
    // protected int hargaBeli() {
    //     return hargaBeli;
    // }
    
    // protected int hargaJual() {
    //     return hargaJual;
    // }
}
