package jobsheet03;

public class anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjam;

    public anggota(String noKtp, String nama, int limitPinajaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinajaman;
        this.jumlahPinjam = 0;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public int getJumlahPinjam(){
        return jumlahPinjam;
    }

    public void pinjam (int nominal){
        if ((jumlahPinjam = nominal) > limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }else {
            jumlahPinjam += nominal;
        }
    }

    public void angsur(int nominal){
        double batasMinimal = jumlahPinjam * 0.10;

        if (nominal < batasMinimal){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }else {
            jumlahPinjam -= nominal;
        }
    }

}
