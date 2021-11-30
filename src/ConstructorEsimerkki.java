
public class ConstructorEsimerkki {

	public static void main(String[] args) {

		N�ytt� monitor1 = new N�ytt�();
		monitor1.printData();
		
		N�ytt� monitor2 = new N�ytt�("Miele");
		monitor2.printData();
		
		N�ytt� monitor3 = new N�ytt�("LG", true);
		monitor3.printData();
	}

}//end of the monitor app

class N�ytt�
{
	public boolean isOn;
	public String brand;
	
	public N�ytt�()  //default constructor
	{
		brand="";
		isOn=false;
	}
	
	public N�ytt�(String brandName)  //parameterized constructor
	{
		isOn=false;
		brand = brandName;
	}
	public N�ytt�(String brand, boolean isOn) //parameterized constructor
	{
		this.isOn=isOn;							//jos samat nimet, k�yt� this.
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