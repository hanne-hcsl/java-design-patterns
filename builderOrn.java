class Bilgisayar {
    String islemci;
    String ram;
    String depolama;
    String ekranKarti;

    public void ozellikleriYazdir() {
        System.out.println("Sistem -> İşlemci: " + islemci + " , RAM: " + ram + 
                           " , Depolama: " + depolama + " , GPU: " + ekranKarti);
    }
}

interface BilgisayarBuilder {
    void islemciTak();
    void ramTak();
    void depolamaTak();
    void ekranKartiTak();
    Bilgisayar bilgisayariAl();
}

class OyunPcBuilder implements BilgisayarBuilder {
    Bilgisayar pc = new Bilgisayar();

    public void islemciTak() { pc.islemci = "Intel Core i9"; }
    public void ramTak() { pc.ram = "32GB DDR5"; }
    public void depolamaTak() { pc.depolama = "2TB NVMe SSD"; }
    public void ekranKartiTak() { pc.ekranKarti = "NVIDIA RTX 4090"; }
    public Bilgisayar bilgisayariAl() { return pc; }
}

class OfisPcBuilder implements BilgisayarBuilder {
    Bilgisayar pc = new Bilgisayar();

    public void islemciTak() { pc.islemci = "Intel Core i3"; }
    public void ramTak() { pc.ram = "8GB DDR4"; }
    public void depolamaTak() { pc.depolama = "512GB SSD"; }
    public void ekranKartiTak() { pc.ekranKarti = "Dahili Grafik (Onboard)"; }
    public Bilgisayar bilgisayariAl() { return pc; }
}

class UretimBandi {
    public void uretimiBaslat(BilgisayarBuilder builder) {
        builder.islemciTak();
        builder.ramTak();
        builder.depolamaTak();
        builder.ekranKartiTak();
    }
}

public class Soru1Main {
    public static void main(String[] args) {
        UretimBandi uretimBandi = new UretimBandi();

        BilgisayarBuilder oyunBuilder = new OyunPcBuilder();
        uretimBandi.uretimiBaslat(oyunBuilder);
        Bilgisayar oyunBilgisayari = oyunBuilder.bilgisayariAl();
        
        System.out.println("OYUN BİLGİSAYARI");
        oyunBilgisayari.ozellikleriYazdir();

        BilgisayarBuilder ofisBuilder = new OfisPcBuilder();
        uretimBandi.uretimiBaslat(ofisBuilder);
        Bilgisayar ofisBilgisayari = ofisBuilder.bilgisayariAl();

        System.out.println("\nOFİS BİLGİSAYARI");
        ofisBilgisayari.ozellikleriYazdir();
    }
}