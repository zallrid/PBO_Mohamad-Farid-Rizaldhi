package jobsheet10;
import java.util.ArrayList;

public class newDemo {
    public static void main(String[] args) {
        webpage webpage1 = new webpage();
        webpage1.title = "Jurusan teknologi informasi polinema";
        webpage1.url = "https://www.polinema.ac.id";
        webpage1.content = "<h1>Jurusan Teknologi Informasi Polinema</h1><p>Jurusan Teknologi Informasi Polinema merupakan jurusan yang bergerak di bidang teknologi informasi dan komputer.</p>";

        document doc1 = new document();
        doc1.fileName = "PBO 2024.docx";
        doc1.content = "Contoh content PBO";

        ArrayList<printable> printables = new ArrayList<>();
        printables.add(webpage1);
        printables.add(doc1);

        printer printer1 = new printer();
        printer1.cetak(webpage1);
        printer1.cetak(doc1);
    }
}
