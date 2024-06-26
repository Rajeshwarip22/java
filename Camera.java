public class Camera{
   public static void main(String args[]){
    String name[]={"canon","sony","panasonic"};
	int memorySize[]={64,128,12};
	long cost[]={150000l,530000l,620000l};
	
	for(int index=0;index<name.length;index++)
	{
	  System.out.println("camera : "+name[index]);
	}
	
	for(int index=0;index<memorySize.length;index++)
	{
	  System.out.println("size of memory : "+memorySize[index]);
	}
	
	for(int index=0;index<cost.length;index++)
	{
	  System.out.println("cost : "+cost[index]);
	}
  }
}	