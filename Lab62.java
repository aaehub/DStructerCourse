/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg2;

/**
 *
 * @author Abdualrahman-AAE
 */

class stack      // the node data type
{
    int n = 25;
    int top ;
    int[] S = new int[n];

    public stack() {
    }}

public class Lab62 {

  

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
    
            
                       
   String Slist []=new String[]{"{1}", "[1}", "((())", "a)b)","(((5)6))","[a(c{d}(c))]","(",")", ")(","()"};
            
              
                 
      for (int i = 0; i < 10; i++) {
               // Creating array of string length
        
      char[] ch = new char[Slist[i].length()];
       
     
        // Copy character by character into array
      
               for (int j = 0; j < Slist[i].length() ; j++) {
                 
                   
                   ch[j] = Slist[i].charAt(j);
        }
          
               
               
               System.out.println(Slist[i]);
                  BAL_PAR(ch); 
      
           }
  
        
          
          
//  
//        // Creating array of string length
//        char[] ch = new char[str.length()];
//  
//       
//           System.out.println();
//        // Copy character by character into array
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//        }
//        
//          BAL_PAR(ch);
//          
          
        
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
   
static  boolean BAL_PAR (char [] word){
    stack check=new stack() ;
    check.top=-1;
    
    int n = word.length;
    
    
    for (int i = 0; i < n; i++) {
        char c = word[i];
        if(c == '(' || c == '{' || c == '['){ // open parenthesis, so push
                 PUSH(check, c);}
        else if(c == ')' || c == '}' || c == ']'){
        if(isEmpty(check)){
            System.out.println("error");
            return false;
        }
       char o = POP(check);
        
       if((c==')' && o!='(') || (c=='}' && o!='{') || (c==']' && o!='[')){
                System.out.println("error");
       return false;}
           } 
    
    }
       if(!isEmpty(check)){
           System.out.println("error"); // parenthesis in stack, cases like [(), so mismatch
           return false;
       
       } 
      System.out.println("correct");
       return true;
 
}


}

