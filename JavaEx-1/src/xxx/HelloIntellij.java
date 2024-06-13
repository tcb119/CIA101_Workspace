package xxx;

public class HelloIntellij {
    public static void main(String[] args) {
        int[] student = {1, 2};

        int[] student2 = new int[2];
        student2[0] = 99;
        student2[1] = 100;

        for (int i = 0; i < student2.length; i++) {
            System.out.println(student2[i]);
        }

        System.out.println(student[1]);

    }
}
