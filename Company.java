public class Company{
   public static void main(String args[]){
    String name[]={"tcs","wipro","intel"};
	int noOfEmployee[]={45000,5000,6000};
	long salary[]={120000,450000,60000};
	char team[]={'A','B','C'};
	
	System.out.println("name of chemicals : ");
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
	
	System.out.println("teams : ");
	for(int i =0;i<team.length;i++)
	{
	  System.out.println(team[i] + " ");
	}
  }
}	