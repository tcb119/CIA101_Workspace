package HW1;

//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class TestExpression {
    public static void main(String[] args) {
        int i = 5;
        char j = '5';
        String k = "5";
        System.out.println(i + i); // i資料為int，代表兩個正整數相加
        System.out.println(i + j); // j資料為Char，「字元 '5' 被轉換為其 ASCII 值 53」，相加為58
        System.out.println(i + k); // k資料為String，i+k代表：整數加字串的顯示

    }
}
