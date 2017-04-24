package game.maps;

import java.awt.image.BufferedImage;
import java.util.List;

import game.TileLocation;
import game.sprites.SpriteObject;

public abstract class GameMap extends SpriteObject {
	
	public GameMap(BufferedImage image) {
		super(image);
	}
	
	public abstract List<TileLocation> getInvalidTileLocations();
	
}