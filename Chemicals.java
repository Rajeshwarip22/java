public class Chemicals{
   public static void main(String args[]){
       String name[]={"sodium","potassium","nitrogen"};
	   int mass[]={45,23,60};
	   long qnty[]={5600l,77000l,36444l};
	   char reactive[]={'Y','N','Y'};
	   
	   System.out.println("name of chemicals : ");
	   for(int i =0;i<name.length;i++)
	   {
	     System.out.println(name[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("mass of the chemicals : ");
	   for(int i =0;i<mass.length;i++)
	   {
	     System.out.println(mass[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("quantity of chemical required : ");
	   for(int i =0;i<qnty.length;i++)
	   {
	     System.out.println(qnty[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("reactive : ");
	   for(int i =0;i<reactive.length;i++)
	   {
	     System.out.println(reactive[i] + " ");
	   }
	}
}