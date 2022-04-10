/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4.pkg2;

import java.util.Arrays;

/**
 *
 * @author Abdualrahman-AAE
 */
public class A42 {

    public static  int [][] fill(int A[][]){
    
     for(int i=0; i<A.length;i++)
                {
            for(int j=0;j<A[0].length;j++)
            {
              double rand =Math.random()*20;
                A[i][j]=(int)rand;
             
                 }}
        
    return A;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] A  = new int[4][3];
         int [][] B  = new int[3][2];
         int [][] C  = new int[4][2];
        
         
         fill(A);
         fill(B);
        
      
         
        calculation(A,B,C);
         System.out.println("-----------------A-----------");
        print(A);
        System.out.println("-----------------B-----------");
        print(B);
          System.out.println("-----------------C-----------");
        print(C);
       
        
    }

     
    
   public static void print (int A[][]){
    
     for(int i=0; i<A.length;i++)
               {
                    System.out.println(Arrays.toString(A[i]));
                
                }
    
   
    }
            
              
         
            
    public static  int [][] calculation(int A[][],int B[][] ,int C[][]){
       
        
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0; j < B.length-1; j++) {
               
                
                for (int k = 0; k <C.length-1; k++) {
                    C[i][j]+=A[i][k]* B[k][j];
                    
                    
                }
                
            }
           }
        
   
        
        return C;
    }
    
}
