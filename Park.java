public class Park{
   public static void main(String args[]){
       String name[]={"bandipur","nagarahole","periyar"};
	   int noOfFlora[]={56,450,530};
	   long area[]={7800000l,5600000l,9600000l};
	   char redFlag[]={'Y','N','Y'};
	   
	   for(int index = 0;index<name.length;index++)
	   {
	      System.out.println("Parks namely : "+name[index]);
	   }
	   
	   for(int index = 0;index<noOfFlora.length;index++)
	   {
	      System.out.println("Flora species : "+noOfFlora[index]);
	   }
	   
	    for(int j=0;j<area.length;j++)
	   {
	     System.out.println("area : "+area[j]);
	   }
	   
	   for(int index = 0;index<redFlag.length;index++)
	   {
	      System.out.println("issued red flag : "+redFlag[index]);
	   }
	}
}