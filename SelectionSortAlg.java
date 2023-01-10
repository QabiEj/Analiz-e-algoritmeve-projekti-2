
import java.io.*;
public class SelectionSortAlg
{
	public void sort(int arr[])
	{
		int n = arr.length;

		// Njw nga njw lwviz kufirin e nwnvargut tw parenditur
		for (int i = 0; i < n-1; i++)
		{
			// Gjej elementin minimal nw vargun e parenditur
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap elementin minimal tw gjetur me tw elementin e parw
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Shfaqw vargun
	public void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Main
	public static void main(String args[])
	{
		long startTime = System.nanoTime();
		SelectionSortAlg ob = new SelectionSortAlg();
		int arr[] = { 5, 1, 4, 2};
		ob.sort(arr);
		System.out.println("Vargu i sortuar");
		ob.printArray(arr);
		long finishTime = System.nanoTime();
		long excecutionTime = finishTime - startTime;
		System.out.println("Koha e ekzekutimit ne nanosekona: " + excecutionTime + " ns");
	}
}

