package xxx;

public class Student {
    int score = 90;

    public void play(int hours) {
        score -= hours;
    }

    public void study(int hours) {
        score += hours;
    }

    public static void main(String[] args) {
        Student studentA = new Student();
        Student studentB = new Student();
        studentA.play(1);
        System.out.println("學生A分數： "+studentA.score);
        studentB.study(1);
        System.out.println("學生B分數： "+studentB.score);
    }
}
