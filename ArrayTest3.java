package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		double[] eyes2 = {2, 1.5, 0.8, 0.5, 1.2};
		String[] names 
		= {"辫酒公俺 己利 ", "冠酒公俺 己利 ", "价酒公俺 己利 ", "沥酒公俺 己利 ", "捞酒公俺 己利 "};
		
		char[] a = {'A', 'B', 'C', 'A', 'F'};
		
		for (int i = 0; i < eyes2.length; i++) {
			System.out.println(names[i] + ":" + a[i]);
		}
	}
}
