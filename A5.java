/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5;

/**
 *
 * @author Abdualrahman-AAE
 */
class node      // the node data type
{
    int data;
    node next;
}  

public class A5 
{
    static node insert_first(node head, int d)
    {
        node e = new node();    // create a new node and initialize
        e.next = null;
        e.data = d;
        
        e.next = head;      // insert and update head. This will work even if head is null (empty list)
        head = e;
        return head;
    }

    static node insEmpty(node head, int d)
    {
        node e = new node();    // create a new node and initialize
        e.next = null;
        e.data = d;
        head=e;
    return head;
    }
    static node insert_last(node head, int d)
    {
        node e = new node();       // create a new node and intialize
        e.data = d;
        e.next = null;
        
        if (head == null)       // list empty, now only one element
        {
            head = e;
            return head;
        }
        
        node prev;      // more than one node
        prev = head;
        while(prev.next != null)
            prev = prev.next;
        prev.next = e;
        return head;
    }
    


    static node delete_first(node head)
    {
        if (head == null)       // list empty
        {
            System.out.println("List Empty");
            return head;
        }
        head = head.next;   // one or more node, move head to the next node
        return head;
    }
    
    static node delete_last(node head)
    {
        node e, prev;
        
        if (head == null)   //list empty
        {
            System.out.println("List Empty");
            return head;
        }
        
        if (head.next == null)  // only one node
        {
            head = null;
            return head;
        }
        
        prev = head;    // more than one node
        e = head.next;
                                // go to the last node by e
        while(e.next != null)   // and its previous node by prev
        {
            prev = e;
            e = e.next;
        }
        prev.next = e.next;
        return head;
    }
    
    static void traverse_print(node head)
    {
        node e; // create a temporary variable
        e = head;   // start frm head
        while (e != null)   //  move until null
        {
            System.out.print(e.data + " ");
            e = e.next;
        }
        System.out.println();
    }
    

    
    
   
   static node insert_after_x(node head, int d,int x)
    {

        node  p = new node();
        p.data=d;
        node  cur;
        cur = head;
        
       if(head == null){                                       //is empty 
           System.out.println("empty");
           head=insEmpty(head,d);
           return head;
       }
       
        while (cur!= null){                                   
        
            
           
            if(cur.data == x){                                 //not present
                 
                  p.next = cur.next;                        // first or last and between
                 cur.next = p;
              
             return head;
            }
       
         
           cur= cur.next;
           
        }
        System.out.println("not found");
        
        return head;
        
    }
  
   
   
    static node delete_x(node head ,int x)
    {
            node cur,prev;
      
         if(head == null){
                System.out.println("empty");
                return head;
            }
    
            if(head.data == x){
            head = head.next;
               return head;
            
            }
         cur = head.next;
         prev = head;
       
       while (cur != null){
    
    if(cur.data == x){
        prev.next = cur.next;
         return head;
                }
        prev = cur;
         cur = cur.next;
    
    }
         System.out.println("not found");
        return head;
    }
    
    
 
    
    
    public static void main(String[] args) 
    {
        node head ;
         head=null;
        
//        
//        head.data = 10;
//        head.next = null;
        
//        node p = new node();
//        p.data = 5;
//        p.next = null;
//        head.next = p;
        
        
        
         
        
          traverse_print(head);
          System.out.println("=====insert Q1=====");
          System.out.println("\n");
          
          int x=1; System.out.println("x is " +x);
          head = insert_after_x(head, 1, 10);
          System.out.println("empty list");
          traverse_print(head);
            System.out.println("\n");
            
            x=1; System.out.println("x is " +x);
         System.out.println("x the first node");
          head = insert_after_x(head, 2, 1);
          traverse_print(head);
            System.out.println("\n");
            
            x=2; System.out.println("x is " +x);
        System.out.println("x is the last node");
          head = insert_after_x(head, 4, x);
          traverse_print(head);
            System.out.println("\n");
            x=25; System.out.println("x is " +x);
          System.out.println("x not present");
           head = insert_after_x(head, 100, 25);
          traverse_print(head);
            System.out.println("\n");
            x=2; System.out.println("x is " +x);
          System.out.println("x inside the list");
           head = insert_after_x(head, 3, 2);
          traverse_print(head);
            System.out.println("\n");
        
    
          node head2 ;
            head2 = null;
              
              
   
        
      
         
              
              
              System.out.println("list is:");
            traverse_print(head2);
          System.out.println("=====delete Q2=====");
          System.out.println("\n");
          
          
            System.out.println("empty list");
         head2 = delete_x(head2, -5);
          traverse_print(head2);
            System.out.println("\n");
            
     
       
        head2 = new node();
        head2.data = 1;
        head2.next = null;
     
        
        node c = new node();
        c.data =2;
       c.next = null;
        head2.next =c;
        
     node q= new node();
        q.data = 3;
        q.next = null;
        c.next =q;
        
        
         node a= new node();
        a.data = 9;
        a.next = null;
        q.next =a;
        
           node b= new node();
        b.data = 10;
        b.next = null;
        a.next =b;
        
        
        
             System.out.println("list is:");
            traverse_print(head2);
            System.out.println("=====delete Q2=====");
          
            x=1; System.out.println("x is " +x);  
         System.out.println("x the first node");
         head2 = delete_x(head2, x);
          traverse_print(head2);
            System.out.println("\n");
       
            x=10; System.out.println("x is " +x); 
        System.out.println("x is the last node");
         head2 = delete_x(head2,x);
          traverse_print(head2);
            System.out.println("\n");
        
            x=100; System.out.println("x is " +x);  
          System.out.println("x not present");
         head2 = delete_x(head2,100);
          traverse_print(head2);
            System.out.println("\n");
            x=3; System.out.println("x is " +x);
         
            System.out.println("x inside the list");
            head2 = delete_x(head2, x);
          traverse_print(head2);
            System.out.println("\n");
    }

   

   
}


