package jobsheet04.perpustakaan;

public class Buku {
    private String kodeBuku;
    private String judul;

    public Buku(String kodeBuku, String judul) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getInfo() {
        return judul + " (" + kodeBuku + ")";
    }
}
