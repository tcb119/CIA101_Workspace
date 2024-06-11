package module06_12;

import java.io.*;
import java.net.*;

public class GetNatalieFromInternet {

	public static void main(String[] args) {
		File dir = new File("/Users/kai-sunny/Downloads/JAVAFILETEST");
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		for (int i = 1; i <= 42; i++) {
			String url = "http://www.space-fox.com/wallpapers/celebs/natalie-portman" + 
					"/natalie_portman_" + i	+ ".jpg";
			String filename = url.substring(url.lastIndexOf("/") + 1);
			File file = new File(dir, filename);
			try {
				URL myURL = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();
				InputStream is = conn.getInputStream();
				FileOutputStream fos = new FileOutputStream(file);

				System.out.println("Wallpaper: " + filename + " kick-off!");

				int length = 0;
				byte[] b = new byte[4096]; // 4 KB （可以調整大小，非固定）
				while ((length = is.read(b)) != -1) {
					// b: 代表要輸出的byte陣列 (資料都放在裡面了)
					// 0: 代表從這個陣列的第一個元素開始輸出 (索引值)
					// length: 代表要輸出的資料量
					fos.write(b, 0, length);
					fos.flush();
				}
				
				fos.close();
				is.close();
				System.out.println(filename + " Done!");

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
