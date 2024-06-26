public class Snacks{
   public static void main(String args[]){
       String name[]={"lays","chocolate","cakes"};
	   int qnty[]={5,6,4};
	   long cost[]={45,62,75};
	   char veg[]={'Y','Y','N'};
	   
	   System.out.println("name of snacks : ");
	   for(int i =0;i<name.length;i++)
	   {
	     System.out.println(name[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("quantities required : ");
	   for(int i =0;i<qnty.length;i++)
	   {
	     System.out.println(qnty[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("cost estimated : ");
	   for(int i =0;i<cost.length;i++)
	   {
	     System.out.println(cost[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("is vegitarian : ");
	   for(int i =0;i<veg.length;i++)
	   {
	     System.out.println(veg[i] + " ");
	   }
	}
}
	   