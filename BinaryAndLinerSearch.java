/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryandlinersearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Abdualrahman-AAE
 */
public class BinaryAndLinerSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        
    
         
       boolean a=true ;
        while (a){
        
        
        System.out.println("please enter 7 digits ");
        Scanner userInput= new Scanner(System.in);
        ArrayList array=new ArrayList();
        
        
        
        //getting a number
        int number=userInput.nextInt();
        // Printing the last digit of the number
        while (number > 0) {
 
            // Finding the remainder (Last Digit)
            int reminder = number % 10;
 
            // Printing the remainder/current last digit
            array.add(reminder);
 
            // Removing the last digit/current last digit
            number = number / 10;
        }
        
        
        Collections.sort(array);
      
      
        
       boolean b = true;
        
           
        
          while(b){
            
      System.out.println("   ________________________");
      System.out.println("  |   choose              | "
                   + "\n  |1 for liner search     |"
                   + "\n  |2 for binary search    |"
                   + "\n  |3 to restart the array | "
                   + "\n  |4 to exit              | ");
      System.out.println("   ________________________");   
          
        int choice =userInput.nextInt();
        switch (choice) {
            case 1:
                
              
                System.out.println("𝕤𝕥𝕖𝕡𝕤 ="+liner(array));  
                System.out.println("done");
                
               
             
             break;
              
            case 2:
            
                
                System.out.println("𝕤𝕥𝕖𝕡𝕤  = "+binary(array)); 
                System.out.println("done");
               
                break;
                
                
                   
            case 3:
                   b=false;
                    break;
                
            case 4:
                    
                    System.out.println("exit");
                    b=false;
                    a=false;
                    break;
            default:
                System.out.println("please enter a valid number");
                break;
        }
          
          
        }//b   
        }//a
    
    }
    
    
    public static int liner(ArrayList a){
       
           
        System.out.println("enter the number you want to find (form the list):"+ a.toString() );
        Scanner userInput= new Scanner(System.in);
     
        int choice= userInput.nextInt();
        
        int steps=0;
       
          
       
           if(a.contains(choice)) {
                  
               for (int i = 0; i < a.size(); i++) {
                  
                   if (choice == (int)a.get(i)){
                       break;
                   }
                 steps++;
               }
               System.out.println("found");
               steps+=1;
               
                
               }
                else if(a.contains(choice)==false) {
                  
                  
                   for (int i = 0; i < a.size(); i++) {
                     
                       if(choice<(int)a.get(i)){
                        steps++;
                        break;
                        
                        }else{
                            steps++;}
                       
                           
                           
                     }
                 
                   System.out.println("not found");
               }
           
           
              return steps;
    
    }
    
    
     public static int binary(ArrayList ab){
       
        boolean loop=true;
       int steps=0;

       
       System.out.println("enter the number you want to find (form the list):"+ ab.toString() +"or e to exit");
       Scanner userInput= new Scanner(System.in);
        
        String input=userInput.next();
         
        
            
     
     
            
        int choice= Integer.parseInt(input);
         ArrayList a=(ArrayList)ab.clone();
 
         
          int i =0;
               
        while ( steps <= 3) {
           
             i = a.size()/2;
          
             
      
                //4           < x
             if((int)a.get(i) < choice){
                
                 if (a.contains(choice)){
                         
                 for (int j = 0; j <= i ;  j++) {
                     a.remove(0); 
                   
                 }   
                     System.out.println(a+"<");  
                     steps++;
                 }
                 
                 else if(a.contains(choice)== false){
                     
                        System.out.println("not found");
                               
                       steps=3;        
                     
                     break;
                 }
                 

             }else if((int)a.get(i) > choice){
                      int tmp=a.size();
                    if (a.contains(choice)){
                          
                      for (int j = 0; j < tmp-i ;  j++) {
                        a.remove( a.size() - 1);}
                         System.out.println(a+">");
                         steps++;
                  
                    }
                    else if(a.contains(choice)== false){
                             
                            System.out.println("not found");
                            steps=3;
                        
                            break;
                    
                        }
                        
                        
             }else if ((int)a.get(i)==choice){
                    System.out.println("found");
                     steps++; 
                      System.out.println(a+"=");
                      break;
                    
                        }
             
             
          }
      
        a=ab;
         System.out.println("a"+a);
         
          return steps; 
          
       
    }
     
}
