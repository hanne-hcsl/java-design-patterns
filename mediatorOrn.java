
interface KontrolKule{
  void mesajGonder(String message, Ucak ucak);
}
class ChatRoom implements KontrolKule{
  @Override
  public void mesajGonder(String mesaj, Ucak ucak) {
        System.out.println("Kontrol Kulesi mesaj aldı (" + ucak.getIsim() + "): " + mesaj);
  }
}
abstract class Ucak {
    protected KontrolKule kule;
    protected String isim;
    
    public Ucak(KontrolKule kule, String isim) {
        this.kule = kule;
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void gonder(String mesaj) {
        System.out.println(isim + ": " + mesaj);
        kule.mesajGonder(mesaj, this); 
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}