package jobsheet10;

public class demo {

    public static void main(String[] args) {
        dosen dosen1 = new dosen("1214215", "Widi, S.kom","12424");
        tenagaKependidikan tendik1 = new tenagaKependidikan("1214215", "Widi, S.kom","Administrasi");

        train(dosen1);
        train(tendik1);
    }

    public static void train(pegawai pegawai){
        System.out.println("Memberikan pelatihan untuk pegawai");
        System.out.println("Menginfokan SOP/Juknis");
        pegawai.displayInfo();

        if (pegawai instanceof dosen){
            System.out.println("Memberikan pelatihan pedagogik");
        }

        // System.out.println(pegawai1.nip);
        // System.out.println(pegawai1.nama);
        // pegawai1.displayInfo();
    }
}
