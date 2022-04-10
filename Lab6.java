/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

/**
 *
 * @author Abdualrahman-AAE
 */

class stack      // the node data type
{
    int n = 5;
    int top ;
    int[] S = new int[n];

    public stack() {
    }
  

} 
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      
   
                stack a =new stack();
        a.top=-1;
         stack b =new stack();
        b.top=-1;
       
//         IMPORTANT ** : TO ADD AN ELEMENTS TO THE STACK, 
//         CHANGE FOR LOOP CONDITION , FOR EXAMPLE :
//         IF YOU WANTS TO ADD ONE ELEMENT YOU NEED TO CHANGE
//         5 TO 1 IF YOU WANT TO ADD TWO YOU NEED TO CHANGE 
//         5 TO TWO AND SO ON ... 
        for (int i = 1; i <=6; i++) {
             PUSH(a, (int) (Math.random() * 9));
        }
     
        
         for (int i = 0; i < 5; i++) {
             System.out.print(a.S[i]+" ");
             
        }
        
        System.out.println("");
       
      b=REVERSE_STRING(a,b);
   
          for (int i = 0; i < 5; i++) {
             System.out.print(b.S[i]+" ");
             
        }
        
          
        
        
    }
   
    
   
      static boolean isEmpty( stack a) {
       if(a.top == -1){
          
           return true;}
     return false;
  
  }
   
  static boolean  IsFull (stack a){
        if( a.top == a.n-1){
             return true;}
            return false;}

  static void   PUSH (stack a ,int x){
    
          if(IsFull(a)){
          System.out.println("full");  
          return ;}
       
        a.top = a.top + 1;
        a.S[a.top] = x;
        
        
        }
   
 static  char POP(stack a) {
        if(isEmpty(a)) {
           
            return '\u0000';
        }else{
            
        char temp =  (char) a.S[a.top];
            
        a.top = a.top -1 ;
         return temp;}
 
  }
   
static stack REVERSE_STRING (stack a,stack b){  
   int n = a.S.length; // S is the given string
   boolean mty=false;
   
   if(isEmpty(a)) {
          System.out.println("empty");
           return b;
        }else

           for (int i = 0; i < n; i++) {
           PUSH(b,POP(a));
    }
       
   return b;
        
                     
                     
}
}

