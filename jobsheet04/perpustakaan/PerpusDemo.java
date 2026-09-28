package jobsheet04.perpustakaan;

import java.time.LocalDate;

public class PerpusDemo {
    public static void main(String[] args) {
   
        Buku buku1 = new Buku("B001", "Pemrograman Berbasis Objek");
        Buku buku2 = new Buku("B002", "Basis Data Lanjut");

        
        Anggota anggota1 = new Anggota ("A001", "Abdul Amin");
        anggota1.tambahPeminjaman(LocalDate.of(2026, 9, 10), buku1);
        anggota1.tambahPeminjaman(LocalDate.of(2026, 9, 15), buku2);
        
        System.out.println(anggota1.getInfo());

        Anggota anggota2 = new Anggota ("A002", "Syamuli Bin Tulloh");
        System.out.println(anggota2.getInfo());
    }
}
