abstract class Bike1{
      Bike1()
	{
	System.out.println("This is Bike");
	}
	
	void getGear()
	{
	System.out.println("Gear may change");
	}
}
class Honda extends Bike1{
	Honda()
	{
	System.out.println("This is Honda");
	}

	public static void main(String args[]){

	Honda h=new Honda();
	h.getGear();
   }
}