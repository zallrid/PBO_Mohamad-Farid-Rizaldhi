package jobsheet07;

public abstract class Kendaraan {
    public String merk;
    public String tahun;
    public String warna;
    public int totalBensin;

    public Kendaraan() {
        System.out.println("Constructor default Kendaraan dipanggil");
    }

    public Kendaraan(String merk, String tahun, String warna, int totalBensin) {
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
        this.totalBensin = totalBensin;
    }

    public void isiBensin() {
        System.out.println(this.merk + " sedang mengisi bensin.");
    }

    public void servis() {
        System.out.println("Kendaraan " + this.merk + " sedang diservis secara umum.");
    }

    public void printInfo() {
        System.out.println("Merk: " + this.merk);
        System.out.println("Tahun: " + this.tahun);
        System.out.println("Warna: " + this.warna);
        System.out.println("Total Bensin: " + this.totalBensin + " Liter");
    }

    public abstract void jenisMesin();
}
