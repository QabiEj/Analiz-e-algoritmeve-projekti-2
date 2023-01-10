public class InsertionSortAlg {
	/*Funksiono per sortim tw vargut duke perdorur insertion sort*/
	public void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/* Levizni elementet e arr[0..i-1], qw janw me tw mwdha se çelwsi,
			 *  te pozicioni perpara pozicionit tw tyre aktual */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* Njw funksion i dobishwm per shfaqjen e vargut tw madhesisw n*/
	public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Main
	public static void main(String args[])
	{
		long startTime = System.nanoTime();
		int arr[] = { 5, 1, 4, 2, 8, 5, 1, 4, 2, 8, 5, 1, 4, 2, 8, 5, 1, 4, 2, 8, 5, 1, 4, 2, 8 };
		InsertionSortAlg ob = new InsertionSortAlg();
		ob.sort(arr);

		printArray(arr);
		long finishTime = System.nanoTime();
		long excecutionTime = finishTime - startTime;
		System.out.println("Koha e ekzekutimit ne nanosekona: " + excecutionTime + " ns");
	}
};

