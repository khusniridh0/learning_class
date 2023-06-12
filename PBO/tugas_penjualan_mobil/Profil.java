import java.text.DecimalFormat;

public class Profil {
    DecimalFormat price = new DecimalFormat("#,###,###.##");
    private int asset;
    private int saldo;

    public Profil (int asset, int saldo) {
        this.asset = asset;
        this.saldo = saldo;
    }
    
    public void show () {
        System.out.println("Total mobil        : " + this.asset);
        System.out.println("Saldo anda saat ini: " + price.format(this.saldo) + " IDR");
    }

    public void Jual (int asset, int harga){
        this.saldo = this.saldo + harga;
        this.asset = asset;
    }
}