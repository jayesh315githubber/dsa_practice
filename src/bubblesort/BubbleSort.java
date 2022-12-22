package bubblesort;

import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {5,2,4,1,9,7};
		bubbleSort(arr);

	}

	public static void bubbleSort(int arr[]) {

		boolean swapping;

		for (int i = 0; i < arr.length; i++) {

			swapping = false;
			
			for (int j = 0; j < arr.length - i - 1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapping = true;
				}
			}
			
			if(swapping == false) {
				break;
			}
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
