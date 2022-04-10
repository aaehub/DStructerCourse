/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4;

import java.util.Arrays;

/**
 *
 * @author Abdualrahman-AAE
 */
public class A4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
           
             int [][] arr  = new int[4][4];
                    int n= arr.length;
                        System.out.println(n);
             for(int i=0; i<arr.length;i++)
                {
            for(int j=0;j<arr.length;j++)
            {
              double rand =Math.random()*20;
                arr[i][j]=(int)rand;
             
                 }}
             System.out.println("old array is");
                 
             for(int i=0; i<arr.length;i++)
                {
                    System.out.println(Arrays.toString(arr[i]));
                
                }
                
             
             int temp;
                for(int r=1; r <= n-1;r++){
                 for(int c=0;c <= r-1;c++){
                     temp= arr[r][c];
                     arr[r][c] =arr[c][r]; 
                         arr[c][r]=temp;
                 }
                }
           
                 System.out.println("new array is");
         
                 for(int i=0; i<arr.length;i++)
                {
                    System.out.println(Arrays.toString(arr[i]));
                
                }
                
    }
}
