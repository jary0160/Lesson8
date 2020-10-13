package SamplePrograms;

public class array2DEx1 {

    public static void main(String[] args) {
        int x[][] = new int[4][5];
        // 2D array of 4 rows x 5 columns

        x[3][2] = 50;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                int num = 10 * row + col;
                x[row][col] = num;
                System.out.format(x[row][col] + "%5d |", x[row][col]);
            }
            System.out.println(""); //new line at end of row

            //make and initialize a 2d array
            System.out.println("\n-----------------\n");
            int marks[][] = {
                {67, 8, 67, 55,76,82,91},
                {88, 65, 77, 99,55},
                {34, 35, 45, 54},
                {88, 66, 44, 55,67,86}

            };
            //print them
            //marks.length
            for (int row = 0; row < marks.length; row++) {
                for (int col = 0; col < marks[row].length; col++) {
                    System.out.format(x[row][col] + "%5d |", x[row][col]);
                }
                System.out.println(""); //new line at end of row
            }

        }
    }
