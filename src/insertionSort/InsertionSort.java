package insertionSort;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 12, 75, 63, 42, 20, 34, 74, 44 };

		insertionSort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void insertionSort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {

			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
