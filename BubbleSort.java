//Java programi per implementimin e Bubble Sort
import java.util.*;

public class BubbleSort {
	public void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// shkembehen arr[j+1] dhe arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	/* Shfaq vargun */
	public void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Metoda main
	public static void main(String args[])
	{
		long startTime = System.nanoTime();

		BubbleSort ob = new BubbleSort();
		int arr[] = { 5, 1, 4, 2, 8 };
		ob.bubbleSort(arr);
		System.out.println("Vargu i sortuar");
		ob.printArray(arr);
		long finishTime = System.nanoTime();
		long excecutionTime = finishTime - startTime;
		System.out.println("Koha e ekzekutimit ne nanosekona: " + excecutionTime + " ns");	
	}
}

