package by.myJavaCourse.field;

import by.myJavaCourse.boats.Boat;

public class Field {

	private Cell[][] field;
	
	public Field(int sizeX,int sizeY) {
		this.field = new Cell[sizeX][sizeY];
		for(int row = 0;row<sizeX;row++) {
			for(int column = 0;column<sizeY;column++) {
			this.field[row][column] = new Cell(row,column);
			this.field[row][column].setField(this);
		}
		}
	}
	
	public Cell getCell(int x, int y) {
		return this.field[x][y];
	}

	public Cell[][] getField() {
		return field;
	}

	public void setField(Cell[][] field) {
		this.field = field;
	}
	
	
	public boolean canPlaceBoat(Boat boat) {
		boolean check = true;
		if(boat==null) {
			return false;
		}
		Cell[] cells = boat.getBody();
		for(Cell cell:cells) {
			int x = cell.getX();
			int y = cell.getY();
			if(!this.field[x][y].isFree()) {
				check = false;
			}
			if(x<0 || x>this.field.length || y<0 || y> this.field.length) {
				check = false;
			}
			if((!this.field[x-1][y].isFree()) && x>0) {
				check = false;
			}
			if((!this.field[x][y-1].isFree()) && y>0) {
				check = false;
			}
			if((!this.field[x-1][y-1].isFree()) && x>0 && y>0) {
				check = false;
			}
			if((!this.field[x+1][y].isFree()) && x<this.field.length) {
				check = false;
			}
			if((!this.field[x][y+1].isFree()) && y<this.field[0].length) {
				check = false;
			}
			if(!this.field[x+1][y+1].isFree() && x<this.field.length &&  y<this.field[0].length) {
				check = false;
			}
			if(!this.field[x-1][y+1].isFree() && x>0 && y<this.field[0].length) {
				check = false;
			}
			if(!this.field[x+1][y-1].isFree() && x<this.field.length && y>0) {
				check = false;
			}
			
			
		}
		return check;
	}
	
}
