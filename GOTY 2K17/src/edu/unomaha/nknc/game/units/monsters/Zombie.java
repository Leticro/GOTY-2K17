package edu.unomaha.nknc.game.units.monsters;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

import edu.unomaha.nknc.game.TileFramework;
import edu.unomaha.nknc.game.sprites.RockSprite;
import edu.unomaha.nknc.game.vectors.AxisAlignedBoundingBox;
import edu.unomaha.nknc.game.vectors.Vector2f;

public class Zombie extends Monster {

	private static BufferedImage BASE_IMAGE;
	
	static {
		try {
//			URL url = Zombie.class.getResource("/sprites/units/monsters/Zombie.gif");
//			BufferedImage spriteSheet = ImageIO.read(url).getSubimage(0, 0, 48, 48);
//			BASE_IMAGE = spriteSheet;
			URL url = RockSprite.class.getResource("/sprites/Tiles.png");
			BufferedImage spriteSheet = ImageIO.read(url);
			BASE_IMAGE = spriteSheet.getSubimage(0, 48, 48, 48);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public Zombie() {
		super(BASE_IMAGE);
		setOuterBound(new AxisAlignedBoundingBox(
				new Vector2f(-TileFramework.TILE_SIZE_X / 2F, TileFramework.TILE_SIZE_Y / 2F),
				new Vector2f(TileFramework.TILE_SIZE_X / 2F, -TileFramework.TILE_SIZE_Y / 2F)));
		setScale(0.95);
	}

}
