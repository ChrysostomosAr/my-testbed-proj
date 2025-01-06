package gr.aueb.cf.ch6;

public class TwoDimArrayApp {
    public static void main(String[] args) {

        int[][] grid = new int[2][3];
//Κατά γραμμές και στήλες
        grid[0][0] = 5;
        grid[0][1] = 7;
        grid[0][2] = 10;
        grid[1][0] = 2;
        grid[1][1] = 6;
        grid[1][2] = 8;

        //Traverse
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.println(grid[i][j]);
            }
            System.out.println();
        }
    }
}

