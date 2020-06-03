package com.entity.motionlesselements;

import java.io.IOException;

import entity.Sprite;

/**
 * The Dirt class.
 * @author group12 olivia serge yves-alexis
 * @version 1.0
 *
 */
public class Dirt extends MotionlessElements {

	/**
	 * The Dirt's default sprite
	 */
	private static final Sprite sprite = new Sprite('t',"74359.png");
	static {
		try {
			sprite.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * The Dirt's constructor
	 * @param x the x of the dirt
	 * @param y the y of the dirt
	 */
	public Dirt(int x, int y) {
		super(sprite, x, y);
	}
}
