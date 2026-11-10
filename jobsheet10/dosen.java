package jobsheet10;

public class dosen extends pegawai {
    public String nidn;

    public dosen(){

    }

    public dosen(String nip, String nama, String nidn){
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayInfo(){
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("menyusun materi");
        System.out.println("melaksanankan PBM");
        System.out.println("melakukan evaluasi");
    }
}
