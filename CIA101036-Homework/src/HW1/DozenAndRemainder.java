package HW1;
//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class DozenAndRemainder {
    public static void main(String[] args) {

        int eggs = 200;
        int Dozen = 200 / 12;
        int Remainder = 200 % 12;

        System.out.println("200顆蛋：是" + Dozen + "打，" + Remainder + "顆。");
    }
}
