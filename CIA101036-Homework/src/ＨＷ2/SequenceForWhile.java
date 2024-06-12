package ＨＷ2;
//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
public class SequenceForWhile {
    public static void main(String[] args) {
        int sequence = 1;
        for (int i = 1; i <= 10; i++) {
            sequence *= i;
        }
        System.out.println(sequence);
    }
}
