package xxx;

public class TestRandomArray {
    public static void main(String[] args) {

        // 1 ~ 10
//        int a1 = (int) (Math.random() * 10) + 1;    // 0 ~ 9
//        System.out.println(a1);

        // 0 ~ 30
//        int a2 = (int) (Math.random() * 31);    // 0 ~ 29
//        System.out.println(a2);


        int[][] x = new int[3][3];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                int r1 = (int) (Math.random() * 31);
                x[i][j] = r1;
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] y = new int[3][3];

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                int r1 = (int) (Math.random() * 31);
                y[i][j] = r1;
                System.out.print(y[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] z = new int[3][3];

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                z[i][j] = x[i][j] + y[i][j];
                System.out.print(z[i][j] + "\t");
            }
            System.out.println();
        }

    }
}