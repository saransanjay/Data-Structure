package quickSort;

import java.util.Arrays;

public class QuickSort
{
	public int[] swap(int array[],int firstIndex,int secondIndex )
	{
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
		return array;
	}

	public int pivot(int array[],int pivotIndex,int endIndex)
	{
		int swapIndex = pivotIndex;
		for(int i = pivotIndex+1;i<=endIndex;i++)
		{
			if(array[pivotIndex]>array[i])
			{
				swapIndex++;
				swap(array,swapIndex,i);
			}
		}
		swap(array,pivotIndex,swapIndex);
		return swapIndex;
	}
	public void quickSort(int array[],int left ,int right)
	{
		if(left<right)
		{
			int pivotIndex = pivot(array,left,right);
			quickSort(array,left,pivotIndex-1);
			quickSort(array,pivotIndex+1,right);
		}		
	}
	public static void main(String args[]) {
		QuickSort obj = new QuickSort();
		int array[] = {4,6,1,7,3,2,5};
		obj.quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
		

}
