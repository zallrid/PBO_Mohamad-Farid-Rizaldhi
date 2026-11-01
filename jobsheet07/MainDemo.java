package jobsheet07;

public class MainDemo {
    public static void main(String[] args) {
        
        System.out.println("=== DATA MOBIL ===");
        Mobil mobil1 = new Mobil("Toyota Innova", "2022", "Grey", 40, 4);
        mobil1.printInfo();
        mobil1.isiBensin();
        mobil1.bukaBagasi();
        mobil1.servis(); 
        mobil1.jenisMesin();

        System.out.println("\n=== DATA MOTOR ===");
        Motor motor1 = new Motor("Honda Vario", "2023", "Merah", 5, "Stang Standard");
        motor1.printInfo();
        motor1.isiBensin();
        motor1.standarSamping();
        motor1.servis(); 
        motor1.jenisMesin();
    }
}
