package java_interface;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DatabaseManager databaseManager;
		int karar;
		Scanner karariYaz = new Scanner(System.in);
		System.out.println("-----------------INTERFACE (ARAYUZ) KULLANIMI-----------------\n");
		System.out.print("[1]-MySqlDatabase Baglantisi\n[2]-OracleDatabase Baglantisi\nKarariniz: ");
		karar = karariYaz.nextInt();
		
		switch(karar) {
		case 1:
			databaseManager = new DatabaseManager(new MySqlDatabase());
			System.out.println("----------------------------------");
			databaseManager.girisDatabase();
			System.out.println("----------------------------------");
			databaseManager.menuSecimi();
			break;
		case 2:
			databaseManager = new DatabaseManager(new OracleDatabase());
			System.out.println("----------------------------------");
			databaseManager.girisDatabase();
			System.out.println("----------------------------------");
			databaseManager.menuSecimi();
			break;
			default:
				System.out.println("------< Tanımsız Bir Değer Girdiniz >------");
		}
		
	}
}
