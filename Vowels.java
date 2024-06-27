public class Vowels{
   public static void main(String args[])
   {
      char arr[]={'a','r','s','e','p','i','M','U'};
	  
	  for(int index = 0;index < arr.length;index++)
	  {
	    if(arr[index] == 'a'|| arr[index]=='e' || arr[index]=='i' || arr[index]=='o' || arr[index]=='u' || arr[index]=='A'|| arr[index]=='E' || arr[index]=='I' || arr[index]=='O' || arr[index]=='U')
		{ 
	       System.out.println("Vowels are : ");
		   System.out.println(arr[index] + " ");
		}
		else
		{
			System.out.println("Consonents are : ");
			System.out.println(arr[index] + " ");
		}
	  }
	 }
	}