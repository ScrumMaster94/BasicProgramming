package practiceProgram;

public class SeparateChar {

	public static void main(String[] args) {
		int[] a = { 2, 4, 0, 0, 1, 3, 0, 6, 0, 6, 0, 3 };

		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == 0 || a[i + 1] == 0) {
			}else if(a[i] == 0 && a[i + 1] == 0) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	}
}
