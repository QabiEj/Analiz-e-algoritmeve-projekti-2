import java.io.*;
import java.util.*;

public class BubbleSortRekursiv {

	// Main
	public static void main(String[] args)
	{
		int arr[] = { 2, 5, 1, 6, 9 };

		// thirret funksioni
		bubblesort(arr, 5);
		for (int i = 0; i < 5; i++) {
			System.out.printf(arr[i] + " ");
		}
	}

	// funksioni per sortimin e vargut rekusivisht 
	public static void bubblesort(int arr[], int n)
	{

		// kushti baze per rekurzion 
		if (n == 0 || n == 1) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {

			// nese arr[i] me i madh se arr[i+1] athere
			// swap(arr[i], arr[i+1])
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}
		bubblesort(arr, n - 1);
	}

	// funksioni per swap tw elementit tw arr qe ndodhet te indeksi i dhe j
	public static final void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

