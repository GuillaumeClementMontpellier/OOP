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

				if(x == startX && y == startY){	

					this.cells[x][y] = new Cell("w", x, y, TypeCell.Debut);
					this.startCell = this.cells[x][y];

				} else if(x == finishX && y == finishY){	

					this.cells[x][y] = new Cell("w", x, y, TypeCell.Arrivee);
					this.finishCell = this.cells[x][y];

				} else {	

					this.cells[x][y] = new Cell("w", x, y, TypeCell.Mur);

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

	public void setVide(int x, int y){

		if (this.cells[x][y].getTypeCell() == TypeCell.Mur){

			this.cells[x][y].setTypeCell(TypeCell.Vide);

			//rajoute les chemins
			if (x > 0){
				if(this.cells[x-1][y].getTypeCell() != TypeCell.Mur){

					this.graph.addEdge(new UndirectedEdge(this.cells[x][y], this.cells[x-1][y]));

				}
			} 
			if (y > 0){
				if(this.cells[x][y-1].getTypeCell() != TypeCell.Mur){
					
					this.graph.addEdge(new UndirectedEdge(this.cells[x][y], this.cells[x][y-1]));

				}

			}
			if (x < width-1){

				if(this.cells[x+1][y].getTypeCell() != TypeCell.Mur){
					
					this.graph.addEdge(new UndirectedEdge(this.cells[x][y], this.cells[x+1][y]));

				}

			}
			if (y < heigth - 1){
				if(this.cells[x][y+1].getTypeCell() != TypeCell.Mur){
					
					this.graph.addEdge(new UndirectedEdge(this.cells[x][y], this.cells[x][y+1]));

				}

			} 

		}
	}

	public void setMur(int x, int y){

		if (this.cells[x][y].getTypeCell() == TypeCell.Vide){

			this.cells[x][y].setTypeCell(TypeCell.Mur);

			//Pour chaque Edge, si elle touche notre Cell, on l'enleve
			for (int i = 0; i < this.graph.getNbEdge(); i++){
				if (this.graph.getEdgeById(i).getVertices()[0] == this.cells[x][y] ||	this.graph.getEdgeById(i).getVertices()[1] == this.cells[x][y]   ){

					this.graph.deleteEdge(this.graph.getEdgeById(i));				

					i--;

				}

			}

		}

	}



	public String toString(){

		String mess = "";

		for (int x = 0; x < width; x++){
			

			for (int y = 0; y < heigth; y++){

				if( this.cells[x][y].getTypeCell() == TypeCell.Debut){
					mess = mess.concat("D");

				} else if(this.cells[x][y].getTypeCell() == TypeCell.Arrivee){
					mess = mess.concat("A");

				} else if(this.cells[x][y].getTypeCell() == TypeCell.Vide){
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










