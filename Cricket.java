public class Cricket{
    public static void main(String args[]){
       String players[]={"dhoni","virat","rahul"};
	   int four[]={5,6,7};
	   long score[]={562,426,125};
	   char team[]={'A','B','C'};
	
	   System.out.println("name of players : ");
	   for(int i =0;i<players.length;i++)
	   {
	     System.out.println(players[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("fours achived : ");
	   for(int i =0;i<four.length;i++)
	   {
	     System.out.println(four[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("scores  : ");
	   for(int i =0;i<score.length;i++)
	   {
	     System.out.println(score[i] + " ");
	   }
	   System.out.print("\n");
	   
	   System.out.println("teams : ");
	   for(int i =0;i<team.length;i++)
	   {
	     System.out.println(team[i] + " ");
	   }
	}
}
	