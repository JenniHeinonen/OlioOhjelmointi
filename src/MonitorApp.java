
public class MonitorApp {

	public static void main(String[] args) {
		
		Monitor monitor1 = new Monitor();
		Monitor monitor2 = new Monitor();
		
		Mouse mouse1 = new Mouse();
		
		mouse1.onClicked();
		mouse1.onClicked();
		
		monitor1.start();
		monitor2.isOn=false;
		
		System.out.println(monitor1.isOn);
		
		//System.out.println("Monitor is " + monitor1.isOn);
		
		if (monitor1.isOn == true)
		{
			System.out.println("Monitor is on.");
		}
		else
		{
			System.out.println("Monitor is off");
		}
		
	}

}// End of the MonitorApp


class Monitor
{
	public boolean isOn;
	
	public void start()
	{
		isOn = true;
	}
	
	public void shutdown()
	{
		isOn = false;
	}
}