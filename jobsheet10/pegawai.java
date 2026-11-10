package jobsheet10;

public class pegawai {
    public String nip;
    public String nama;

    public pegawai(){

    }

    public pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public void displayInfo(){
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
    }
}
