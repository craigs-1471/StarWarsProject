package grid;
import swShips.Spaceship;

public class GameGrid {
	
	private final int GRID_WIDTH = 4, GRID_HEIGHT = 4;
	private Spaceship[][] grid;
	
	public GameGrid() {
		grid = new Spaceship[GRID_WIDTH][GRID_HEIGHT];
	}
	
}
