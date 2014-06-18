package javabelt.algo;


import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest{

    @Test
    @Ignore
    public void testBinarySearch() {
        int arr[] ={1,2,3,6,8,9,10,13,20};
        int key=3;
        BinarySearch bsrch = new BinarySearch();
        int found=bsrch.binarySearch(arr,key);
        assertEquals(found,2);

    }
    @Test
    @Ignore
    public void testBinarySearchMidElement() {
        int arr[] ={1,2,3,6,8,9,10,13,20};
        int key=8;
        BinarySearch bsrch = new BinarySearch();
        int found=bsrch.binarySearch(arr,key);
        assertEquals(found,4);

    }

    @Test
    @Ignore
    public void testBinarySearchNotFound() {
        int arr[] ={1,2,3,6,8,9,10,13};
        int key=99;
        BinarySearch bsrch = new BinarySearch();
        int found=bsrch.binarySearch(arr,key);
        assertEquals(found,-1);

    }
    @Test
    @Ignore
    public void testBinarySearchEmptyArray() {
        int arr[] ={};
        int key=99;
        BinarySearch bsrch = new BinarySearch();
        int found=bsrch.binarySearch(arr,key);
        assertEquals(found,-1);

    }


    // Recursion
    @Test
    @Ignore
    public void testBinarySearchRecursion() {
        int arr[] ={1,2,3,6,8,9,10,13,20};
        int key=3;
        BinarySearch bsrch = new BinarySearch();
        int found=bsrch.binarySearchRecursion(arr, key);
        assertEquals(found,2);

    }
    @Test
    @Ignore
    public void testBinarySearchRecursionMidElement() {
        int arr[] ={1,2,3,6,8,9,10,13,20};
        int key=8;
        BinarySearch bsrch = new BinarySearch();
        int found=bsrch.binarySearchRecursion(arr, key);
        assertEquals(found,4);

    }

    @Test

    public void testBinarySearchRecursionNotFound() {
        int arr[] ={1,2,3,6,8,9,10,13};
        int key=99;
        BinarySearch bsrch = new BinarySearch();
        int found=bsrch.binarySearchRecursion(arr, key);
        assertEquals(found,-1);

    }
    @Test

    public void testBinarySearchRecursionEmptyArray() {
        int arr[] ={};
        int key=99;
        BinarySearch bsrch = new BinarySearch();
        int found=bsrch.binarySearchRecursion(arr, key);
        assertEquals(found,-1);

    }
    @Test

    public void testBinarySearchRecursionLowerNotFound() {
        int arr[] ={1,2,3,6,8,9,10,13};
        int key=0;
        BinarySearch bsrch = new BinarySearch();
        int found=bsrch.binarySearchRecursion(arr, key);
        assertEquals(found,-1);

    }


}