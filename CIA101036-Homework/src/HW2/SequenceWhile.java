package HW2;
//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
public class SequenceWhile {
    public static void main(String[] args) {
        int i = 1;
        int sequence = 1;
        while (i <= 10) {
            sequence *= i;
            i++;
        }
        System.out.println(sequence);
    }
}
