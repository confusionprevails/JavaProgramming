package code.sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by rajat on 19/06/14.
 */
public class Solution {

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int out = n1+n2;
        System.out.println(out);

    }
}
