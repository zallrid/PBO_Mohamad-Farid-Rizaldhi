package jobsheet07;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
        System.out.println("Ini constructor class dosen yang berparameter");
    }
    
    public String getAllInfo(){
        String info = super.getInfo();
        info +=  this.getInfo();
        return info;
    }
}
