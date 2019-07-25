package by.myJavaCourse.field;

import by.myJavaCourse.boats.Boat;

public class Cell {

	private int x;
	private int y;
	private boolean isStriked;
	private Field field;
	private Boat boat;
	
	

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public Boat getBoat() {
		return boat;
	}

	public void setBoat(Boat boat) {
		this.boat = boat;
	}

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	public boolean isStriked() {
		boolean check = false;
		
		if (isStriked ==true) {
			
			check = true;
		}
		return check;
	}

	public void strike() {
		this.isStriked = true;
			System.out.println("the cell was striked ");
		
	}
	
	public boolean isFree() {
		return this.boat==null;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isStriked ? 1231 : 1237);
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (isStriked != other.isStriked)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cell [x=" + x + ", y=" + y + ", isStriked=" + isStriked + "]";
	}

}
