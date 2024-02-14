package selectionSort;

import java.util.Arrays;

public class SelectionSort {
	public void selectionSort(int array[]) {

		for (int i = 0; i < array.length; i++)
		{
			int minIndex = i;
			for (int j = i; j < array.length; j++) 
			{
				if (array[j] < array[minIndex]) 
				{
					minIndex = j;
				}
			}
			if (minIndex != i) 
			{
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

	public static void main(String args[]) {
		int array[] = { 4, 2, 6, 5, 1, 3 };
		SelectionSort obj = new SelectionSort();
		obj.selectionSort(array);
		System.out.print(Arrays.toString(array));

	}

}
