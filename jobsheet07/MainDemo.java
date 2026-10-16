package jobsheet07;

public class MainDemo {
    public static void main(String[] args) {
        // 5. Instansiasi 2 objek subclass
        
        System.out.println("=== DATA MOBIL ===");
        // Membuat objek Mobil menggunakan constructor berparameter
        Mobil mobil1 = new Mobil("Toyota Avanza", "2022", "Hitam", 40, 4);
        mobil1.printInfo();
        mobil1.isiBensin();
        mobil1.bukaBagasi();
        mobil1.servis(); // Memanggil method overriding

        System.out.println("\n=== DATA MOTOR ===");
        // Membuat objek Motor menggunakan constructor berparameter
        Motor motor1 = new Motor("Honda Vario", "2023", "Merah", 5, "Stang Standard");
        motor1.printInfo();
        motor1.isiBensin();
        motor1.standarSamping();
        motor1.servis(); // Memanggil method overriding
    }
}
