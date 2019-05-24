package maze;

import graph.*;
import impl.*;

public class Maze {

	private Cell startCell;
	private Cell finishCell;

	private Cell[][] cells;

	private int heigth;
	private int width;

	private UndirectedGraph graph;

	public Maze(int heigth, int width, int startX, int startY, int finishX, int finishY){

		this.heigth = heigth;
		this.width = width;

		this.cells = new Cell[width][heigth];

		this.graph = new UndirectedGraph( ( (heigth-1) * width ) + ( heigth * (width-1) ), heigth * width);

		for(int x = 0; x < width; x++){

			for(int y = 0; y < heigth; y++){				

				this.cells[x][y] = new Cell("w", x, y);

				if(x == startX && y == startY){
					this.startCell = this.cells[x][y] ;
				}
				if(x == finishX && y == finishY){
					this.finishCell = this.cells[x][y] ;
				} 

				this.graph.addVertex(this.cells[x][y]) ;
				
			}			

		}

	}

	public Cell getStartCell(){
		return this.startCell;
	}

	public Cell getFinishCell(){
		return this.finishCell;
	}

	public int getHeigth(){
		return this.heigth;
	}

	public int getWidth(){
		return this.width;
	}

	public void addPath(int x, int y, String dir){
 
		if( (x < 0 || y < 0) || (x >= width || y >= heigth)){
			return;
		}

		switch(dir){
			case "North":
			    if (y != 0){
			    	this.graph.addEdge(new UndirectedEdge(this.cells[x][y], this.cells[x][y-1]));
			    }
			break;
			case "South":
			    if (y != heigth - 1){
			    	this.graph.addEdge(new UndirectedEdge(this.cells[x][y], this.cells[x][y+1]));
			    }
			break;
			case "East":
			    if (x != width-1){
			    	this.graph.addEdge(new UndirectedEdge(this.cells[x][y], this.cells[x+1][y]));
			    }
			break;
			case "West":
			    if (x != 0){
			    	this.graph.addEdge(new UndirectedEdge(this.cells[x][y], this.cells[x-1][y]));
			    }
			break;
			default:
			break;
		}

	}

	public String toString(){
		String mess = "";

		boolean[][] valide = new boolean[this.width][this.heigth];

		for (int x = 0; x < width; x++){

			for (int y = 0; y < heigth; y++){

				valide[x][y] = false;
				
			}
		}

		int max = this.graph.getNbVertex();

		for (int i = 0; i < max; i++){
			if( this.graph.getNeighbours(i).length > 0){
				valide
				[ ((Cell) this.graph.getVertexById(i) ).getX() ]
				[ ((Cell) this.graph.getVertexById(i) ).getY() ] = true;
			}
		}

		for (int x = 0; x < width; x++){

			for (int y = 0; y < heigth; y++){

				if(this.cells[x][y] == this.startCell){
					mess = mess.concat("D");

				} else if(this.cells[x][y] == this.finishCell){
					mess = mess.concat("A");

				} else if(valide[x][y]){
					mess = mess.concat(".");

				} else {
					mess = mess.concat("O");

				}
				
			}

			mess = mess.concat("\n");
		}

		return mess;



	}

}










