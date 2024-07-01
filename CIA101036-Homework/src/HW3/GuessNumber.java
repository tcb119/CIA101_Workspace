package HW3;

import java.util.Random;
import java.util.Scanner;

//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//對則顯示正確訊息,如圖示結果:
//(進階: 產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int ans = rd.nextInt(101);
        int guess = sc.nextInt();




        //        int i  = (int)Math.random();



        sc.close();
    }
}
