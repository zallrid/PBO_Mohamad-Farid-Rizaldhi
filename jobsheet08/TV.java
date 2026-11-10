package jobsheet08;

public class TV extends alatElektronik implements audible {
    public String jenisLayar;
    public int volume;

    @Override 
    public void naikkanVolume(){
        volume += 1;
    }

    @Override
    public void turunkanVolume(){
        volume -= 1;
    }

    public String getInfo() {
    return "Informasi TV";
    }

}
