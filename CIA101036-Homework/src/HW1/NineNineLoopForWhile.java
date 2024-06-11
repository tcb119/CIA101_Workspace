package HW1;

//• 建立一個可以輸出九九乘法表的程式，使用for迴圈+while迴圈
public class NineNineLoopForWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
