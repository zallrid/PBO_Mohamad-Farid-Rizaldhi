package jobsheet07;

public class Pegawai {
    public String nip;
    public String nama;
    public String gaji;
    
    // public Pegawai(){
    //     System.out.println("Ini constructor class pegawai");
    // }

    public Pegawai(String nip, String nama, String gaji){
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo(){
        String info = "";
        info += "NIP  : " + nip + "\n";
        info += "Nama : " + nama + "\n";
        info += "Gaji : " + gaji + "\n";
        return info;
    }
}
