package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 34;
		int sayi2 = 25;
		int sayi3 = 333;
		int sayi4 = 555;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3; 
		}
		
		if(enBuyuk<sayi4) {
			enBuyuk = sayi4;
		}
		
		System.out.println("En büyük = "+enBuyuk);
		
		
		
		
	}

}
