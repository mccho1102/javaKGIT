
public class ArrayTest2 {

	public static void main(String[] args) {
		int[][] seat = new int[2][5];
		
		System.out.println(seat.length);
		System.out.println(seat[0].length);
		

		System.out.println("-------------------");
		
		//i = ��(2��) 
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
			System.out.print(seat[i][j]);
		 	}
			System.out.println();
		}
//		System.out.print(seat[i] + "  ");
//		System.out.println(seat[0][0]);
//		System.out.println(seat[1][4]);
		
	}
}
