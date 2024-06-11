package HW1;
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class TestTime {
    public static void main(String[] args) {
        int times = 256559;
        int days = times / (60 * 60 * 24);
        int hours = (times % (60 * 60 * 24)) / (60 * 60);
        int minutes = (times % (60 * 60)) / 60;
        int seconds = times % 60;

        System.out.println("256559秒為：" + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");
    }
}


