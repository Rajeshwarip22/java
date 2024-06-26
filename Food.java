public class Food{
   public static void main(String args[]){
    String name[]={"idly","dosa","rice"};
	int protein[]={45,26,45};
	long qnty[]={450,523,360};
	char veg[]={'Y','N','Y'};
	
	System.out.println("food names are : ");
	for(int i = 0;i<name.length;i++)
	{
	  System.out.println(name[i]+" ");
	}
	System.out.print("\n");
	
	System.out.println("protein contains in grams : ");
	for(int i = 0;i<protein.length;i++)
	{
	  System.out.println(protein[i]+" ");
	}
	System.out.print("\n");
	
	System.out.println("quantities are : ");
	for(int i = 0;i<qnty.length;i++)
	{
	  System.out.println(qnty[i]+" ");
	}
	System.out.print("\n");
	
	System.out.println("is vegetarian : ");
	for(int i = 0;i<veg.length;i++)
	{
	  System.out.println(veg[i]+" ");
	}
  }
 }