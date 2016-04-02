package gui;

import static helpers.Artist.*;


public class TileGrid {
	public Tile[][] map;
	
	public TileGrid() {
		map = new Tile[32][21];
		for (int i = 0; i < map.length; i++){
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = new Tile(i*32, j*32, 32, 32, TileType.Grass);
				
			}
		}
	}
	
	public TileGrid(int[][] newMap){
		map = new Tile[32][21];
		for (int i = 0; i < map.length; i++){
			for (int j = 0; j < map[i].length; j++){
				if ( newMap[j][i] == 0)
					map[i][j] = new Tile(i*32, j*32, 32, 32, TileType.Grass);
				else {
					if ( newMap[j][i] == 1)
						map[i][j] = new Tile(i*32, j*32, 32, 32, TileType.Dirt);
					else
					map[i][j] = new Tile(i*32, j*32, 32, 32, TileType.Water);
				}
			}
		}
	}
		
		
	public void Draw(){
		for(int i = 0; i < map.length; i++){
			for (int j = 0; j < map[i].length; j++){
				Tile t = map[i][j];
				DrawHexagoneTex(t.getTexture(), t.getX(), t.getY(), t.getWidth(), t.getHeight());
			}
		}
	}
	
}
