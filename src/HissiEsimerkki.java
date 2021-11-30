
public class HissiEsimerkki {

	public static void main(String[] args) {
		
		{
			Elevator elevator = new Elevator();
		//	elevator.floor = 3;
		//	System.out.println("Floor " + elevator.floor);
			
			elevator.goUpDown("up");
			elevator.goUpDown("up");
	//		elevator.PrintData();
			
			
			elevator.setFloor(9);
			System.out.println(elevator.getFloor());
		}
		

	}

}

class Elevator
{

private int floor;

public int getFloor() {
	return floor;
}

public void setFloor(int floor) {
	
	if (floor > 0 && floor <=10)
	this.floor = floor;
	else {
		System.out.println("ERROR - The floor should be between 1-10");
	}
}

public Elevator()
{
	floor = 0;
}

public void PrintData()
{
	System.out.println("ELEVATOR");
	System.out.println("Floor: " + floor);
}

public void goUpDown(String direction)
{
if (direction.equals("up"))
{
	floor++;
}
else
{
	floor--;
}
PrintData();

}
}
