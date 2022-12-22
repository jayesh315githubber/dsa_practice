package selectionsort;
import java.util.Iterator;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 4, 2, 1, 6, 3, 57, 5, 9, 7 };

		SelectionSort.selectionSort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void selectionSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
