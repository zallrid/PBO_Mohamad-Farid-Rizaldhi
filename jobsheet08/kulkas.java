package jobsheet08;

public class kulkas extends alatElektronik implements audible{
    public String jumlahPintu;

    public String getInfo() {
    return "Informasi Kulkas";
    }

    @Override
    public void naikkanVolume() {
        System.out.println("Volume SmartFridge dinaikkan");
    }

    @Override
    public void turunkanVolume() {
        System.out.println("Volume SmartFridge diturunkan");
    }

}
