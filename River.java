public class River{
   public static void main(String args[]){
       String name[]={"ganga","kaveri","bhramaputra"};
	   int mass[]={45,65,85};
	   long flowDistance[]={15630130000l,452000000l,630000005321l};
	   char quality[]={'A','A','B'};
	   
	   System.out.println("name of rivers : ");
	   for(int i =0;i<name.length;i++)
	   {
	     System.out.println(name[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("mass of the water : ");
	   for(int i =0;i<mass.length;i++)
	   {
	     System.out.println(mass[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("distance of waterflow : ");
	   for(int i =0;i<flowDistance.length;i++)
	   {
	     System.out.println(flowDistance[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("quality : ");
	   for(int i =0;i<quality.length;i++)
	   {
	     System.out.println(quality[i] + " ");
	   }
    }
}
