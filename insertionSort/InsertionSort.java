package insertionSort;

import java.util.Arrays;

public class InsertionSort {
	public void inserionSort(int array[]) 
	{
		for(int i = 1; i<array.length; i++)
		{
			int temp = array[i];
			int pre = i-1;
			while(pre>-1&&temp<array[pre])
			{
				array[pre+1] = array[pre];
				array[pre] = temp;
				pre--;
			}
		}
	}
	public static void main(String args[])
	{
		int array[] = {3,7,8,6,1,9};
		InsertionSort obj = new InsertionSort();
		obj.inserionSort(array);
		System.out.print(Arrays.toString(array));


	}
	
}
