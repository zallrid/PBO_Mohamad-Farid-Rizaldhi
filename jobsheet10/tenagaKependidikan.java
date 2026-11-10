package jobsheet10;

public class tenagaKependidikan extends pegawai{
    public String kategori;

    public tenagaKependidikan(){

    }
    
    public tenagaKependidikan(String nip, String nama, String kategori){
        super(nip, nama);
        this.kategori = kategori;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kategori: "+ kategori);
    }
    
}
