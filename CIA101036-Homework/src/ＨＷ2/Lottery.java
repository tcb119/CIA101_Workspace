package ＨＷ2;
//• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//  輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
public class Lottery {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("可選擇: ");
        for (int j = 1; j <= 49; j++) {
            if (j % 10 == 4 || j / 10 == 4)
                continue;
            System.out.print(j + " ");
            count++;
        }
        System.out.println("\n總共:" + count);
    }
}
