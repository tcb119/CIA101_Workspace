package ＨＷ2;

public class Hw2 {
    public static void main(String[] args) {
        //• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
        System.out.println("第五題: \n輸出結果為阿文可以選擇的數字有: " );
        int count = 0;
        for (int i = 1;  i <= 49; i++) {
            if (i % 10 != 4) {
                if (i / 10 != 4) {
                    count++;
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("總共有" + count + "個");

        System.out.println("===============================================");

    }
}
