
public class AutoLuokka {

	public static void main(String[] args) {
	
		Auto auto1 = new Auto();
		auto1.merkki = "Opel";
		auto1.malli = "Vectra";	
		auto1.bensanMaara = 9;
		auto1.tankataan = 5;
		
		
//
//		
//		
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.kiihdyta();
		auto1.tankkaa();
		
//		auto auto2 = new auto("Audi","A6", 15);
//		auto2.tankataan = 5;
//		auto2.tankkaa();
		
	}
	
}
	class Auto {
		
		
		public String merkki;
		public String malli;
		public int bensanMaara;
		public int tankataan;
		
//	public Auto(String m, String t, int b)
//		{
//			merkki = m;
//			malli = t;
//			bensanMaara = b;
//		}
		
		public void jarruta()
		{
			System.out.println("Auto jarruttaa");
			
			
		}
		
		
		public void kiihdyta()
		{
			
			bensanMaara=bensanMaara-1;
			if (bensanMaara>0)
			{
			System.out.println("Auto kiihtyy, bensaa jäljellä: "+bensanMaara);
			
			}
		}
		
		public void tankkaa()
		{
			
			System.out.println("Tankissa bensaa: "+bensanMaara);
			System.out.println("Tankataan: "+tankataan);
			System.out.println("Tankissa bensaa tankkauksen jälkeen: "+(bensanMaara+tankataan));
			
		}
		public void naytaTiedot()
		
		{
			System.out.println("Auton merkki: "+ merkki);
			System.out.println("Auton malli: "+ malli);
			System.out.println("Bensan määrä: "+ bensanMaara);
		}
		
	
		
	}