import java.util.ArrayList;
import java.util.List;

interface UniversiteComponent {
    void getDetails();
}

class Ogrenci implements UniversiteComponent {
    private String name;
    
    public Ogrenci(String name) {
        this.name = name;
    }
    
    @Override
    public void getDetails() {
        System.out.println("Öğrenci: " + name);
    }
}

class Composite implements UniversiteComponent {
    private String name;
    private List<UniversiteComponent> members = new ArrayList<>();
    
    public Composite(String name) {
        this.name = name;
    }
    
    public void ekle(UniversiteComponent component) {
        members.add(component);
    }
    
    @Override
    public void getDetails() {
        System.out.println("+ " + name);
        for (UniversiteComponent member : members) {
            member.getDetails();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("A");
        Ogrenci ogr2 = new Ogrenci("B");
        Ogrenci ogr3 = new Ogrenci("C");

        Composite yazilimBolumu = new Composite("Yazılım Mühendisliği");
        yazilimBolumu.ekle(ogr1);
        yazilimBolumu.ekle(ogr2);
        yazilimBolumu.ekle(ogr3);

        Composite muhendislikFakultesi = new Composite("Mühendislik Fakültesi");
        muhendislikFakultesi.ekle(yazilimBolumu);

        Composite isletmeFakultesi = new Composite("İşletme Fakültesi");

        Composite universite = new Composite("izü");
        universite.ekle(muhendislikFakultesi);
        universite.ekle(isletmeFakultesi);

        System.out.println("Üniversite Yapısı:");
        universite.getDetails();
    }
}