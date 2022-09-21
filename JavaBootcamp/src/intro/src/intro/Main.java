package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		//integer
		int vade = 12;
		
		System.out.println(vade);
		
		
		double dolarDun = 18.20;
		double dolarBugun = 18.35;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} 
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);

		}
		
		//array
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halk Banktan","Mutlu Emekli","Bedava Para"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
