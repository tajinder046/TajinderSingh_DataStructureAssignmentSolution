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
public class Driver {
    
    static RightSkewedBinarySearchTree rsbt = new RightSkewedBinarySearchTree();
	

	public static void main(String[] args) {
		RightSkewedBinarySearchTree.Node node = new RightSkewedBinarySearchTree.Node(50);
        node.left = new RightSkewedBinarySearchTree.Node(30);
        node.right = new RightSkewedBinarySearchTree.Node(60);
        node.left.left = new RightSkewedBinarySearchTree.Node(10);
        node.left.right = new RightSkewedBinarySearchTree.Node(40);

        rsbt.rightSkewedTree(node);
        rsbt.printTree(rsbt.getRootnode());

	}
    
}
