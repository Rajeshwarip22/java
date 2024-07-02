public class Shippment{
  public static void ShippingItem()
  {
   boolean fooditm = true;
   if(fooditm)
   {
    System.out.println("food dlvry");
   }
   else
   {
    System.out.println("goods dlvry");
	}
	System.out.print("\n");
   }
   
   public static void ShippingDesti()
   {
     System.out.println("Shiiping destination : Bangalore");
	 System.out.print("\n");
   }
   
    public static void ShippingSource()
	{
	 System.out.println("Shiiping source : Mysore");
	 System.out.print("\n");
	}
	
    public static void ShippingCost()
	{
	  int cost=2536;
	  int gst=9;
	  int tot=cost+gst;
	  System.out.println("total cost :"+tot);
	  System.out.print("\n");
	}
	
    public static void ShippingStatus()
	{
	 int destidist=5;
	 if (destidist == 0)
	 {
	   System.out.println("delivered");
	 }
	 else
	 {
	  System.out.println("Dispatched a day ago");
	 }
	
	}
}