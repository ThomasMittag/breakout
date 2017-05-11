package de.hpi.javaide.breakout.elements;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.Measureable;
import de.hpi.javaide.breakout.starter.Game;
import de.hpi.javaide.breakout.starter.GameConstants;



//TODO hier werden wir sicher eine Collection brauchen um die Bälle unterzubringen.
//     Vermutlich werden wir wissen wollen wann das Depot leer ist.
//     Irgendwie müssen die Bälle an den Start gebracht werden.

public class BallDepot implements Displayable, Measureable {
	
	private ArrayList<Ball> ballList= new ArrayList<>(); 
	private Game game;
	private Point upperLeftCoords;
	private Dimension displayDimensions;
	
	public BallDepot(Game game) {
		this.game = game;
		this.upperLeftCoords=new Point(50,50);
		this.displayDimensions= new Dimension(100,50);
		fillBallDepot();
		
	}
		
	public void fillBallDepot(){
		for (int i=0;i< GameConstants.LIVES;i++) {
			Ball b = new Ball(game,GameConstants.STARTPOSITION);
			this.ballList.add(b);
		}
	}
	

	@Override
	public int getX() {
		return upperLeftCoords.x;
	}

	@Override
	public int getY() {
		return upperLeftCoords.y;
	}

	@Override
	public int getWidth() {
		return this.displayDimensions.width;
	}

	@Override
	public int getHeight() {
		return this.displayDimensions.height;
	}

	@Override
	public void display() {
		game.fill(0);
		game.stroke(255,255,255);
		game.rect(this.getX(),this.getY(),this.getWidth(),this.getHeight());		
	}

	public boolean isEmpty() {
		return ballList.isEmpty();
	}

	public Ball dispense() {
			return ballList.remove(ballList.size()-1);
	}

	public ArrayList<Ball> getBallList() {
		return ballList;
	}
	public int getRemainingBalls() {
		return ballList.size();
	}

	public void setBallsRemaining(ArrayList<Ball> ballsRemaining) {
		this.ballList = ballsRemaining;
	}

}
