
public class ConstructorEsimerkki {

	public static void main(String[] args) {

		Näyttö monitor1 = new Näyttö();
		monitor1.printData();
		
		Näyttö monitor2 = new Näyttö("Miele");
		monitor2.printData();
		
		Näyttö monitor3 = new Näyttö("LG", true);
		monitor3.printData();
	}

}//end of the monitor app

class Näyttö
{
	public boolean isOn;
	public String brand;
	
	public Näyttö()  //default constructor
	{
		brand="";
		isOn=false;
	}
	
	public Näyttö(String brandName)  //parameterized constructor
	{
		isOn=false;
		brand = brandName;
	}
	public Näyttö(String brand, boolean isOn) //parameterized constructor
	{
		this.isOn=isOn;							//jos samat nimet, käytä this.
		this.brand = brand;
	}
	
	public void start()
	{
		isOn = true;
	}
	
	public void shutdown()
	{
		isOn = false;
	}
	
	public void printData()
	{
		System.out.println("Monitor");
		System.out.println("Brand: " +brand);
		if (isOn)
		{
			System.out.println("The monitor is on");
		}
		
		else
		{
			System.out.println("The monitor is off");
		}
	}
}