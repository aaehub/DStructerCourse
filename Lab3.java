/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Lab3 
{
    static void Linear_Search(int A[], int key)
    {
        
        int Linear_Comparison = 0;
        for(int i=A.length-1; i > 0; i--)
        {
            Linear_Comparison++;
            if(A[i] == key)
            { System.out.println("------------------------------------");
                System.out.println("Found at Position " + i);
                System.out.println("Number of Comparisons: " + Linear_Comparison);
        
                return;
            }
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        Linear_Comparison++;
        System.out.println("Not Found by Linear Search");
        System.out.println("Number of Comparisons: " + Linear_Comparison);
           
    }
    
    
    
    
      static void Binary_Search(int A[], int key)
    {
           
        int mid, low, high;
        int Binary_Comparison = 0;
        low = 0;
        high = 9;
        
        while(low <= high)
        {
            Binary_Comparison++;
            mid = (low + high)/2;
            if(A[mid] == key)
            {
                System.out.println("Found at Position " + mid);
                System.out.println("Number of Comparisons: " + Binary_Comparison);
                return;
            }
            else if(key > A[mid])     // go right
            {
                low = mid + 1;
            }
            else                        // go left
            {
                high = mid - 1;
            }
        }
        System.out.println("Not Found by Binary Search ");
        
        System.out.println("Number of Comparisons: " + Binary_Comparison);
     
    }
       static void Binary_SearchR(int A[], int key)
    {
        
           
        int mid, low, high;
        int Binary_Comparison = 0;
        low = 0;
        high = 9;
        
        while(low <= high)
        {
            Binary_Comparison++;
            mid = (low + high)/2;
            if(A[mid] == key)
            {
                System.out.println("Found at Position " + mid);
                System.out.println("Number of Comparisons: " + Binary_Comparison);
                return;
            }
            else if(key > A[mid])     // go right
            {
                high = mid - 1;
               
            }
            else                        // go left
            {
                low = mid + 1;
            }
        }
        System.out.println("Not Found by Binary Search ");
        
        
        
        System.out.println("Number of Comparisons: " + Binary_Comparison);
        
    }

    
      static void reverse(int[] array) {
     for(int i=0; i<array.length/2; i++){

        int j= array[i];

        array[i] = array[array.length -i -1];

        array[array.length -i -1] = j;

            }
     }
    
    public static void main(String[] args) 
    {
       
        //Lab3 L3 = new Lab3();
        int A[] = new int[10];
        
        for(int i=0; i<10; i++)
        {
           A[i] =  (int)(Math.random()*20);
        }    
        
      
        int key = 0; 
        System.out.println(Arrays.toString(A));
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 1 for linear Search or 2 for Binary Search");
        int a=sc.nextInt();

        switch (a){
                case 1:
        
        
          for (int i = 0; i < 10; i++) {
        key = i;
        
        
        Linear_Search(A, key);
        System.out.println("Search by Linear Search the key " + key);
            System.out.println(Arrays.toString(A));
        
        }
               
                break;
                
                
                case 2:
        
        
        Arrays.sort(A);
      
        reverse(A);
            System.out.println("----------- array after sort and reverse -------------"); 
            System.out.println(Arrays.toString(A));
            System.out.println("-------------------- ---------------------\n"); 
         
         for (int i = 0; i < 10; i++) {
         key = i;
        System.out.println("Search by Binary Search for key " + key);
         Binary_SearchR(A, key);
         System.out.println("================================="); 
   
        }

           break;

        }
       
      
    }

   
}
