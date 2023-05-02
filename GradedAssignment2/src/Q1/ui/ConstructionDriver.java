package Q1.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ConstructionDriver {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int totalNumberOfFloors;
		System.out.print("Enter the total no of floors in the building: ");
		totalNumberOfFloors = in.nextInt();
		
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		
		for(int i = 1 ; i <= totalNumberOfFloors; i++) {
			System.out.print("Enter the floor size given on Day #"+i+": ");
			data.put(i, in.nextInt());
		}
		
		ArrayList<Integer> readyFloorsList = new ArrayList<>();
		int searchFloor = totalNumberOfFloors;
		int currentFloor;
		boolean flag = true;

		System.out.print("\nThe order of construction is as follows\n\n");
		
		for(int i = 1 ; i <= totalNumberOfFloors; i++) {
			flag = true;
			System.out.println("\nDay #" + i);
			currentFloor = data.get(i);
			readyFloorsList.add(currentFloor);
			if(searchFloor >= currentFloor) {
				while(flag) {
					flag = false;
					readyFloorsList.sort(Collections.reverseOrder());
					if(!readyFloorsList.isEmpty()  &&  readyFloorsList.get(0) == searchFloor) {
						System.out.print(searchFloor+" ");
						searchFloor--;
						readyFloorsList.remove(0);
						flag = true;
					}
				}
			}
		}		
		
		in.close();
	}

}
