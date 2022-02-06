/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author asus
 */

import java.util.Stack;

public class Service {
    
    public void orderOfConstruction(int[] floorSize, int days) {
		
		
		 Stack<Integer> sizeStack = new Stack<>();
	        int biggestSizeInADay = days;
	        System.out.println("Order of Construction");
	        for (int i = 0; i < days; i++) {
	            int sizeOfTheDay = floorSize[i];
	            if (sizeOfTheDay < biggestSizeInADay) {
	                sizeStack.push(sizeOfTheDay);
	                System.out.println("Day: " + (i + 1) + " ");
	            } else {
	                System.out.println("Day: " + (i + 1));
	                System.out.print(sizeOfTheDay + " ");
	                biggestSizeInADay--;
	                while (!sizeStack.isEmpty() && sizeStack.peek() >= biggestSizeInADay) {
	                    System.out.print(sizeStack.pop() + " ");
	                    biggestSizeInADay--;
	                }
	            }
	            System.out.println();
	        }	
	}
    
}
