public class Biriyani
{
  public static void ingredients(String ingrdt1,String ingrdt2)
  {
    System.out.println("1. ingredient : "+ingrdt1);
	System.out.println("2. ingredient : "+ingrdt2);
  }
  
  public static void review(int rating)
  {
    if(rating == 10)
	{
	  System.out.println("wow");
	}
	else if (rating<10 && rating>5)
	{
	  System.out.println("good");
	}
	else
	{
	 System.out.println("worst");
	}
  }
  public static void bill(int qnty,float price)
  {
	  //float prc = price;
	  //int qty = qnty;
	  float totCost = price * qnty;
      double gstRate = 2.0;
      double gstAmt=(totCost * gstRate)/100;
      double finalPrice = totCost + gstAmt;
      System.out.println("Total :"+finalPrice);
  }
}  
    
	
  