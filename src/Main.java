
public class Main {

	public static void main(String[] args) {
		int a[] = { 4, 6, 3, 8, 15, 5 };
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int n = a.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
	}
}
