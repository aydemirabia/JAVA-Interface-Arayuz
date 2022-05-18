package java_interface;

public class OracleDatabase implements IDatabase {
	public void giris() {
		System.out.println("OracleDatabase'e baglandi");
	}
	
	public void ekle() {
		System.out.println("Verilen islemler OracleDatabase'e kaydedildi.");
	}
	
	public void sil() {
		System.out.println("Verilen islemler OracleDatabase'den silindi.");
	}
	
	public void al() {
		System.out.println("Istenilen islemler OracleDatabase'den getirildi.");
	}
	
	public void guncelle() {
		System.out.println("Istenilen islemler OracleDatabase uzerinde guncellendi.");
	}
}
