abstract class OrderProcessor{
  public final void processOrder(){
    malzemeHazirla();
    yemekPisir();
    servisEt();
    hesapOlusutur();
  }
  
  abstract void malzemeHazirla();
  
  abstract void yemekPisir();
  
  void servisEt(){
    System.out.println("servis edildi");
  }
  
  void hesapOlusutur(){
    System.out.println("hesap oluşturuldu");
  }
}
class Pizzasiparis extends OrderProcessor{
  void malzemeHazirla(){
    System.out.println("pizza için malzeme hazıerladı");
  }
  void yemekPisir(){
    System.out.println("pizza fırına atıldı");
  }
}

class Hamburgersiparis extends OrderProcessor{
  void malzemeHazirla(){
    System.out.println("hamburger için malzeme hazıerladı");
  }
  void yemekPisir(){
    System.out.println("hamburger pişirildi");
  }
}
public class Main{
  public static void main(String[] args){
    OrderProcessor siparis1 = new Pizzasiparis();
    siparis1.processOrder();
    System.out.println("------------------");
    
    OrderProcessor siparis2 = new Hamburgersiparis();
    siparis2.processOrder();
  }
}