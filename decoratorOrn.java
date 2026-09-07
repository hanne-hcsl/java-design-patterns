interface Gonderim {
    String getTur();
    int getUcret();
}

class Standartgonderim implements Gonderim {
    @Override
    public int getUcret() {
        return 30;
    }

    @Override
    public String getTur() {
        return "Standart Gönderim";
    }
}
abstract class GonderimDecoretor implements Gonderim {
    protected Gonderim gonderim;
    
    public GonderimDecoretor(Gonderim gonderim) {
        this.gonderim = gonderim;
    }
    
    @Override
    public String getTur() {
        return gonderim.getTur();
    }
    
    @Override
    public int getUcret() {
        return gonderim.getUcret();
    }
}

class HizliKargo extends GonderimDecoretor {
    public HizliKargo(Gonderim gonderim) {
        super(gonderim);
    }
    
    @Override
    public String getTur() {
        return gonderim.getTur() + " + Hızlı Kargo";
    }
    
    @Override
    public int getUcret() {
        return gonderim.getUcret() + 20;
    }
}

class HediyePaketi extends GonderimDecoretor {
    public HediyePaketi(Gonderim gonderim) {
        super(gonderim);
    }
    
    @Override
    public String getTur() {
        return gonderim.getTur() + " + Hediye Paketi";
    }
    
    @Override
    public int getUcret() {
        return gonderim.getUcret() + 10;
    }
}

class SigortaliGonderim extends GonderimDecoretor {
    public SigortaliGonderim(Gonderim gonderim) {
        super(gonderim);
    }
    
    @Override
    public String getTur() {
        return gonderim.getTur() + " + Sigortalı Gönderim";
    }
    
    @Override
    public int getUcret() {
        return gonderim.getUcret() + 15;
    }
}

public class Main {
    public static void main(String[] args) {

        Gonderim gonderim = new Standartgonderim();
        System.out.println(gonderim.getTur() + " = " + gonderim.getUcret() + " TL");
        
        gonderim = new HizliKargo(gonderim);
        System.out.println(gonderim.getTur() + " = " + gonderim.getUcret() + " TL");

        gonderim = new HediyePaketi(gonderim);
        System.out.println(gonderim.getTur() + " = " + gonderim.getUcret() + " TL");

        gonderim = new SigortaliGonderim(gonderim);
        System.out.println(gonderim.getTur() + " = " + gonderim.getUcret() + " TL");
    }
}