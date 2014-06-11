package javabelt.algo;

import java.util.Arrays;

import javabelt.algo.util.DisplayUtils;

public class MergeSort {
	
	public static void main(String args[]){
		/** Test Merge
		 *  
		 */
		int[] arr1= {1,3,6,9};
		int[] arr2 = {2,8,10,13};
		int[] reArray = merge(arr1,arr2);
		DisplayUtils.showIntArray(reArray);
	}
	public static int[] sort(int arr[]){
		if(arr.length==1){
			return arr;
		}
		else if(arr.length==2){
			if(arr[1]<arr[0]){
				int temp = arr[1];
				arr[1]=arr[0];
				arr[0]=temp;
				return arr;
			}
			return arr;
		}
		else{
			int mid = arr.length/2;
			int[] a1 = Arrays.copyOfRange(arr, 0, mid);
			//DisplayUtils.showIntArray(a1);
			int[] a2 = Arrays.copyOfRange(arr, mid, arr.length);
			//DisplayUtils.showIntArray(a2);
			int r1[]=sort(a1);
			//DisplayUtils.showIntArray(r1);
			int r2[]=sort(a2);
			//DisplayUtils.showIntArray(r2);
			return merge(r1,r2);
			
		}
		//return null;
	}
	
	/**
	 * Merge 2 sorted Arrays
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static int[] merge(int arr1[], int arr2[]){
		int len = arr1.length+arr2.length;
		int[] mergedArray = new int[len];
		int idx1=0,idx2=0;
		for(int i=0;i<len;i++){
			if(idx1>=arr1.length && idx2<arr2.length){
				//copy over the arr2 to merged array
				mergedArray[i]=arr2[idx2];idx2++;
			}
			else if(idx1<arr1.length && idx2>=arr2.length){
				//copy over the arr1 to merged array
				mergedArray[i]=arr1[idx1];idx1++;
			}
			else if(arr1[idx1]<arr2[idx2]){
				mergedArray[i]=arr1[idx1];idx1++;
			}else{
				mergedArray[i]=arr2[idx2];idx2++;
			}	
		}
		
		
		return mergedArray;
	}

}
