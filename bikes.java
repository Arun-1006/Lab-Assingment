abstract class bikes{
      bikes()
	{
	System.out.println("This is Bike");
	}
	
	void getGear()
	{
	System.out.println("Gear may change");
	}
}
class Honda extends bikes{

	public static void main(String args[]){

	Honda h=new Honda();
	h.getGear();
   }
}