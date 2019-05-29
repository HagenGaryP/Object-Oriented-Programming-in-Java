public class UsingArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {3, 4, 5, 6},
                {4, 5, 6, 7},
                {5, 6, 7, 8}

        };
        mystery2d(numbers);
        // brute force way to show what each index holds
        System.out.println("numbers[0][0] = " + numbers[0][0] + "\nnumbers[0][1] = " +
                numbers[0][1] + "\nnumbers[0][2] = " + numbers[0][2] + "\nnumbers[0][3] = " +
                numbers[0][3] + "\nnumbers[1][0] = " + numbers[1][0] + "\nnumbers[1][1] = " +
                numbers[1][1] + "\nnumbers[1][2] = " + numbers[1][2] + "\nnumbers[1][3] = " +
                numbers[1][3] + "\nnumbers[2][0] = " + numbers[2][0] + "\nnumbers[2][1] = " +
                numbers[2][1] + "\nnumbers[2][2] = " + numbers[2][2] + "\nnumbers[2][3] = " +
                numbers[2][3]);

        // Which of the following is the best piece of code to put in the blank below to traverse
        // the entire 2D array?
        // a.length
        // a[row]
        // a[row].length correct
        // a[row][col].length
        int[][] a = new int[2][5];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = col;
                System.out.println(a[row][col]);
            }
        }
        System.out.println();

        // Which of the following arrays accurately shows the results of the following code?
        // [0, 1]
        // [2, 3]
        //
        //   or
        //
        // [0, 2]
        // [1, 3]
        int[][] b = new int[2][2];
        int count = 0;
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                b[row][col] = count;
                count++;
                System.out.println(b[row][col]);
            }
        }

        int[][] grid = {
                {3, 5, 2343},
                {2, 4},
                {1, 2, 3, 4}
        };

        System.out.println("\ngrid[1][1] = " + grid[1][1]);



    }
        public static void mystery2d(int[][] a) {
            for (int r = 0; r < a.length; r++) {
                for (int c = 0; c < a[0].length - 1; c++) {
                    if (a[r][c + 1] > a[r][c]) {
                        a[r][c] = a[r][c + 1];
                    }
                }
            }
        }

}
