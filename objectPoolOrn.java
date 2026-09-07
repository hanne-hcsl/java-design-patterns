import java.util.ArrayList;
import java.util.List;

class Arac {
    String plaka;

    public Arac(String plaka) {
        this.plaka = plaka;
    }
}

class AracHavuzu {
    List<Arac> havuz = new ArrayList<>();

    public AracHavuzu() {
        havuz.add(new Arac("61 FEM 01"));
        havuz.add(new Arac("61 ABC 02"));
    }
    public Arac aracAl() {
        if (havuz.isEmpty()) {
            System.out.println("Havuzda araç yok.");
            return null;
        }
        System.out.println(havuz.get(0).plaka + " alındı.");
        return havuz.remove(0);
    }
    public void iadeEt(Arac arac) {
        if (arac != null) {
            havuz.add(arac);
            System.out.println(arac.plaka + " iade edildi.");
        }
    }
}
public class AracKiralama {
    public static void main(String[] args) {
        AracHavuzu havuz = new AracHavuzu();

        Arac a1 = havuz.aracAl();
        Arac a2 = havuz.aracAl();
        Arac a3 = havuz.aracAl();

        havuz.iadeEt(a1);
        Arac a4 = havuz.aracAl();
    }
}