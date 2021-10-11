package com.example.testCA;

public class MovementsValidator {
	
	public static boolean isValidMovementsString(String s) {
		for(int i = 0; i < s.length()-1; i++) {
			if((s.charAt(i) == 'D' && s.charAt(i+1) == 'G') || (s.charAt(i) == 'G' && s.charAt(i+1) == 'D')){
				throw new IllegalStateException("Invalid movement backwards");
			} else if((s.charAt(i) == 'H' && s.charAt(i+1) == 'B') || (s.charAt(i) == 'B' && s.charAt(i+1) == 'H')){
				throw new IllegalStateException("Invalid movement backwards");
			}
		}
		return true;
	}
	
	public static boolean isInFrame(Position head, Frame frame) {
		
		if ((head.getX() >= 0 && head.getX() < frame.getWidth()) && (head.getY() >=0 && head.getY() < frame.getHeight())) {
			return true;
		}
		throw new IllegalStateException("Game over! Hit the frame!");
	}
	
	public static boolean isOccupiedCase(Position head, Snake snake) {
		
		if(snake.bodyPositions.contains(head)) {
			throw new IllegalStateException("Game over! you ate yourself!");
		}
		return false;
	}
	
	

}
