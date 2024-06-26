public class Travel{
    public static void main(String args[]){
	   String destination[]={"bangalore","mysore","chennai");
	   int time[]={8,9,15};
	   long distance[]={15000l,20000l,65000l};
	   char climate[]={'H','C','H'};
	   
	   System.out.print("destinations are : ");
	   for(int i=0;i<destination.length;i++)
	   {
	    System.out.print(destination[i]+ " ");
	   }
	   System.out.println("\n");
	   
	   System.out.print("time are : ");
	   for(int i=0;i<time.length;i++)
	   {
	    System.out.print(time[i]+ " ");
	   }
	   System.out.println("\n");
	   
	   System.out.print("total distance  : ");
	   for(int i=0;i<distance.length;i++)
	   {
	    System.out.print(distance[i]+ " ");
	   }
	   System.out.println("\n");
	   
	   System.out.print("climate are : ");
	   for(int i=0;i<climate.length;i++)
	   {
	    System.out.print(climate[i]+ " ");
	   }
	  }
	 }