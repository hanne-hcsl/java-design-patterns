interface UygulamaFormat {
    void ilet(String mesaj);
}

class Whatsapp implements UygulamaFormat {
    @Override
    public void ilet(String mesaj) {
        System.out.println("whatsApptan mesaj gönderildi: " + mesaj);
    }
}

class Eposta implements UygulamaFormat {
    @Override
    public void ilet(String mesaj) {
        System.out.println("epostadan mesaj gönderildi: " + mesaj);
    }
}

abstract class Mesaj {
    protected UygulamaFormat uygulama;

    public Mesaj(UygulamaFormat uygulama) {
        this.uygulama = uygulama;
    }

    abstract void gonder(String metin);
}

class NormalMesaj extends Mesaj {
    public NormalMesaj(UygulamaFormat uygulama) {
        super(uygulama);
    }

    @Override
    void gonder(String metin) {
      
        uygulama.ilet(metin);
    }
}

class SifreliMesaj extends Mesaj {
    public SifreliMesaj(UygulamaFormat uygulama) {
        super(uygulama);
    }

    @Override
    void gonder(String metin) {
    
        String sifreliMetin = metin;
 
        uygulama.ilet(sifreliMetin);

    }
}

public class Main {
    public static void main(String[] args) {
        Mesaj m1 = new NormalMesaj(new Whatsapp());
        m1.gonder("hi");

        Mesaj m2 = new SifreliMesaj(new Whatsapp());
        m2.gonder("hi");
        
        Mesaj m3 = new NormalMesaj(new Eposta());
        m3.gonder("hi");
        
        Mesaj m4 = new SifreliMesaj(new Eposta());
        m4.gonder("hi");
    }
}
