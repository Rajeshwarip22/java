public class Pharmacy{
	
    public static void PharmDetails()
	{
		String name = "Ram Dev Pharmacy";
		String addr = "White field";
		long mob = 9148721225l;
		System.out.println("Name :"+name+"\n"+"Address :"+addr+"\n"+"contact number :"+mob);
		System.out.print("\n");
	}
	
   public static void Instock()
   {
      boolean medicine=true;
      if(medicine)
	  {
	     System.out.println("instock");
	  }
	  else
	  {
	    System.out.println("out of stock");
	  }
	  System.out.print("\n");
    }
	
	
    public static void OnlineOrder()
	{
      boolean prscrbtn=true;
      if(prscrbtn)
      {
         System.out.println("order accepted");
      }
      else
	  {
         System.out.println("order accepted");
      }
	  System.out.print("\n");
    }
	
	
    public static void Delivery()
	{
      String loc="bangalore";
      if(loc == "bangalore")
      {
        System.out.println("free delivery");
      }
      else
      {
        System.out.println("store pick up");
      }
	  System.out.print("\n");
    }
	
	
	public static int Bill()
	{
	  int tot=125;
	  int gst=50;
	  return tot+gst;
    }
	
  }