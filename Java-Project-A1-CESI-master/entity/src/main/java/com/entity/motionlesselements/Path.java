package com.entity.motionlesselements;

import java.io.IOException;

import entity.Sprite;

/**
 * The Path class.
 * @author group12 olivia serge yves-alexis
 * @version 1.0
 *
 */
public class Path extends MotionlessElements {

	/**
	 * The Path's default sprite
	 */
	private static final Sprite sprite = new Sprite('u',"Black.png");
	static {
		try {
			sprite.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * The Path's constructor.
	 * @param x the x of the path
	 * @param y the y of the path
	 */
	public Path(int x, int y) {
		super(sprite, x, y);
	}
}
