package jobsheet08.swictable;

public class main {
    public static void main(String[] args) {

        mobil mobil = new mobil("Toyota", 100);

        System.out.println("=== INFORMASI MOBIL ===");
        System.out.println("Merk: " + mobil.merk);
        System.out.println("Kecepatan: " + mobil.kecepatan);

        mobil.switchOn();
        mobil.transmisi();
        mobil.switchOff();

        System.out.println();

        mesinCuci mesinCuci = new mesinCuci(20, "Normal");

        System.out.println("=== INFORMASI MESIN CUCI ===");
        System.out.println("Kapasitas Air: " + mesinCuci.kapasitasAir);
        System.out.println("Mode Cuci: " + mesinCuci.modeCuci);

        mesinCuci.switchOn();
        mesinCuci.setTimer();
        mesinCuci.switchOff();
    }
}
