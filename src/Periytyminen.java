
public class Periytyminen {

	public static void main(String[] args) {
		
		System.out.println(Laskuri.laskePintaAla(2, 5));

	}

}
class Laskuri
{
	
	//Static mahdollistaa sen, että metodia voi kutsua suoraan luokan kautta
	public static int laskePintaAla(int pituus, int leveys)
	{
		return pituus*leveys;
	}
}