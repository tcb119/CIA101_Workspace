package HW1;
// • 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class TestPI {
    public static void main(String[] args) {

        final double Pi = 3.1415;
        int radius = 5;
        double circleArea = Pi * radius * 2;
        double circumference = Pi * Math.pow(radius, 2);

        System.out.printf("半徑為5的圓面積: %.2f \n", circleArea);
        System.out.printf("半徑為5的圓周長: %.2f \n", circumference);


    }
}
