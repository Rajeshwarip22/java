public class Laptop{
   public static void main(String args[]){
      int ramSize[]={8,16,32};
      String name[]={"hp","lenova","mac"};
      long cost[]={45000l,75000l,100000l};
      char chargType[]={'A','B','C'};
  
   for(int t=0;t<ramSize.length;t++)
   {
      System.out.println("RAM sizes are : ",ramSize[t]);
   }
   
   for(int t=0;t<name.length;t++)
   {
      System.out.println("Names are : ",name[t]);
   }

   for(int t=0;t<cost.length;t++)
   {
      System.out.println("RAM sizes are : ",cost[t]);
   }
   
   for(int t=0;t<chargType.length;t++)
   {
      System.out.println("Supported charge types are : ",chargType[t]);
   }
 }
}