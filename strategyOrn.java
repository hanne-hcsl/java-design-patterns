interface YolStrategy{
  void rutin(String start, String end);
}
class MinYol implements YolStrategy{
  public void rutin(String start, String end){
    System.out.println("en kısa yol hesaplandı " + start + ", " + end);
  }
}
class MaxYol implements YolStrategy{
  public void rutin(String start, String end){
    System.out.println("en uzun yol hesaplandı " + start + ", " + end);
  }
}
class TrafikliYol implements YolStrategy{
  public void rutin(String start, String end){
    System.out.println("trafikli yol hesaplandı " + start + ", " + end);
  }
}
class Navigasyon {
  private YolStrategy strateji;
  public void setStrateji(YolStrategy strateji) {
    this.strateji = strateji;
  }
  public void hesapla(String start, String end) {
    if (strateji != null) {
      strateji.rutin(start, end);
    }
  }
}
public class Main {
  public static void main(String[] args) {
    Navigasyon nav = new Navigasyon();
    
    nav.setStrateji(new MinYol());
    nav.hesapla("Ev", "Okul");
    
    nav.setStrateji(new MaxYol());
    nav.hesapla("Ev", "Okul");
    
    nav.setStrateji(new TrafikliYol());
    nav.hesapla("Ev", "Okul");
  }
}