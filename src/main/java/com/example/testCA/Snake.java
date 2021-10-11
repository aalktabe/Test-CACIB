package com.example.testCA;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Snake {
	Position head;
	int size;
	Queue<Position> bodyPositions = new LinkedList<Position>();
	
	public Snake(int size) {
		super();
		this.size = size;
		this.head = new Position();
		this.head.setX(0);
		this.head.setY(size-1);
	
		this.bodyPositions = new LinkedList<Position>(); 
		
		
		for(int i = 0; i<size; i++) {
			Position bodyPosition = new Position();
			bodyPosition.setX(0);
			bodyPosition.setY(i);
			this.bodyPositions.add(bodyPosition);
		}
	}
	
	public Snake(Position head, int size, Queue<Position> bodyPositions) {
		
		this.head = head;
		this.size = size;
		this.bodyPositions = bodyPositions;
		
		
	}
	
	public Position getHead() {
		return head;
	}
	public void setHead(Position head) {
		this.head = head;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Queue<Position> getBodyPositions() {
		return bodyPositions;
	}
	public void setBodyPositions(Queue<Position> bodyPositions) {
		this.bodyPositions = bodyPositions;
	}
	
	
}
