public class Shopping
{
  public static void ShoppingType(String shptyp)
  {
   System.out.println("Shopping type :"+shptyp);
   System.out.print("\n");
  }
  
  public static void cost(long prc,int gst)
  {
    long totalPrice = prc + gst;
	System.out.println("cost :"+prc);
	System.out.println("gst :"+gst);
	System.out.println("Total cost :"+totalPrice);
	System.out.print("\n");
  }
  public static void ShoppingItems(String itemName,String shptyp)
  {
  System.out.println("Item name :"+itemName);
  System.out.println("Shopping type :"+shptyp);
  System.out.print("\n");
  }
  public static void ShoppingDetails(String shptyp,String itemName,long totalPrice)
  {
   System.out.println("shopping type :"+shptyp);
   System.out.println("Item Name :"+itemName);
   System.out.println("cost :"+totalPrice);
  }
 }