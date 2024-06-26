public class Bank{
   public static void main(String args[]){
	String name[]={"sbi","canara","bob"};
	int noOfEmployee[]={56000,50520,75000};
	long salary[]={5630000,590000,60000};
	char govt[]={'Y','Y','Y'};
	
	System.out.println("name of banks : ");
	for(int i =0;i<name.length;i++)
	{
	  System.out.println(name[i] + " ");
    }
	System.out.print("\n");
	
	System.out.println("number of employees : ");
	for(int i =0;i<noOfEmployee.length;i++)
	{
	  System.out.println(noOfEmployee[i] + " ");
    }
	System.out.print("\n");
	
	System.out.println("salary of employee : ");
	for(int i =0;i<salary.length;i++)
	{
	  System.out.println(salary[i] + " ");
    }
	System.out.print("\n");
	
	System.out.println("is govt bank : ");
	for(int i =0;i<govt.length;i++)
	{
	  System.out.println(govt[i] + " ");
	}
  }
}	