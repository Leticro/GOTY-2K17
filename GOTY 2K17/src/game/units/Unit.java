package game.units;

import java.awt.image.BufferedImage;

import game.sprites.BoundingSprite;

public class Unit extends BoundingSprite {
	
	private int damagePerHit;
	
	protected Unit(BufferedImage image) {
		super(image);
	}

	public int getDamagePerHit() {
		return damagePerHit;
	}
	
	public void setDamagePerHit(int damage) {
		damagePerHit = damage;
	}
}
