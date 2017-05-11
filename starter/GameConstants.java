package de.hpi.javaide.breakout.starter;

import java.awt.Point;

import de.hpi.javaide.breakout.basics.Vector;

public interface GameConstants {
	int LIVES = 3;
	int SCREEN_X = 800;
	int SCREEN_Y = 600;
	Point STARTPOSITION = new Point(SCREEN_X/2, SCREEN_Y/2);
	Vector STARTSPEED = new Vector(1,1);
	
}
