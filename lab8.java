/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Abdualrahman-AAE
 */

public class lab8 
{
    static class tree_node
    {
        int data;
        tree_node left = null;
        tree_node right = null;
    }

    static void preorder(tree_node v)
    {
        if(v == null)
            return;
        System.out.print(v.data + " ");
        preorder(v.left);
        preorder(v.right);
    }
    
    static void inorder(tree_node v)
    {
        if(v == null)
            return;
        preorder(v.left);
        System.out.print(v.data + " ");
       
        preorder(v.right); 
        
    }
    
    static void postorder(tree_node v)
    {
         if(v == null)
            return;
        
        preorder(v.left);
        preorder(v.right);
        System.out.print(v.data + " ");
    }   
    
    static int tree_max(tree_node v)
    {
        if(v == null) return Integer.MIN_VALUE;
        int left_max;
        int right_max;
        left_max = tree_max(v.left);
        right_max = tree_max(v.right);
        return max(v.data, left_max, right_max);
    }
    
    static int max(int a, int b, int c)
    {
        if(b > a) a = b; 
        if(c > a) a = c;
        return a;
    }
    
    static int tree_height(tree_node v)
    {
     if (v == null)
            return -1;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = tree_height(v.left);
            int rDepth = tree_height(v.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
        
        
    }
    
    
    public static void main(String[] args) 
    {
        int max;
        
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
        
        
         System.out.println("---------------------tree 1---------------------");
        
           System.out.print("\nPreorder: ");        
        preorder(root);
        System.out.print("\nInorder: ");        
        inorder(root);
        System.out.print("\nPostorder: ");        
        postorder(root);
        
        max = tree_max(root);
        System.out.println("\nMaximum: " + max);
        
        System.out.println("\nHeight: " + tree_height(root));
        
        
        System.out.println("---------------------tree 2---------------------");
        System.out.print("\nPreorder: ");        
        preorder(root2);
        System.out.print("\nInorder: ");        
        inorder(root2);
        System.out.print("\nPostorder: ");        
        postorder(root2);
        
        max = tree_max(root2);
        System.out.println("\nMaximum: " + max);
        
        System.out.println("\nHeight: " + tree_height(root2));
        
            System.out.println("---------------------tree 3---------------------");
        
           System.out.print("\nPreorder: ");        
        preorder(root3);
        System.out.print("\nInorder: ");        
        inorder(root3);
        System.out.print("\nPostorder: ");        
        postorder(root3);
        
        max = tree_max(root3);
        System.out.println("\nMaximum: " + max);
        
        System.out.println("\nHeight: " + tree_height(root3));
    }
}
