package by.myJavaCourse.boats;

import by.myJavaCourse.field.Cell;

public abstract class Boat {

	private Cell head;

	public Boat(Cell head) {
		this.head = head;
	}
	
	public abstract Cell[] getBody();
	
	public boolean isAlive() {
		boolean check = false;
		for(Cell cell:this.getBody()) {
			if(!cell.isStriked()) {
				check = true;
			}	
		}
		return check;
	}
	public boolean isDamaged() {
		boolean check = false;
		for(Cell cell:this.getBody()) {
			if(cell.isStriked()) {
				check = true;
			}	
		}
		return check;
	}
	
	public Cell getHead() {
		return this.head;
	}
	
	
	
}
