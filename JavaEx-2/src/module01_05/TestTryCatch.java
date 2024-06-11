package module01_05;

public class TestTryCatch {

	public static void main(String[] args) {
		int i = 0;
		String[] strs = { "Hello1", "Hello2", "Hello3" };
		while (i < 4) {
			try {
				System.out.println(strs[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("1-已超出陣列的長度");
			} catch (Exception e) {
				System.out.println("2-發生Exception");
			}
			i++;
			System.out.println("執行成功"); //有印出代表程式有完整跑完，並成功結束
		}

	}

}
