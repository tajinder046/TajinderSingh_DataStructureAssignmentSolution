/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author asus
 */
public class Node {
    
    int val;
    Node left, right;
    
    Node(int item){
        val = item;
        left = right = null;
    }
    
}

class Main{
    public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
   
    static void convertToSkewed(Node root){
       
        
        if(root == null){
            return;
        }
       
        convertToSkewed(root.left);
        
        Node rightNode = root.right;
       
        if(headNode == null){
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else{
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
       
        convertToSkewed(rightNode);
        
    }
   
    static void traverseRightSkewed(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);       
    }
   
   
    public static void main (String[] args){
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.left.right= new Node(40);
     
        convertToSkewed(node);
        traverseRightSkewed(headNode);
    }
}
