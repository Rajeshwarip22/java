 public class ArrayElements{
  public static void main(String args[]){
    int cubeNum[]={3,6,9,12,15,18};
	String fruits[]={"apple","mango","orange","grapes"};
	char consonent[]={'a','b','c','d'};
	byte height[]={2,3,4,5,6};
	float weight[]={3.2f,4.5f,5.3f};
	long cost[]={452361897l,4562318973l,4526137952l};
	boolean val[]={true,false,true,false};
	       
    System.out.println("the length of integer array is : " + cubeNum.length);  
    for(int i=0;i<cubeNum.length;i++){
        System.out.println("cube numbers are "+cubeNum[i]);
    }
	System.out.println("\n");
        
	System.out.println("the length of String array is : " + fruits.length);	
    for(int i=0;i<fruits.length;i++){
          System.out.println("fruits are "+fruits[i]);
     }
    System.out.println("\n");
		 
	System.out.println("the length of char array is : " + consonent.length);	 
	for(int i=0;i<consonent.length;i++){
        System.out.println("consonents are "+consonent[i]);
    }
	System.out.println("\n");
		 
    System.out.println("the length of byte array is : " + height.length);   
    for(int i=0;i<height.length;i++){
         System.out.println("heights are "+height[i]);
    }
	System.out.println("\n");
	
    System.out.println("the length of float array is : " + weight.length);	
	for(int i=0;i<weight.length;i++){
      System.out.println("weights are "+weight[i]);
    }
	System.out.println("\n");
		 
	System.out.println("the length of long array is : " + cost.length);
	for(int i=0;i<cost.length;i++){
        System.out.println("costs are "+cost[i]);
    }
	System.out.println("\n");
        
	System.out.println("the length of boolean array is : " + val.length);
    for(int i=0;i<val.length;i++){
        System.out.println("values are "+val[i]);
    }
    System.out.println("\n");
    }
}
