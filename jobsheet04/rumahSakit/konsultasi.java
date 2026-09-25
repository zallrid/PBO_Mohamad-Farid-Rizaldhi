package jobsheet04.rumahSakit;

import java.time.LocalDate;

public class konsultasi {
    private LocalDate tanggal;
    private pegawai dokter;
    private pegawai perawat;

    public LocalDate getTanggal(){
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal){
        this.tanggal = tanggal;
    }

    public pegawai getDokter(){
        return dokter;
    }

    public void setDokter(pegawai dokter){
        this.dokter = dokter;
    }

    public pegawai getPerawat(){
        return perawat;
    }

    public void setPerawat(pegawai perawat){
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "Tanggal: " + tanggal + "\n";
        info += "Dokter: " + dokter.getInfo() + "\n";
        info += "Perawat: " + perawat.getInfo() + "\n";
        info += "\n";
        return info;
    }

}
