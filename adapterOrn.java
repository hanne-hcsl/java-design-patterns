interface Cihaz{
  void ac();
  void kapat();
}
class EskiKlima{
  public void powerOn(){
    System.out.println("güç ünitesi başlatıldı");
  }
  public void powerOff(){
  System.out.println("güç ünitesi kapandı");
  }
}
class YeniKlima implements Cihaz{
  private EskiKlima eskiklima;
  
  public YeniKlima(EskiKlima eskiklima){
    this.eskiklima = eskiklima;
  }
  @Override
  public void ac(){
    eskiklima.powerOn();
  }
  @Override
  public void kapat(){
    eskiklima.powerOff();
  }
}
public class Main{
public static void main (String[] args) {
  EskiKlima eski = new EskiKlima();
  Cihaz adapter = new YeniKlima(eski);
  
  System.out.println("yeni sistem üzerinden komut veriliyor:");
  adapter.ac();
  adapter.kapat();
}
}