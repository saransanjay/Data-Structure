package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
	public  void bubbleSort(int array[])
	{
		for(int i = array.length-1; i>0; i--)
		{
			for(int j =0; j<i;j++)
			{
				if(array[j]>array[j+1]) 
				{
					int temp = array[j];
					array[j] =array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		int array[] = {3,7,8,6,0,9};
		BubbleSort obj = new BubbleSort();
		obj.bubbleSort(array);
		System.out.print(Arrays.toString(array));


	}
}
