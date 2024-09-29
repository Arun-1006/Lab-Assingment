abstract class SBike2{
      SBike2()
	{
	System.out.println("This is Bike");
	}
	
	static void getGear()
	{
	System.out.println("Gear may change");
	}
	
	abstract void run();

}

class Honda extends SBike2{
	void run()
	{
	System.out.println("Bike may run");
	}

	static void getGear()
	{
	System.out.println("bike has two Tyers");
	}


	public static void main(String args[]){

	Honda ref=new Honda();
	
	ref.run();
	SBike2.getGear();
	Honda.getGear();
   }
}