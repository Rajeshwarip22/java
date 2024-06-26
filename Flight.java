public class Flight{
   public static void main(String args[]){
    String destination[]={"chennai","hyderabad","kochi"};
	int cost[]={4500,1200,3200};
	long dist[]={45000l,560000l,6345100l};
	char classType[]={'G','B','E'};
	
	System.out.println("destinations : ");
	for(int i =0;i<destination.length;i++)
	{
	  System.out.println(destination[i] + " ");
    }
	System.out.print("\n");
	
	System.out.println("cost : ");
	for(int i =0;i<cost.length;i++)
	{
	  System.out.println(cost[i] + " ");
    }
	System.out.print("\n");
	
	System.out.println("distance : ");
	for(int i =0;i<dist.length;i++)
	{
	  System.out.println(dist[i] + " ");
    }
	System.out.print("\n");
	
	System.out.println("class type : ");
	for(int i =0;i<classType.length;i++)
	{
	  System.out.println(classType[i] + " ");
	}
  }
}	
	