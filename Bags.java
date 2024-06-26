public class Bags{
   public static void main(String args[]){
       String brandName[]={"skybag","f-gear","safari"};
	   int  size[]={25,30,45};
	   long cost[]={120000l,4500000l,53000000l};
	   char waterResistant[]={'Y','N','Y'};
	   
	   for(int index = 0;index<brandName.length;index++)
	   {
	      System.out.println("Brands : "+brandName[index]);
	   }
	   
	   for(int index = 0;index<size.length;index++)
	   {
	      System.out.println("sizes : "+size[index]);
	   }
	   
	   for(int index = 0;index<cost.length;index++)
	   {
	      System.out.println("cost : "+cost[index]);
	   }
	   
	   for(int index = 0;index<waterResistant.length;index++)
	   {
	      System.out.println("water resistant : "+waterResistant[index]);
	   }
	 }
	}