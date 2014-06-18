package javabelt.algo;

/**
 * Created by rajat on 17/06/14.
 *
 * Binary Search relies on sorted property of the array
 * Running time: O(log n)
 */
public class BinarySearch {

    /**
     * Search for the key in inputArray using BinarySearch
     * @param inputArray
     * @param key
     * @return -1 if not found, else return the index where the key is
     */

    public int binarySearch(int[] inputArray, int key){
        int start=0;
        int end=inputArray.length;
        int mid=-1;
        boolean found=false;
        while(!found && end!=start){
            mid=(start+end)/2;
            if(inputArray[mid]==key){
                System.out.println("Found");
                found=true;
            }else if(inputArray[mid]<key){
                System.out.println("2nd Half of Array");
                start=mid+1;
            }else{
                System.out.println("1st half of Array");
                end=mid;
            }
        }
        if(!found){
            System.out.println("Not Found");
            return -1;
        }else
            return mid;

    }

    public int binarySearchRecursion(int[] inputArray, int key){
        if(inputArray.length>0)
            return binarySearchRecursion(inputArray,key,0,inputArray.length);
        else
            return -1;
    }

    private int binarySearchRecursion(int[] inputArray, int key, int start, int end){

        // Base Case
        if(start-end<=1){
            if(inputArray[start]==key)
                return start;
            else
                return -1;
        }
        else if(start>end){
            return -1;
        }
        else{
            int mid = (start+end)/2;
            if(inputArray[mid]==key){
                System.out.println("Found");
                return mid;
            }else if(inputArray[mid]<key)
                return binarySearchRecursion(inputArray,key,mid+1,end);
            else
                return binarySearchRecursion(inputArray,key,start,mid);
        }
    }



}
