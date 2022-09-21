
public class Main {

	public static void main(String[] args) {
		char grade  = 'C';
		
		switch(grade) {
		case'A': //durum bildirir
			System.out.println("Mükemmel : Geçtiniz");
			break; //durumu bitirir
		case 'B' : 
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C' : 
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D' : 
			System.out.println("Fena Değil : Geçtiniz");
		case 'F' : 
			System.out.println("Maalesef Kaldınız");
			break;
		default: //bu durumların harici
				System.out.println("Geçersiz Not Girdiniz");
		}
	}

}
