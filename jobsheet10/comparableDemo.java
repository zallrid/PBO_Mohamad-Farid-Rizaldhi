package jobsheet10;
import java.util.ArrayList;
import java.util.Collections;

public class comparableDemo {
    public static void main(String[] args) {
        ArrayList<dosen> daftarDosen = new ArrayList<>();
        daftarDosen.add(new dosen("321", "Bella", "0091"));
        daftarDosen.add(new dosen("123", "Adilla", "0081"));
        daftarDosen.add(new dosen("231", "Petrus", "0071"));
        
        Collections.sort(daftarDosen);
        for (dosen dosen : daftarDosen){
            dosen.displayInfo();
        }

    }

}
