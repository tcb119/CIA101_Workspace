package HW1;

//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
public class Interest {
    public static void main(String[] args) {
        int principal = 1_500_000; // 初始本金
        double rate = 0.02; // 年利率
        int years = 10; // 年數

        double amount = principal * Math.pow(1 + rate, years); // 計算10年後的金額

        System.out.printf("10年後本金加利息共有: %.2f 元\n", amount);
    }
}

