package sesliHarfler;

public class main {

	public static void main(String[] args) {
		char harf = 'Y';
		
		switch(harf) {
		  case 'A':
		  case 'I':
		  case 'O':
		  case 'U':
		       System.out.println("Kalın Harf");
		       break;
		  default:
			   System.out.println("İnce Harf");
		}

	}

}
