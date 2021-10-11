package com.example.testCA;

import java.util.Queue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCaApplication extends Movements {
	public static Position snakeGame(int n, String s) {
		
		if(!isValidMovementsString(s)) {}
		
		//Creating the frame bounds
		int height = 100;
		int width = 100;
		Frame frame = new Frame(height,width);
		
		//creating the snake
		Snake snake = new Snake(n);		
		
		for(char direction: s.toCharArray()) {
			
			switch (direction) {
			case 'H':
				Queue<Position> newBodyPositionH = moveToH(snake, frame);
				snake.setBodyPositions(newBodyPositionH);
				
				
				break;
				
			case 'B':
				Queue<Position> newBodyPositionB = moveToB(snake, frame);
				snake.setBodyPositions(newBodyPositionB);

				break;
				
			case 'G':
				Queue<Position> newBodyPositionG = moveToG(snake, frame);
				snake.setBodyPositions(newBodyPositionG);

				break;
				
			case 'D':
				Queue<Position> newBodyPositionD = moveToD(snake, frame);
				snake.setBodyPositions(newBodyPositionD);
				break;

			default:
				break;
			}
		}
	
		Position lastPosition = new Position(snake.bodyPositions.peek().getX(),snake.bodyPositions.peek().getY());
		
		return lastPosition;
	}

	
	public static void main(String[] args) {
		int n = 5;
		String s ="DDBBBDHHGGHDDDBDBDDHGGBDBGGBBGGHGBBGHGHHHDHHDDDDBB";
		
		Position gamePosition = snakeGame(n, s);
		
		System.out.println("Last Position: (" +gamePosition.y + "," + gamePosition.x + ")");
		
	}

}
