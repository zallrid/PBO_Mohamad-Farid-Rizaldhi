package jobsheet04.perpustakaan;

import java.time.LocalDate;
import java.util.ArrayList;

public class Anggota {
    private String idAnggota;
    private String nama;
    private ArrayList<Peminjaman> riwayatPeminjaman;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.riwayatPeminjaman = new ArrayList<Peminjaman>();
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPeminjaman(LocalDate tanggal, Buku buku) {
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setTanggal(tanggal);
        peminjaman.setBuku(buku);
        riwayatPeminjaman.add(peminjaman);
    }

    public String getInfo() {
        String info = "";
        info += "ID Anggota\t: " + this.idAnggota + "\n";
        info += "Nama\t\t: " + this.nama + "\n";
        
        if (!riwayatPeminjaman.isEmpty()) {
            info += "Riwayat Peminjaman : \n";
            for (Peminjaman peminjaman : riwayatPeminjaman) {
                info += peminjaman.getInfo();
            }
        } else {
            info += "Belum ada riwayat peminjaman\n";
        }
        
        info += "\n";
        return info;
    }
}
