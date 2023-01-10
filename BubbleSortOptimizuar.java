import java.io.*;

public class BubbleSortOptimizuar
{
    // Njw version i optimizuar Bubble Sort
    public static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // shkembehen arr[j] dhe arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            if (swapped == false)
                break;
        }
    }
 
    // Funksioni per printim te nje vargu
    public static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Main
    public static void main(String args[])
    {
    	long startTime = System.nanoTime();

        int arr[] = { 5, 1, 4, 2};
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Vargu i sortuar: ");
        printArray(arr, n);
        long finishTime = System.nanoTime();
		long excecutionTime = finishTime - startTime;
		System.out.println("Koha e ekzekutimit ne nanosekona: " + excecutionTime + " ns");
    }
}
 
