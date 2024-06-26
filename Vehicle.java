public class Vehicle{
   public static void main(String args[]){
       String name[]={"car","bike","auto"};
	   int noOfWheels[]={4,2,3};
	   long cost[]={4500000l,45326000l,520000l};
	   char roadTransport[]={'Y','Y','Y'};
	   
	   System.out.println("name of vehicles : ");
	   for(int i =0;i<name.length;i++)
	   {
	     System.out.println(name[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("number of wheels : ");
	   for(int i =0;i<noOfWheels.length;i++)
	   {
	     System.out.println(noOfWheels[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("cost : ");
	   for(int i =0;i<cost.length;i++)
	   {
	     System.out.println(cost[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("mode of road transportation : ");
	   for(int i =0;i<roadTransport.length;i++)
	   {
	     System.out.println(roadTransport[i] + " ");
	   }
	}
}