package jobsheet08;

public class smartFridge extends kulkas implements audible {
    public int volume;
    public String ukuranLayar;

    @Override 
    public void naikkanVolume() {
        System.out.println("Volume SmartFridge dinaikkan");
    }

    @Override
    public void turunkanVolume() {
        System.out.println("Volume SmartFridge diturunkan");
    }
    
}
