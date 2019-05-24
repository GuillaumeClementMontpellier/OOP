package maze;

import graph.*;
import impl.*;

public class Game {
	public static void main (String[] args){

		Maze m = new Maze(3, 3, 0, 0, 2, 2);

		m.addPath(0,0,"South");
		m.addPath(0,1,"South");
		m.addPath(0,2,"East");
		m.addPath(1,2,"East");

		m.addPath(0,0,"East");
		m.addPath(1,0,"East");
		m.addPath(2,0,"South");
		m.addPath(2,1,"South");

		System.out.println("Yay !");

		System.out.println(m);

	}
}