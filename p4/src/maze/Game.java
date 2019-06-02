package maze;

import java.io.*;
import java.util.*;

public class Game {

	public static void main (String[] args){

		//init I/O

		Scanner lineTokenizer;

		String inputLine = "1";
		Console inputReader = System.console();

		if(inputReader == null){
			System.err.println("No Console");
			System.exit(1);
		}

		//input user pour les 2 cas

		inputLine = inputReader.readLine();

		//traitement input

		if (inputLine.equals("1")){

			Maze m = new Maze(3, 3, 0, 0, 2, 2);

			System.out.println("Yay !");

			m.setVide(0,1);
			m.setVide(0,2);
			m.setVide(1,2);

			m.setVide(1,0);
			m.setVide(2,0);
			m.setVide(2,1);

			System.out.println(m);

		} else {

			Maze m = new Maze(3, 3, 0, 0, 2, 2);

			m.setVide(0,1);
			m.setVide(0,2);
			m.setVide(1,2);

			m.setVide(1,0);
			m.setVide(2,0);
			m.setVide(2,1);

			//charge sauve.maze 
			/*

			try{
				FileInputStream sauvegarde = new FileInputStream("save.maze");
				sauvegarde.close();

			} catch (IOException i){
				System.out.println("NOOOOOOOOOOOO");

				i.printStackTrace();
				System.exit(1);				
			} catch (ClassNotFoundException c){
				c.printStackTrace();
				System.exit(1);		
			}

			//*/


			//sauvegarde le maze
			try {

				FileOutputStream sauvegarde = new FileOutputStream("save.maze");

				sauvegarde.close();

				System.out.println("Yes !!!");


			} catch (IOException e){
				e.printStackTrace();
				System.err.println(e.getMessage());
				System.exit(1);
			}

		}

	}
}