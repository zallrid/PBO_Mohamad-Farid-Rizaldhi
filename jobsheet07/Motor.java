package jobsheet07;

public class Motor extends Kendaraan {
    public String jenisStang;

    public Motor() {
        super();
    }

    public Motor(String merk, String tahun, String warna, int totalBensin, String jenisStang) {
        super(merk, tahun, warna, totalBensin); 
        this.jenisStang = jenisStang;
        this.warna = warna;
    }

    public void standarSamping() {
        System.out.println("Standar samping motor " + this.merk + " diturunkan.");
    }

    @Override
    public void servis() {
        System.out.println("Motor " + this.merk + " diservis: Ganti oli gardan dan cek rantai/v-belt.");
    }

    @Override 
    public void jenisMesin(){
        System.out.println("Jenis mesin motor " + this.merk + " adalah injection.");
    }

    
}