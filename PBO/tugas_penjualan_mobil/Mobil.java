import java.text.DecimalFormat;
class Mobil {
    DecimalFormat price = new DecimalFormat("#,###,###.##");
    String merek;
    String warna;
    int kecepatan;
    String model;
    int harga;
    String status;

    public Mobil(String merek, String warna, int kecepatan, String model, int harga, String status) {
        this.merek = merek;
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.model = model;
        this.harga = harga;
        this.status = status;
    }

    public void read() {
        System.out.println("Merek              : " + this.merek);
        System.out.println("Warna              : " + this.warna);
        System.out.println("Model              : " + this.model);
        System.out.println("Harga              : " + price.format(this.harga) + " IDR");
        System.out.println("Kecepatan tertinggi: " + this.kecepatan);
        System.out.println("Ketersediaan       : " + this.status);
    }

    public int get_harga(){
        return this.harga;
    }
}