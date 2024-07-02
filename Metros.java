public class Metros
{
 public static void SourceDestination(String src,String dstn)
 {
	 if(src == "banashankari" && dstn == "Btm")
	 {
		 System.out.println("ticket price is 25/- rs");
	 }
	 else
	 {
		 System.out.println("ticket price is 50/- rs");
	 }
	 System.out.print("\n");
 }
 
 public static void checkCardBal(int cardBal,int ticketPrice)
 {
	 int initialCardBal = cardBal;
	 int curTicketPrice = ticketPrice;
	 int remaingBalance = initialCardBal-curTicketPrice;
	 if(remaingBalance<0)
	 { 
        System.out.println("Zero balance");
	 }
	 else
	 {
		 System.out.println("the balance is :"+remaingBalance);
	 }
	 System.out.print("\n");
 }

}