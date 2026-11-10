package jobsheet08.swictable;

public class mobil implements switchable {
    String merk;
    int kecepatan;

    public mobil(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    @Override
    public void switchOn() {
        System.out.println("Mobil dinyalakan");
    }

    @Override
    public void switchOff() {
        System.out.println("Mobil dimatikan");
    }

    public void transmisi() {
        System.out.println("Transmisi mobil Matic CVT");
    }
}
