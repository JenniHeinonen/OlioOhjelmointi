
public class ConstructorEsimerkki {

	public static void main(String[] args) {

		Monitor monitor1 = new Monitor();
		monitor1.printData();
		
		Monitor monitor2 = new Monitor("Miele");
		monitor2.printData();
		
		Monitor monitor3 = new Monitor("LG", true);
		monitor3.printData();
	}

}//end of the monitor app

class Monitor
{
	public boolean isOn;
	public String brand;
	
	public Monitor()  //default constructor
	{
		brand="";
		isOn=false;
	}
	
	public Monitor(String brandName)  //parameterized constructor
	{
		isOn=false;
		brand = brandName;
	}
	public Monitor(String brand, boolean isOn) //parameterized constructor
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