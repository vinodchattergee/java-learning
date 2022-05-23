public class App {
    public static void main(String[] args) {
        int[] lotterNumbers = new int[5];
        lotterNumbers[0] = 17;
        lotterNumbers[1] = 18;
        lotterNumbers[2] = 19;
        lotterNumbers[3] = 1;
        lotterNumbers[4] = 14;
        for (int lotteryNumber : lotterNumbers) {
            System.out.println(lotteryNumber);
        }

        int[][] weeklyLotteryNumbers = new int[][]{
                {1, 28, 33, 41, 55},
                {21, 26, 73, 45, 56},
                {31, 21, 38, 47, 58},
                {14, 22, 39, 47, 59},
                {15, 12, 3, 74, 59},
                {16, 1, 35, 7, 9}
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
        }
    }
}