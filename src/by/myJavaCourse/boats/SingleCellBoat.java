package by.myJavaCourse.boats;

import by.myJavaCourse.field.Cell;

public class SingleCellBoat extends Boat {

	public SingleCellBoat(Cell head) {
		super(head);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cell[] getBody() {
		// TODO Auto-generated method stub
		Cell[] body = {this.getHead()};
		return body;
	}

}
