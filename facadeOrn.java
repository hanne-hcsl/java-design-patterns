class HastaKayıtKontrol{
  public void  kayıtkontrol(){
    System.out.println("hasta kaydı kontrol ediliyor");
  }
}
class DoktorMusaitligi{
  public void musaitlik(){
    System.out.println("doktor müsaitliği kontrol ediliyoe");
  }
}
class RandevuOlustur{
  public void randevuolustur(){
    System.out.println("randevu oluşturuluyor");
  }
}
class BildirimGönder{
  public void bildirimGönder(){
    System.out.println("bildirim gönderiliyor");
  }
}
class HastaneRandevuSistemi{
  private HastaKayıtKontrol kontrol;
  private DoktorMusaitligi musait;
  private RandevuOlustur randevu;
  private BildirimGönder bildirim;
  
  public HastaneRandevuSistemi(){
    kontrol = new HastaKayıtKontrol();
    musait = new DoktorMusaitligi();
    randevu = new RandevuOlustur();
    bildirim = new BildirimGönder();
  }
  
  public void randevuAl(){
    System.out.println("randevu için kontrol ediliyor");
    kontrol.kayıtkontrol();
    musait.musaitlik();
    randevu.randevuolustur();
    bildirim.bildirimGönder();
  }
}
public class Main{
  public static void main(String[] args){
    HastaneRandevuSistemi hasta = new HastaneRandevuSistemi();
    hasta.randevuAl();
  }
}