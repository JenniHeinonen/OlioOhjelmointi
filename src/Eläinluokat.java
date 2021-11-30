
public class El‰inluokat {

	public static void main(String[] args) {
		Koira koira = new Koira();
		koira.tulostaTiedot();
		koira.liiku();

		System.out.println(koira.ika);

		Lintu lintu = new Lintu();
		lintu.liiku();


		}

		} // PeriytyminenOhjelman lopetus

		class Elain
		{
		// protected = periytyy, mutta ei n‰y luokan ulkopuolelle
		protected int ika;
		// public = periytyy ja n‰kyy luokan ulkopuolelle
		public int paino;
		// private = ei periydy, eik‰ n‰y luokan ulkopuolelle
		private int pituus;

		public void liiku()
		{
		System.out.println("El‰in liikkuu");
		}

		public void tulostaTiedot()
		{
		System.out.println("Ik‰ " + ika);
		}
		}


		class Koira extends Elain
		{
		public String rotu;

		@Override
		public void tulostaTiedot()
		{
		System.out.println("Ik‰ " + ika);
		System.out.println("Rotu " + rotu);
		}

		@Override
		public void liiku()
		{
		System.out.println("Koira juoksee");
		}
		}

		class Lintu extends Elain
		{
		public String laji;

		public void haudo()
		{
		System.out.println("Lintu hautoo");
		}

		@Override
		public void liiku()
		{
		System.out.println("Lintu lent‰‰");
		}

		@Override
		public void tulostaTiedot()
		{
		System.out.println("Ik‰ " + ika);
		System.out.println("Laji " + laji);
		}
		}