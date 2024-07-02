public class BaseClassRunner{
   public static void main(String args[])
   {
        int ad=BaseClass.add(5,5);
	System.out.println("addition result : "+ad);
	int sub=BaseClass.subtract(10,5);
	System.out.println("subtraction result : "+sub);
	int mul=BaseClass.multiply(5,5);
	System.out.println("multiply result : "+mul);
	double div=BaseClass.divide(5,5);
	System.out.println("divide result : "+div);
	double mod=BaseClass.modulus(5,5);
	System.out.println("modulus result : "+mod);
	}
}