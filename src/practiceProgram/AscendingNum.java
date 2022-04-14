package practiceProgram;

public class AscendingNum {

	public static void main(String[] args) {
		int[] num = { 3, 5, 1, 8, 6, 12, 4, 0, -4 };

		for (int i = 0; i <= num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		for (int a = 0; a < num.length; a++) {
			System.out.print(num[a] + " ");
		}
	}
}
