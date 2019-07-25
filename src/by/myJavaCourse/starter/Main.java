package by.myJavaCourse.starter;

import by.myJavaCourse.boats.PolyCellBoat;
import by.myJavaCourse.field.Cell;
import by.myJavaCourse.field.Field;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Field f = new Field(8,8);
		
Cell c = new Cell(1,1);		

PolyCellBoat p = new PolyCellBoat(c,4,true);

System.out.println(f.canPlaceBoat(p));

System.out.println(p.isAlive());
for(Cell cell: p.getBody()) {
	cell.strike();
	System.out.println(p.isDamaged() + "\nthe boat is damaged");
	}

System.out.println(p.isAlive());
}
	



	}
	
