package code.hackerrank.servicelane;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by rajat on 20/06/14.
 */
public class Solution {

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] split=line1.split(" ",2);
        int N = Integer.parseInt(split[0]);
        int T = Integer.parseInt(split[1]);

        String line2 = br.readLine();
        int[] width = new int[N];
        int i=0;
        for(String s: line2.split(" ")){
            width[i]=Integer.parseInt(s);i++;
        }
        int[] startLane = new int[T];
        int[] exitLane = new int[T];
        for(int j=0;j<T;j++){
            String line3 = br.readLine();
            String[] split3=line3.split(" ",2);
            startLane[j] = Integer.parseInt(split3[0]);
            exitLane[j] = Integer.parseInt(split3[1]);
        }

        for(int j=0;j<T;j++){
            int start = startLane[j], exit=exitLane[j];
             // min within each case
            int ans = width[start];
            int k=start;
            while(k<=exit){
                if(ans>width[k])
                    ans=width[k];
                k++;
            }
            System.out.println(ans);
        }

    }
}
