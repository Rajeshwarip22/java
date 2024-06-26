public class Subject{
   public static void main(String args[]){
       String name[]={"english","kannada","hindi","science","maths"};
	   int studyHr[]={4,5,2,6,4};
	   long score[]={542,620,531,423,200}; 
	   
	   for(int index = 0;index<name.length;index++)
	   {
	      System.out.println("Subjects are : "+name[index]);
	   }
	   
	   for(int index = 0;index<studyHr.length;index++)
	   {
	      System.out.println("Study hours: "+studyHr[index]);
	   }
	   
	   for(int index = 0;index<score.length;index++)
	   {
	      System.out.println("Scores are : "+score[index]);
	   }
	  }
	 }