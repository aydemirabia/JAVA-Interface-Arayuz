package java_interface;
import java.util.Scanner;

public class DatabaseManager {
	private IDatabase database;
	DatabaseManager(IDatabase database){
		this.database = database;
	}
	
	public void girisDatabase() {
		database.giris();
	}
	
	public void ekleDatabase() {
		database.ekle();
	}
	
	public void silDatabase() {
		database.sil();
	}
	
	public void alDatabase() {
		database.al();
	}
	
	public void guncelleDatabase() {
		database.guncelle();
	}
	
	public void menuSecimi() {
		int kararVer;
		Scanner yaz = new Scanner(System.in);
		System.out.print("-----------------< Gerceklestirilecek Islemler >-----------------"
				+ "\n[1]- Veri Ekle"
				+ "\n[2]- Veri Sil"
				+ "\n[3]- Veri Getir"
				+ "\n[4]- Veri Guncelle \nKarariniz: ");
		
		kararVer = yaz.nextInt();
		switch(kararVer) {
		case 1:
			System.out.println("----------------------------------");
			ekleDatabase();
			System.out.println("----------------------------------");
			break;
		case 2:
			System.out.println("----------------------------------");
			silDatabase();
			System.out.println("----------------------------------");
			break;
		case 3:
			System.out.println("----------------------------------");
			alDatabase();
			System.out.println("----------------------------------");
			break;
		case 4:
			System.out.println("----------------------------------");
			guncelleDatabase();
			System.out.println("----------------------------------");
			break;
			
		default:
			System.out.println("------< Tanımsız Bir Değer Girdiniz >------");
		}
	}

}
