package Project2;

public class Grid {
	private boolean [][] bombGrid;
	private int [][]countGrid;
	private int numRows;
	private int numColumns;
	private int numBombs;
	
 		
	public Grid() {
		numRows = 10;
		numColumns = 10;
		numBombs = 25;
		createBombGrid();
		createCountGrid();
	}
	public Grid(int rows,int columns) {
		this.numRows = rows;
		this.numColumns = columns;
		numBombs = 25;
	}	
	public Grid (int rows,int columns,int numBombs) {
		this.numRows = rows;
		this.numColumns = columns;
		this.numBombs = numBombs;
	}
	public int getNumRows() {
		return this.numRows;
	}
	public int getNumColumns() {
		return this.numColumns;
	}
	public int getNumBombs() {
		return this.numBombs;
	}
	public boolean[][] getBombGrid() {
		
		for (int i = 0; i < numRows; i++) {
			System.out.println();
		   for (int j = 0; j < numColumns; j++) {
		         
		    	
		   System.out.print(bombGrid[i][j]+ "|") ;
		    }
		}
		return this.bombGrid;
	}
	public int [][] getCountGrid(){
		for (int i = 0; i < numRows; i++) {
			System.out.println();
		    for (int j = 0; j < numColumns; j++) {
		         
		    	
		    System.out.print(countGrid[i][j]+ "|") ;
		  }
		
	}
		return countGrid;
	}
	
	public boolean isBombAtLocation(int row,int column) {
		if (bombGrid[row][column] == true) {
		return true;
		}
		return false;
	}
	
	

	public int getCountAtLocation(int row,int column) {
		
		if (countGrid[row][column] >=0 &&  countGrid[row][column] <= 9) {
			  return countGrid[row][column];
			
		}
		return 0;
		
	}
		
		public  void createBombGrid() {
			bombGrid = new boolean [numRows][numColumns];
			
		
			for (int i = 0;i < numBombs; i++) {
			
					int row = (int)(Math.random()*numRows);
					int col = (int) (Math.random()*numColumns);
					if (!bombGrid[row][col]) {
						bombGrid[row][col] = true;
						numBombs--;
					}
					
				}
			}
	

public void createCountGrid() {
   createBombGrid();
	//bombGrid = new boolean [numRows][numColumns];
	countGrid = new int [numRows][numColumns];
	for (int i= 0;i<numRows;i++) {
		System.out.println();
		for (int j=0;j<numColumns;j++) {

			countGrid[i][j]= 0;
			if (bombGrid[i][j]) {
				int a = (int)(Math.random()*9)+1;
				countGrid[i][j]= a;
		}
			}
	
		
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grid grid1 = new Grid();
		grid1.createBombGrid();
	
        System.out.println(grid1.getBombGrid());
		Grid grid2 =new Grid();
		grid2.createCountGrid();
		System.out.println(grid2.getCountGrid());
		System.out.println(grid1.isBombAtLocation(0,9));
		System.out.println(grid2.getCountAtLocation(7, 0));
	}


}
