abstract class SBike{
      SBike()
	{
	System.out.println("This is Bike");
	}
	
	static void getGear()
	{
	System.out.println("Gear may change");
	}
	
	abstract void run();

}

class Honda extends SBike{
	void run()
	{
	System.out.println("Bike may run");
	}

	public static void main(String args[]){

	Honda ref=new Honda();
	
	ref.run();
	SBike.getGear();
   }
}