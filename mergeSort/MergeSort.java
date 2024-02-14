package mergeSort;

import java.util.Arrays;

public class MergeSort 
{
	public int[] mergeSort(int array1[],int array2[])
	{
		int combined[] = new int[array1.length+array2.length];
		int index =0;
		int i =0;
		int j =0;
		while(i<array1.length && j<array2.length)
		{
			if(array1[i]<array2[j])
			{
				combined[index] = array1[i];
				index++;
				i++;
			}
			else
			{
				combined[index] = array2[j];
				index++;
				j++;
			}
		}
		while(i<array1.length)
		{
			combined[index] = array1[i];
			index++;
			i++;
		}
		while(j<array2.length)
		{
			combined[index] = array2[j];
			index++;
			j++;		
		}
		return combined;
	}
	public int[] merge(int array[])
	{
		if(array.length==1)
		{
			return array;
		}
		int midIndex = array.length/2;
		int left[] = merge(Arrays.copyOfRange(array,0, midIndex));
		int right[] = merge(Arrays.copyOfRange(array,midIndex,array.length));
		return mergeSort(left,right);
	}
	public static void main(String args[])
	{
		MergeSort obj = new MergeSort();
		int array[] = {1,3,7,8,2,4,5,6};
		System.out.println(Arrays.toString(obj.merge(array)));
	}
}
