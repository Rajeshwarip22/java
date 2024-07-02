import java.util.Random;

public class Dominos
{
  public static void customerDetails()
  {
	String name = "Rajeshwari P";
	long mob = 1236547890l;
   System.out.println("Name :"+name);
   System.out.println("mob :"+mob);
  }
  public static void TokenNumber()
  {
    Random randomGen = new Random();
    int tkn = randomGen.nextInt(100);
	System.out.println("Token number :"+tkn);
  }
  public static void Bill()
  {
   int cost = 123;
   int gst =  456;
   int discount = 123%10;
   int tot = cost + gst - discount;
   System.out.println("total bill :"+tot);
  }
  public static void Oder()
  {
	 Random randomGen = new Random();
	 int tkn = randomGen.nextInt(100);
	 if(tkn >0 && tkn<100)
	 {
		 System.out.println("onion pizza");
	     System.out.println("paprika pizza");
	 }
	 else
	 { 
        System.out.println("generate token number");
	 }
  }
  public static void OderStatus()
  {
	 boolean odrDlvry = true;
	 if(odrDlvry)
	 {
		 System.out.println("Order delivered");
	 }
	 else
	 {
		 System.out.println("order preparing");
	 }
	 
 }
}