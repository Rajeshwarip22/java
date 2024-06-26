public class CheckEvenOdd{
   public static void main(String args[]){
       int num[]={5,4,3,20,45,30};
	   int evenCount=0;
	   int oddCount=0;
	   
	   /* using if-else condition 
	   for(int x=0;x<num.length;x++)
	   {
	     if( num[x]%2 == 0)
		 {
		   System.out.println("even numbers are :"+ num[x]);
           evenCount++;		   
		 }
		 else
		 {
		   System.out.println("odd numbers are :"+ num[x]);
           oddCount++;
		 }
	   }
	   System.out.println("number of odd numbers are : "+oddCount);
	   System.out.println("number of even numbers are : "+evenCount);*/
	   
	   
	   System.out.print("even numbers are : ");
	   for(int x=0;x<num.length;x++)
	   {
	     if( num[x]%2 == 0)
		 {
		   System.out.print(num[x] + " ");
           evenCount++;		   
		 } 
	   }
	   System.out.print("\n");
	   System.out.println("even numbers count : "+evenCount);
	   System.out.print("odd numbers are : ");
	   for(int x=0;x<num.length;x++)
	   {
	     if( num[x]%2!=0)
	     {
		   System.out.print(num[x] + " ");
		   oddCount++;
	     }
	   }
	   System.out.print("\n");
	   System.out.println("odd numbers count : "+oddCount);
	}
}