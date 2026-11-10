package jobsheet08.swictable;

public class mesinCuci implements switchable {
    int kapasitasAir;
    String modeCuci;

    public mesinCuci(int kapasitasAir, String modeCuci) {
        this.kapasitasAir = kapasitasAir;
        this.modeCuci = modeCuci;
    }

    @Override
    public void switchOn() {
        System.out.println("Mesin cuci dinyalakan");
    }

    @Override
    public void switchOff() {
        System.out.println("Mesin cuci dimatikan");
    }

    public void setTimer() {
        System.out.println("Timer mesin cuci diatur");
    }
}
