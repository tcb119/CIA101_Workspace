package module12_15;

public class AddInt {

	public int varArgTest(int data,int...c) {
		int sum = 0;
		System.out.println(data);
		for (int i = 0; i < c.length; i++) {
			sum += c[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		AddInt add = new AddInt();
		int sum1 = add.varArgTest(1, 2);
		int sum2 = add.varArgTest(1, 2, 3, 4);

		System.out.println("sum1=" + sum1); // 3
		System.out.println("sum2=" + sum2); // 10
	}

}