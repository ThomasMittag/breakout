package de.hpi.javaide.breakout.elements;

import java.awt.Dimension;


import java.awt.Point;
import de.hpi.javaide.breakout.*;

import de.hpi.javaide.breakout.basics.*;
import de.hpi.javaide.breakout.starter.Game;
import de.hpi.javaide.breakout.starter.GameConstants;
import processing.core.PApplet;
import java.math.*;

/**
 * Blueprint for a Ball
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
//TODO neben dem Ergänzen der vom Interface erwarteten Methoden, 
//     sollte der Ball Eigenschaften wie Größe und Richtung mitbringen.
//     Richtung wird in der Regel als Vector definiert. 
//     Vermutlich sollte er die Richtung ändern können und sehr wahrscheinlich wird früher oder später 
//     jemand wissen wollen in welche Richtung er fliegt.
public class Ball extends Elliptic implements Measureable{

	public Vector ballMovement;
	private Color color;
	
	
	public Ball(Game game, Point position) {
		super(game, position, new Dimension(10, 10));
		this.position = GameConstants.STARTPOSITION;
		this.dimension = new Dimension (10,10);
		this.ballMovement = GameConstants.STARTSPEED;
		this.setColor(255,0,0);
		
	}

	@Override
	public void display() {
		game.ellipseMode(PApplet.RADIUS);
		game.noStroke();
		game.fill(getR(), getG(), getB());
		game.color(255, 255, 255, 50);
		game.ellipse(this.getX(), this.getY(), this.getWidth(), this.getHeight());
				
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public int getX(){
		//return Math.round(this.ballPosition.x);
		return this.position.x;
	}
	public int getY(){
		//return Math.round(this.ballPosition.y);
		return this.position.y;
	}
	public int getWidth() {
		return this.dimension.width;
	}
	public int getHeight() {
		return this.dimension.height;
	}
}
