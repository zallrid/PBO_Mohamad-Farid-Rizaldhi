package jobsheet07;
public class Mobil extends Kendaraan {
    public int jumlahPintu;

    public Mobil() {
        super(); 
    }

    public Mobil(String merk, String tahun, String warna, int totalBensin, int jumlahPintu) {
        super(merk, tahun, warna, totalBensin); 
        this.jumlahPintu = jumlahPintu;
        
    }
    @Override 
    public void jenisMesin(){
        System.out.println("Jenis mesin mobil " + this.merk + " adalah diesel.");
    }

    public void bukaBagasi() {
        System.out.println("Bagasi mobil " + this.merk + " sedang dibuka.");
    }

    @Override
    public void servis() {
        System.out.println("Mobil " + this.merk + " diservis: Ganti oli mesin mobil dan spooring ban.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Pintu: " + this.jumlahPintu);
    }
}
