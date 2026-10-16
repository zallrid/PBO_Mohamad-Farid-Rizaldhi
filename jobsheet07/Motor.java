package jobsheet07;

public class Motor extends Kendaraan {
    public String jenisStang;

    // 2. Method Overloading: Constructor TANPA parameter
    public Motor() {
        super();
    }

    // 2 & 3. Method Overloading & Memanggil super() berparameter
    public Motor(String merk, String tahun, String warna, int totalBensin, String jenisStang) {
        super(merk, tahun, warna, totalBensin); // 3. Memanggil constructor berparameter milik Kendaraan
        this.jenisStang = jenisStang;
    }

    // Method spesifik Motor sesuai diagram
    public void standarSamping() {
        System.out.println("Standar samping motor " + this.merk + " diturunkan.");
    }

    // 4. Method Overriding: Menimpa method servis() dari superclass
    @Override
    public void servis() {
        System.out.println("Motor " + this.merk + " diservis: Ganti oli gardan dan cek rantai/v-belt.");
    }

    // 4. Method Overriding: Menambahkan info jenis stang
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis Stang: " + this.jenisStang);
    }
}