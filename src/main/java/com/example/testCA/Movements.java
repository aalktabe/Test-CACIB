package com.example.testCA;

import java.util.Queue;

public class Movements extends MovementsValidator{
	
	public static Queue<Position> moveToH(Snake snake, Frame frame) {
		int newX = snake.head.getX()-1;
		int newY = snake.head.getY();
		
		Position newPosition = new Position();
		newPosition.setX(newX);
		newPosition.setY(newY);
		
		if(isInFrame(newPosition, frame) && !isOccupiedCase(newPosition, snake)) {
			snake.setHead(newPosition);
			snake.bodyPositions.add(newPosition);
			snake.bodyPositions.poll();
			return snake.bodyPositions;
		}
		
		return snake.bodyPositions;
	}
	
	public static Queue<Position> moveToB(Snake snake, Frame frame) {
		int newX = snake.head.getX()+1;
		int newY = snake.head.getY();
		
		Position newPosition = new Position();
		newPosition.setX(newX);
		newPosition.setY(newY);

		if(isInFrame(newPosition, frame) && !isOccupiedCase(newPosition, snake)) {
			snake.setHead(newPosition);
			snake.bodyPositions.add(newPosition);
			snake.bodyPositions.poll();
			return snake.bodyPositions;
		}
		
		return snake.bodyPositions;
	}
	
	public static Queue<Position> moveToG(Snake snake, Frame frame) {
		int newX = snake.head.getX();
		int newY = snake.head.getY()-1;
		
		Position newPosition = new Position();
		newPosition.setX(newX);
		newPosition.setY(newY);
		
		if(isInFrame(newPosition, frame) && !isOccupiedCase(newPosition, snake)) {
			snake.setHead(newPosition);
			snake.bodyPositions.add(newPosition);
			snake.bodyPositions.poll();
			return snake.bodyPositions;
		}
		
		return snake.bodyPositions;
	}
	
	public static Queue<Position> moveToD(Snake snake, Frame frame) {
		int newX = snake.head.getX();
		int newY = snake.head.getY()+1; 
		
		
		Position newPosition = new Position();
		newPosition.setX(newX);
		newPosition.setY(newY);
		
		if(isInFrame(newPosition, frame) && !isOccupiedCase(newPosition, snake)) {
			snake.setHead(newPosition);
			snake.bodyPositions.add(newPosition);
			snake.bodyPositions.poll();

			return snake.bodyPositions;
		}
		
		return snake.bodyPositions;
	}

}
