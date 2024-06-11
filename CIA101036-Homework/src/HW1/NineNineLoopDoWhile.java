package HW1;

//• 建立一個可以輸出九九乘法表的程式，使用while迴圈+do while迴圈
public class NineNineLoopDoWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            int j = 1;
            do {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
                j++;
            } while (j <= 9);
            System.out.println();
            i++;
        }
    }
}
