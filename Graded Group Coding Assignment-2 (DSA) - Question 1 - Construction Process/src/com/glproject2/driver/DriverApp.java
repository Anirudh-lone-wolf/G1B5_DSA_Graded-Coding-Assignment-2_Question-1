package com.glproject2.driver;
import java.util.*;
import com.glproject2.solution.*;

public class DriverApp {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the total no of floors in the building");
			int noOfFloors = sc.nextInt();

			int[] sizeOfFloors = new int[noOfFloors]; //creating an array to store the size of each floor in the Skyscraper

			int i;
			for(i =0; i < sizeOfFloors.length; i++) {

				System.out.println("enter the floor size given on day : "+(i+1));
				int floorSize = sc.nextInt();

				if(floorSize <= 0) {
					System.out.println("The size of the floor has to be a positive integer. So, enter a valid floor size");
					i--;
				}

				else if(floorSize > noOfFloors) {//as shown in the test cases
					System.out.println("The floor size cannot be greater than the number of floors in the building. So, enter a valid floor size");
					i--;
				}
				
				else if(containsDuplicate(sizeOfFloors, floorSize)){
					 System.out.println("The floor size entered is a duplicate. Enter a distinct floor size.");
			            i--;
				}

				else 
					sizeOfFloors[i] = floorSize;		
			}

			sc.close();
			System.out.println();

			SkyscraperConstruction skyscraperConstruction = new SkyscraperConstruction();
			skyscraperConstruction.arrangeFloors(noOfFloors, sizeOfFloors);
		}
	}
	
	public static boolean containsDuplicate(int[] arr, int val) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == val) {
	            return true;
	        }
	    }
	    return false;
	}
	
}


