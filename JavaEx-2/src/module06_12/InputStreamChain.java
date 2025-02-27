package module06_12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamChain {
	public static void main(String args[]) {
		int i;
		try {

			
			//低階資料流
//			FileInputStream fis = new FileInputStream("c:\\javawork\\hello.txt");
//			while ((i = fis.read()) != -1)
//				System.out.print((char) i);
//			fis.close();

			
			//低階接高階資料流
			FileInputStream fis = new FileInputStream("/Users/kai-sunny/Downloads/JAVAFILETEST/hello.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			while ((i = bis.read()) != -1)
				System.out.print((char) i);

			bis.close();
			fis.close();

		} catch (IOException e) {
		}
	}
}
