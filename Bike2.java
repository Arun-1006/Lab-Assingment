abstract class Bike2{
      Bike2()
	{
	System.out.println("This is Bike");
	}
	
	void getGear()
	{
	System.out.println("Gear may change");
	}
	
	abstract void run();

}

class Honda extends Bike2{
	void run()
	{
	System.out.println("Bike may run");
	}

	public static void main(String args[]){

	Honda ref=new Honda();
	ref.getGear();
	ref.run();
   }
}