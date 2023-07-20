import java.util.Scanner;

class SistemAkademik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TUGAS UAS");
        System.out.print("Nama       : ");
        String nama = scanner.nextLine();
        System.out.print("Nim        : ");
        String nim = scanner.nextLine();
        System.out.print("Kelas      : ");
        String kelas = scanner.nextLine();
        System.out.print("Matakuliah : ");
        String matakuliah = scanner.nextLine();

        Dosen dosen = new Dosen("Danang Arbian Sulistyo, M. Kom");
        Matakuliah matkul = new Matakuliah(matakuliah, 3, dosen);
        Mahasiswa mhs = new Mahasiswa(nim, nama, kelas, matkul);
        Nilai nilai = new Nilai(85.0, 80.0);
        mhs.setNilai(nilai);

        System.out.println("\nSistem Akademik");
        System.out.println("--------------------");
        System.out.println("Nama         : " + mhs.nama());
        System.out.println("Nim          : " + mhs.nim());
        System.out.println("Kelas        : " + mhs.kelas());
        System.out.println("Matakuliah   : " + matkul.nama());
        System.out.println("SKS          : " + matkul.sks());
        System.out.println("Dosen        : " + dosen.nama());
        System.out.println("Nilai UTS    : " + nilai.nilaiUTS());
        System.out.println("Nilai UAS    : " + nilai.nilaiUAS());
        System.out.println("Nilai Akhir  : " + nilai.nilaiAkhir());
        System.out.println("Angka        : " + nilai.categoryNilai());
        System.out.println("-----------------------------------------------");
    }
}

class Nilai {
    private double nilaiUTS;
    private double nilaiUAS;

    public Nilai(double nilaiUTS, double nilaiUAS) {
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double nilaiUTS() {
        return nilaiUTS;
    }

    public double nilaiUAS() {
        return nilaiUAS;
    }

    public double nilaiAkhir() {
        return (nilaiUTS + nilaiUAS) / 2;
    }

    public String categoryNilai() {
        double nilaiAkhir = nilaiAkhir();
        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 60) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}

class Matakuliah {
    private String nama;
    private int sks;
    private Dosen dosen;

    public Matakuliah(String nama, int sks, Dosen dosen) {
        this.nama = nama;
        this.sks = sks;
        this.dosen = dosen;
    }

    public String nama() {
        return nama;
    }

    public int sks() {
        return sks;
    }

    public Dosen dosen() {
        return dosen;
    }
}

class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private Matakuliah matakuliah;
    private Nilai nilai;

    public Mahasiswa(String nim, String nama, String kelas, Matakuliah matakuliah) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.matakuliah = matakuliah;
    }

    public String nama() {
        return nama;
    }

    public String nim() {
        return nim;
    }

    public String kelas() {
        return kelas;
    }

    public Matakuliah matakuliah() {
        return matakuliah;
    }

    public Nilai nilai() {
        return nilai;
    }

    public void setNilai(Nilai nilai) {
        this.nilai = nilai;
    }
}

class Dosen {
    private String nama;

    public Dosen(String nama) {
        this.nama = nama;
    }

    public String nama() {
        return nama;
    }
}
