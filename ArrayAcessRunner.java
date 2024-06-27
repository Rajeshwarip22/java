public class ArrayAcessRunner{
    public static void main(String args[]){
	   for(int i=0;i<ArrayAcess.place.length;i++)
	   {
	     if(ArrayAcess.place[i]=="bangalore")
		 {
		   System.out.println("value matched : "+ArrayAcess.place[i]);
		 }
		 else
		 {
		  System.out.println("value miss-matched : "+ArrayAcess.place[i]);
		 }
	  }
	}
	}