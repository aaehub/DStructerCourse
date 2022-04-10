/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Abdualrahman-AAE
 */

public class Lab9 {

     static class tree_node
    {
        int data;
        tree_node left = null;
        tree_node right = null;
    }

    static void lvlOrder(tree_node v)
    {
       Queue <tree_node> q = new LinkedList<>();
       
    q.add(v);
    
    while (!q.isEmpty() ){
          
    tree_node x = q.remove();
     System.out.println(x.data);
    
    if(x.left != null)
         q.add(x.left); 

    if(x.right != null)
         q.add(x.right);
    
    }
    
    
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
   
          // create tree
        tree_node root = new tree_node();
        root.data = 4;
        
        tree_node p = new tree_node();
        p.data = 7;
        root.left = p;
        
    
        
        tree_node x = new tree_node();
        x.data = 9;
        root.right = x;
        
        
        tree_node q = new tree_node();
        q.data = 1;
        x.right = q;
        
        
        
        tree_node y = new tree_node();
        y.data = 5;
        x.left = y;
        
        tree_node z = new tree_node();
        z.data = -2;
        p.right = z;
        
        
        tree_node zz = new tree_node();
        zz.data = 0;
        p.left = zz;
        
        
        // create tree 2 
        tree_node root2 = new tree_node();
        root2.data = 9;
        
        tree_node p2 = new tree_node();
        p2.data = 4;
        root2.right = p2;
         
        
        
        tree_node q2 = new tree_node();
        q2.data = 7;
        p2.right = q2;
        
        tree_node z2 = new tree_node();
        z2.data = -1;
        q2.right = z2;
   
        tree_node w2 = new tree_node();
        w2.data = 0;
        z2.right = w2;
        
        
        // create tree 3
       tree_node root3 = new tree_node();
        root3.data =-1;
        
        tree_node q3 = new tree_node();
        q3.data = 7;
        root3.right = q3;
        
        tree_node z3= new tree_node();
        z3.data = 2;
        q3.left = z3;
        
          tree_node w3 = new tree_node();
        w3.data = 0;
        z3.right = w3;
        
         
        tree_node y3 = new tree_node();
        y3.data = 5;
        w3.left = y3;
       
       
      System.out.println("------------tree1----------");
    lvlOrder(root);
        System.out.println("------------tree2----------");
    lvlOrder(root2);       
              System.out.println("------------tree3----------");
        lvlOrder(root3);
    
    
    
    }
   
}
