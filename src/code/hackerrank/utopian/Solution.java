package code.hackerrank.utopian;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Math.pow;

/**
 * Created by rajat on 19/06/14.
 */
public class Solution  {

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        int[] cases = new int[TC];
        for(int i=0;i<TC;i++){
            cases[i]=Integer.parseInt(br.readLine());
        }

        for(int i=0;i<TC;i++){
            System.out.println(calculateUtopianHeight(cases[i]));
        }

    }

    private static int calculateUtopianHeight(int cycles) {

        if(cycles%2==0){
            // even number of cycles = complete cycles
            int n=cycles/2;
            return (int)(pow(2,n+1)-1);
        }
        else{
            int n=cycles/2;
            return (int) (2*(pow(2,n+1)-1));
        }
    }

}
