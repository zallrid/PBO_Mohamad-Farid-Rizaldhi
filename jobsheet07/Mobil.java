package jobsheet07;
public class Mobil extends Kendaraan {
    public int jumlahPintu;

    // 2. Method Overloading: Constructor TANPA parameter
    public Mobil() {
        super(); // Memanggil constructor default superclass
    }

    // 2 & 3. Method Overloading & Memanggil super() berparameter
    public Mobil(String merk, String tahun, String warna, int totalBensin, int jumlahPintu) {
        super(merk, tahun, warna, totalBensin); // 3. Memanggil constructor berparameter milik Kendaraan
        this.jumlahPintu = jumlahPintu;
    }

    // Method spesifik Mobil sesuai diagram
    public void bukaBagasi() {
        System.out.println("Bagasi mobil " + this.merk + " sedang dibuka.");
    }

    // 4. Method Overriding: Menimpa method servis() dari superclass
    @Override
    public void servis() {
        System.out.println("Mobil " + this.merk + " diservis: Ganti oli mesin mobil dan spooring ban.");
    }

    // 4. Method Overriding: Menambahkan info jumlah pintu
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Pintu: " + this.jumlahPintu);
    }
}
