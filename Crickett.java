 public class Crickett{
   public static void rate(int runs, int overbowled, String name, int score)
   {
   double runrate=( runs/overbowled);
   System.out.println("Runrate :" + runrate);
   System.out.println("player name :" + name);
   System.out.println("Total score :" + score);
   }
   public static void results(boolean result)
   {
     if(result)
	 {
		   System.out.println("match win" + result);
	 }
	 else
	 {
		   System.out.println("lost match");
	 }
   }
   public static void details(String name, int age, double height, float weight, String education, int matches, int score)
   {
     System.out.println("The player name:" + name + "\n" + "Age :" + age + "\n" + "height :" + height + "\n" + "weight :" + weight + "\n"+
             "Education :"+ education+ "\n" + "Total matches :"+ matches+ "\n" + " Total score:"+ score);
   }			 
}