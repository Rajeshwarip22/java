public class Box{
   public static void main(String args[]){
       String shape[]={"square","rectangle","triangle"};
	   int vol[]={23,45,46};
	   long area[]={45000l,5600096l,7500000l};
	   char materialGrade[]={'A','B','C'};
	   
	   for(int j=0;j<shape.length;j++)
	   {
	     System.out.println("shape : "+shape[j]);
	   }
	   
	    for(int j=0;j<vol.length;j++)
	   {
	     System.out.println("volume : "+vol[j]);
	   }
	   
	    for(int j=0;j<area.length;j++)
	   {
	     System.out.println("area : "+area[j]);
	   }
	   
	    for(int j=0;j<materialGrade.length;j++)
	   {
	     System.out.println("material Grade : "+materialGrade[j]);
	   }
	}
}