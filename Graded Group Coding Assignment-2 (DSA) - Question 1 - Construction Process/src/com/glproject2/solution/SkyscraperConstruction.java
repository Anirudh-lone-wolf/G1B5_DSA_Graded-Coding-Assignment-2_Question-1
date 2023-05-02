package com.glproject2.solution;
import java.util.*;

public class SkyscraperConstruction {
	
	public Stack<Integer> arrangeFloorsStack = new Stack<>();

	public void arrangeFloors(int floorSizeTobeAssembled, int[] sizeOfFloors) {
		System.out.println("The order of construction is as follows\n");
		
		for(int j = 0; j < sizeOfFloors.length; j++) {
			
			System.out.println("Day: "+(j+1));
			
			if(sizeOfFloors[j] != floorSizeTobeAssembled) {//cannot be assembled
				System.out.println();
				arrangeFloorsStack.push(sizeOfFloors[j]);
			}
			
			else {//can be assembled
				floorSizeTobeAssembled--;
				System.out.print(sizeOfFloors[j] + " ");
				while(!arrangeFloorsStack.isEmpty() && floorSizeTobeAssembled == arrangeFloorsStack.peek()) {
					floorSizeTobeAssembled--;
					System.out.print(arrangeFloorsStack.pop()+" ");
				}
				System.out.println();
			}
		}	
	}
}