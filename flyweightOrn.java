import java.util.ArrayList;
import java.util.List;
class Kitap {
    private String title;

    public Kitap(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void displayInfo(String rafnumarasi) {
        System.out.println("Kitap: " + title + "\nRaf Numarası: " + rafnumarasi);

    }
}
class BookFactory {
    private static final List<Kitap> kitapListesi = new ArrayList<>();

    public static Kitap getBookType(String title) {

        for (Kitap k : kitapListesi) {
            if (k.getTitle().equals(title)) {
                return k; 
            }
        }
        Kitap yeniKitap = new Kitap(title);
        kitapListesi.add(yeniKitap);
        System.out.println("Yeni kitap oluşturuldu: " + title);
        return yeniKitap;
    }
}

class Book {
    private String rafnumarasi;
    private Kitap type;

    public Book(String title, String rafnumarasi) {
        this.rafnumarasi = rafnumarasi;
        this.type = BookFactory.getBookType(title);
    }

    public void display() {
        type.displayInfo(rafnumarasi);
    }
}
public class LibraryApp {
    public static void main(String[] args) {
        List<Book> kutuphane = new ArrayList<>();

        kutuphane.add(new Book("Küçük Prens", "A1-Raf1"));
        kutuphane.add(new Book("Küçük Prens", "A1-Raf2"));
        kutuphane.add(new Book("Simyacı", "B3-Raf5"));

        System.out.println("\nKütüphane");
        for (Book book : kutuphane) {
            book.display();
        }
    }
}