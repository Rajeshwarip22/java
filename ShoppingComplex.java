public class ShoppingComplex{
   public static void main(String args[]){
    String name[]={"forum","max","lifestyle"};
	int sales[]={4500,4500,6000};
	long members[]={45000l,523664100l,2365000l};
	char block[]={'A','B','C'};
	
	for(int index=0;index<name.length;index++)
	{
	  System.out.println("shopping complex name : "+name[index]);
	}
	
	for(int index=0;index<sales.length;index++)
	{
	  System.out.println("sales per day : "+sales[index]);
	}
	
	for(int index=0;index<members.length;index++)
	{
	  System.out.println("number of people working : "+members[index]);
	}
	
	for(int index=0;index<block.length;index++)
	{
	  System.out.println("building number : "+block[index]);
	}
  }
}	
	