package de.hpi.javaide.breakout.elements;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.starter.Game;
import processing.core.PApplet;

/**
 * Blueprint for the Wall
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
//TODO die Wall wird aus Bricks gebaut.
public class Wall implements Displayable, Iterable<Brick> {
	
	/**
	 * Datastructure to keep the Bricks
	 */
	private ArrayList<Brick> wall;
	private int columns;
	private int rows;
	private Game game;


	public Wall(Game game, int i, int j) {
		this.game=game;
		wall=new ArrayList<>();
		this.columns=i;
		this.rows=j;
		buildWall(game,columns,rows);
		
		
	}
	@Override
	public Iterator<Brick> iterator() {
		return wall.iterator();
		}
	/**
	 * Build the wall by putting the single bricks into their position
	 * Hint: You might want to use one or two for-loops
	 * 
	 * @param game
	 * @param columns
	 * @param rows
	 */
	private void buildWall(Game game, int columns, int rows) {
		for(int i=0; i<columns;i++) {
			for (int j=0; j<rows;j++) {
				wall.add(new Brick(game,new Point(100+j*100,100+i*60),new Dimension(80,50)));
				
			
			}
		}
			
		} 
		

	
	@Override
	public void display() {
		for (Iterator<Brick> i=wall.iterator();i.hasNext();) {
			game.rectMode(PApplet.CORNER);
			game.noStroke();
			game.fill(i.next().getR(),i.next().getG(),i.next().getB());
			game.rect(i.next().getX(),i.next().getY(),i.next().getWidth(),i.next().getHeight());
		}		
	}
}
