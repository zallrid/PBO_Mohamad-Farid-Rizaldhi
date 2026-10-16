package jobsheet07;

public class Kendaraan {
    public String merk;
    public String tahun;
    public String warna;
    public int totalBensin;

    // 2. Method Overloading: Constructor TANPA parameter
    public Kendaraan() {
        System.out.println("Constructor default Kendaraan dipanggil");
    }

    // 2. Method Overloading: Constructor DENGAN parameter
    public Kendaraan(String merk, String tahun, String warna, int totalBensin) {
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
        this.totalBensin = totalBensin;
    }

    // Method sesuai diagram
    public void isiBensin() {
        System.out.println(this.merk + " sedang mengisi bensin.");
    }

    // Method yang akan di-OVERRIDING oleh subclass
    public void servis() {
        System.out.println("Kendaraan " + this.merk + " sedang diservis secara umum.");
    }

    // Method tambahan untuk menampilkan info
    public void printInfo() {
        System.out.println("Merk: " + this.merk);
        System.out.println("Tahun: " + this.tahun);
        System.out.println("Warna: " + this.warna);
        System.out.println("Total Bensin: " + this.totalBensin + " Liter");
    }
}
