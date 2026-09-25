package jobsheet04.rumahSakit;

import java.time.LocalDate;

public class rumahSakitDemo {
    public static void main(String[] args) {
        pegawai ani = new pegawai("1234", "dr. Ani");
        pegawai bagus = new pegawai("4567", "dr. Bagus");
        
        pegawai desi = new pegawai("1234", "Ns. Desi");
        pegawai eka = new pegawai("4567", "Ns. Eka");

        pasien pasien1 = new pasien ("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2023, 3, 1), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2023, 3, 2), bagus, eka);

        System.out.print(pasien1.getInfo());

        pasien pasien2 = new pasien ("997744", "Yenny angreaeni");
        System.out.println(pasien2.getInfo());


    }
    
}
