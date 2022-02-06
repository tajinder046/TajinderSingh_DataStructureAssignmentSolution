/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructionScheduling;

/**
 *
 * @author asus
 */

import java.util.Scanner;

public class ConstructionPlanning {
    public int size;
		public int day;
		
		
		 private static void bubbleSort(ConstructionPlanning[] planArray) {
			 
			 int n = planArray.length;
			 ConstructionPlanning temp = new ConstructionPlanning();
			 
			 	for(int i=0; i < n; i++){
			 		for(int j=1; j < (n-i); j++){
			 
			 			if(planArray[j-1].size < planArray[j].size){
			 				temp.size = planArray[j-1].size;
			 				temp.day=planArray[j-1].day;
			 				planArray[j-1].size = planArray[j].size;
			 				planArray[j-1].day=planArray[j].day;
			 				planArray[j].size = temp.size;
			 				planArray[j].day=temp.day;
			 			}
			 
			 		}
			 	}
			 
		}
		public static void main(String[] args) {
		
		
		int noFloors;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the total number of floors in the building");
		noFloors=in.nextInt();
		
		ConstructionPlanning plan[]=new ConstructionPlanning[noFloors];
		for(int i=0;i<noFloors;i++) {
			
			plan[i]=new ConstructionPlanning();
			System.out.println("enter the floor size given on day:"+(i+1));
			plan[i].size=in.nextInt();
			plan[i].day=(i+1);
		}
		
		bubbleSort(plan);
		
		
		int i=0;
		int day=1;
		int floorDay;
		
		System.out.println();
		System.out.println("The order of construction is as follows");
		System.out.println();
		
		while(day!=noFloors+1){
			floorDay=plan[i].day;
			if(day<floorDay) {
				while(day<floorDay) {
					System.out.println("day:"+day);
					System.out.println();
					day=day+1;
				}
			}
			if(day==floorDay) {
				System.out.println("day:"+day);
				while(plan[i].day<=day&&i<=plan.length) {
					System.out.print(plan[i].size);
					System.out.print(" ");
					i=i+1;
					if(i>plan.length-1) {
						break;
					}
				}
				System.out.println();
			}
			day=day+1;
		}
	}
    
}
