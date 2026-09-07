class DersKitabi {
    String kitapBasligi;

    public DersKitabi(String kitapBasligi) {
        this.kitapBasligi = kitapBasligi;
    }
}

interface Kopyalanabilir {
    Kopyalanabilir derinKopya();
}

class UniversiteOgrencisi implements Kopyalanabilir {
    String isim;
    DersKitabi calistigiKitap;

    public UniversiteOgrencisi(String isim, DersKitabi calistigiKitap) {
        this.isim = isim;
        this.calistigiKitap = calistigiKitap;
    }

    public UniversiteOgrencisi derinKopya() {
        DersKitabi yeniKitapKopyasi = new DersKitabi(this.calistigiKitap.kitapBasligi);
        return new UniversiteOgrencisi(this.isim, yeniKitapKopyasi);
    }

    public void bilgileriEkranaBas() {
        System.out.println("Öğrenci: " + isim + " - Çalıştığı Kitap: " + calistigiKitap.kitapBasligi);
    }
}

public class Soru2Main {
    public static void main(String[] args) {
        
        UniversiteOgrencisi ogrenci1 = new UniversiteOgrencisi("Emre", new DersKitabi("Matematik"));

        UniversiteOgrencisi ogrenci2 = ogrenci1.derinKopya();

        ogrenci2.isim = "Hasan";
        ogrenci2.calistigiKitap.kitapBasligi = "Fizik";

        System.out.println("ORİJİNAL");
        ogrenci1.bilgileriEkranaBas();

        System.out.println("\nKLON");
        ogrenci2.bilgileriEkranaBas();
    }
}