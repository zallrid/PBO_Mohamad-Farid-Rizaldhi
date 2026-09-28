package jobsheet04.perpustakaan;

import java.time.LocalDate;

public class Peminjaman {
    private LocalDate tanggal;
    private Buku buku;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Buku: " + buku.getInfo();
        info += "\n";
        return info;
    }
}
