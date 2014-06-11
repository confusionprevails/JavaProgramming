package javabelt.algo.util;

public class DisplayUtils {
	
	public static void showIntArray(int[] array){
		System.out.println(' ');
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
			System.out.print(',');
		}
	}

}
