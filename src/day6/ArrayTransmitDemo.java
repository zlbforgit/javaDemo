package day6;

public class ArrayTransmitDemo {
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 } };

		change(array);
		for (int[] is : array) {
			System.out.println("");
			for (int i : is) {
				System.out.print(i + "  ");
			}
		}
	}

	private static void change(int[][] array) {
		int temp = 0;
		temp = array[0][0];
		array[0][0] = array[1][1];
		array[1][1] = temp;

	}
}
