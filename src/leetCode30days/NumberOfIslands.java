package leetCode30days;

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grids = {
            {'1','1','0','0'},
            {'1','1','0','1'},
          
        };
        
        System.out.println(numIslands(grids));

    }

    public static int numIslands(char[][] grid) {

		int height = grid.length;
		if (height < 1)
			return 0;
		int width = grid[0].length;

		boolean[][] check = new boolean[height][width];
		int count = 0;
		for (int i = 0; i < height; i++)
			for (int j = 0; j < width; j++) {
				if (grid[i][j] == '1' && !check[i][j]) {
					count++;
					numIslandsHelper(grid, check, i, j);
                }
            }

        return count;

    }

    private static void numIslandsHelper(char[][] grid, boolean[][] check, int i, int j) {

		if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1)
			return;
		if (grid[i][j] == '1' && !check[i][j])
			check[i][j] = true;
		else
			return;
		numIslandsHelper(grid, check, i, j + 1);
		numIslandsHelper(grid, check, i, j - 1);
		numIslandsHelper(grid, check, i + 1, j);
		numIslandsHelper(grid, check, i - 1, j);

    }    
    
}