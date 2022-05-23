public class App {
    public static void main(String[] args) {
        // While Loop
        int i = 1;
        while (i <= 5) {
            System.out.println(i + ". Hi its from while loop");
            i++;
        }
        System.out.println("value of i is : " + i);
        // Do While

        int j = 1;
        do {
            System.out.println(j + ". Hi its from do while loop");
            j++;
        } while (j <= 5);
        System.out.println("value of j is : " + j);
        // For loop
        int k;
        for (k = 0; k <= 5; k++) {
            System.out.println(k + ". Hi its from for loop");
        }
        System.out.println("value of k is : " + k);
        // Continue and break

        int l;
        for (l = 0; l <= 5; l++) {
            if (l == 4) continue;
            System.out.println(l + ". Hi its from for-loop-continue");
        }
        System.out.println("value of l is : " + l);

        int m;
        for (m = 0; m <= 5; m++) {
            if (m == 3) break;
            System.out.println(m + ". Hi its from for-loop-break");
        }
        System.out.println("value of l is : " + m);

        for (int n = 0; n < 10; n++) {
            for (int o = 0; o < 5; o++) {
                System.out.println(n + "." + o + ". Hi its from nested for loop");
            }
        }
    }
}
