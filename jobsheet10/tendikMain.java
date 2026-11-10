package jobsheet10;
import java.util.ArrayList;

public class tendikMain {
    public static void main(String[] args) {
        dosen dosen1 = new dosen("1214215", "Widi, S.kom","12424");
        dosen dosen2 = new dosen("124124", "Alu, S.kom", "46545");
        tenagaKependidikan tendik1 = new tenagaKependidikan("1214215", "Widi, S.kom","Administrasi");
        tenagaKependidikan tendik2 = new tenagaKependidikan("124124", "Alu, S.kom", "Perpustakaan");
        
        ArrayList<pegawai> daftarPegawai = new ArrayList<pegawai>();
        daftarPegawai.add(dosen1);
        daftarPegawai.add(dosen2);
        daftarPegawai.add(tendik1);
        daftarPegawai.add(tendik2);
        
        pegawai pegawai1 = dosen1;

        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();

        dosen newdosen =(dosen) pegawai1;
        System.out.println(newdosen.nama);
        System.out.println(newdosen.nidn);
        newdosen.mengajar();


        System.out.println("Jumlah pegawai: " + daftarPegawai.size());


    }
}
