package edu.unomaha.nknc.game.cards.monsters;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

import edu.unomaha.nknc.game.TileWorld;
import edu.unomaha.nknc.game.units.monsters.MonsterType;
import edu.unomaha.nknc.game.units.monsters.Zombie;

public class ZombieCard extends MonsterSpawnCard {

	private static BufferedImage BASE_IMAGE;

	static {
		try {
			URL url = Zombie.class.getResource("/sprites/cards/monsters/card_monster_zombie.png");
			BufferedImage spriteSheet = ImageIO.read(url);
			BASE_IMAGE = spriteSheet;
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public ZombieCard(TileWorld world) {
		super(BASE_IMAGE, world);
	}

	@Override
	public MonsterType getType() {
		return MonsterType.ZOMBIE;
	}

}
