public class Mobile{
   public static void main(String args[]){
       String brandName[]={"samsung","iphone","redmi"};
	   int storage[]={16,64,128};
	   long cost[]={1250000l,1500000l,630000};
	   char led[]={'Y','N','Y'};
	    
	   for(int i = 0;i<brandName.length;i++)
	   {
	     System.out.println("Mobiles : " + brandName[i]);
	   }
	   
	   for(int i = 0;i<storage.length;i++)
	   {
	    System.out.println("storage : " + storage[i]);
	   }
	   
	   for(int i = 0;i<cost.length;i++)
	   {
	    System.out.println("cost : " + cost[i]);
	   }
	   
	   for(int i = 0;i<led.length;i++)
	   {
	    System.out.println("display type led : " + led[i]);
	   }
	 }
 }