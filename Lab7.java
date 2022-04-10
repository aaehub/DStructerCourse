/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;

/**
 *
 * @author Abdualrahman-AAE
 */

public class Lab7 {
 
          static int step_recursive;
           static int step_iterative;

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
    
          
           
           int list []={10, 20, 30, 40, 41, 42, 43, 45, 46};
           
      int result_recursive, result_iterative;
	
      
       for (int i = 0; i < 9; i++) {
        int m =list[i];	
	          System.out.println("-------------------M = "+m+"---------------");
	result_iterative = IFIB(m);
	System.out.println("Fibonacci:"+ result_iterative+" step _iterative "+ step_iterative);
        
          
        
	result_recursive = RFIB(m);
	 System.out.println("Fibonacci:"+ result_recursive+" step_recursive " +step_recursive);    
           step_iterative=0;
           step_recursive=0;
           }
      
	    
        }

           
     
static int RFIB(int n)
{       
	step_recursive++;
	if(n <= 1){
           
            return n;}
        
	return RFIB(n-1) + RFIB(n-2);
        
}


static int IFIB(int n)
{
        int Fi_1, Fi_2, Fi =0;
	int i;
	
	if(n <= 1) {
                
		return n;}
	
	Fi_1 = 0;
	Fi_2 =1;
       if(n ==0) 
       { return Fi_1;   }
	for(i=2; i<=n; i++)
	{
		Fi = Fi_1 + Fi_2;
		Fi_1 = Fi_2;
		Fi_2 = Fi;
		 step_iterative++;
	}
       
	return Fi_2;	
}
         
  }



