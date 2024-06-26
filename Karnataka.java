public class Karnataka{
   public static void main(String args[]){
       String city[]={"bangalore","mysore","haveri"};
	   int forestArea[]= {45036,52300,10000};
	   long land[]={45035641l,6348950l,32658410l};
	   char developed[]={'Y','N','Y'};
	   
	   System.out.println("name of cities : ");
	   for(int i =0;i<city.length;i++)
	   {
	     System.out.println(city[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("forest area covered : ");
	   for(int i =0;i<forestArea.length;i++)
	   {
	     System.out.println(forestArea[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("land area : ");
	   for(int i =0;i<land.length;i++)
	   {
	     System.out.println(land[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("is developed : ");
	   for(int i =0;i<developed.length;i++)
	   {
	     System.out.println(developed[i] + " ");
	   }
    }
}
