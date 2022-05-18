package java_interface;

public class MySqlDatabase implements IDatabase {
	public void giris() {
		System.out.println("MySqlDatabase'e baglandi");
	}
	
	public void ekle() {
		System.out.println("Verilen islemler MySqlDatabase'e kaydedildi.");
	}
	
	public void sil() {
		System.out.println("Verilen islemler MySqlDatabase'den silindi.");
	}
	
	public void al() {
		System.out.println("Istenilen islemler MySqlDatabase'den getirildi.");
	}
	
	public void guncelle() {
		System.out.println("Istenilen islemler MySqlDatabase uzerinde guncellendi.");
	}
}