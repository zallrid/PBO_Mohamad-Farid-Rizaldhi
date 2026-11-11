package jobsheet10;

public class dosen extends pegawai implements Comparable<dosen>{
    public String nidn;

    public dosen(){

    }

    public dosen(String nip, String nama, String nidn){
        super(nip, nama);
        this.nidn = nidn;
    }


    public void displayInfo(){
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }
    public void mengajar(){
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("menyusun materi");
        System.out.println("melaksanankan PBM");
        System.out.println("melakukan evaluasi");
    }

    @Override 
    public int compareTo(dosen otherDosen){
        return this.nama.compareTo(otherDosen.nama);
    }
}
