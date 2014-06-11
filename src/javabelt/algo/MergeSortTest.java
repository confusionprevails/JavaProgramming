package javabelt.algo;

import static org.junit.Assert.*;
import javabelt.algo.util.DisplayUtils;

import org.junit.Ignore;
import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testMerge() {
		int[] arr1= {1,3,6,9};
		int[] arr2 = {2,8,10,13};
		int[] reArray = MergeSort.merge(arr1,arr2);
		DisplayUtils.showIntArray(reArray);
		int arr[] ={1,2,3,6,8,9,10,13}; 
		assertArrayEquals("Sorted Arrays are Merged", arr, reArray);
	}
	
	@Test
	public void testSort(){
		int[] input =    {2,1,9,3,90,34,21,89,32};
		int[] expected = {1,2,3,9,21,32,34,89,90};
		int[] actual=MergeSort.sort(input);
		DisplayUtils.showIntArray(actual);
		 
		assertArrayEquals("Sorted Arrays are Merged", expected, actual);
		
	}
	
	@Test
	public void testSortOdd(){
		int[] input =    {2,1,9,3,34,21,89,32};
		int[] expected = {1,2,3,9,21,32,34,89};
		int[] actual=MergeSort.sort(input);
		DisplayUtils.showIntArray(actual);
		 
		assertArrayEquals("Sorted Arrays are Merged", expected, actual);
		
	}

}
