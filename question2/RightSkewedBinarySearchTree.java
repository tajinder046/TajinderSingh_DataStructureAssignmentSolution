/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author asus
 */
public class RightSkewedBinarySearchTree {
    
    private Node current = null;
    private Node previous = null;

     static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    void rightSkewedTree(Node root){
         if(root != null){
        	 rightSkewedTree(root.left);
             Node right = root.right;

            if(current == null){
            	current = root;
            }else{
            	previous.right = root;
            }
             root.left = null;
             previous = root;

             rightSkewedTree(right);
         }
    }

    public Node getRootnode() {
        return current;
    }


    void printTree(Node root){
         if(root != null){
             System.out.print(root.data + " ");
             printTree(root.right);
         }
    }
    
}
