package by.myJavaCourse.boats;

import by.myJavaCourse.field.Cell;

public class PolyCellBoat extends Boat {

	private Cell[] body;
	
	public PolyCellBoat(Cell head, int amountOfCells, boolean isVertical) {
		super(head);
		// TODO Auto-generated constructor stub
		this.body = new Cell[amountOfCells];
		this.body[0] = head;
		for(int i = 1;i<amountOfCells;i++) {
			this.body[i] = isVertical?(new Cell(head.getX(),head.getY()+i)):(new Cell(head.getX()+i,head.getY()));
		}
	}

	@Override
	public Cell[] getBody() {
		// TODO Auto-generated method stub
		return this.body;
	}

	
}
