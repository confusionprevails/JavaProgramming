package javabelt.algo.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by rajat on 19/06/14.
 */
public class InputSample {
    /*
    Sample showing user input
     */
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }

        String line2 = br.readLine();
        String[] split=line2.split(" ",2);
        int N1 = Integer.parseInt(split[0]);
        int T1 = Integer.parseInt(split[1]);



    }

}
