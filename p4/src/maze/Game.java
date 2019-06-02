package maze;

import java.io.*;
import java.util.*;

public class Game {

	public static void main (String[] args){

		//init I/O

		Scanner sc = null;

		String inputLine = "1";
		Console inputReader = System.console();
		String content;

		File file;

		if(inputReader == null){
			System.err.println("No Console");
			System.exit(1);
		}

		//input user pour les 2 cas

		System.out.println("Appuyer 1 puis Enter pour Default, Enter pour reste");

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

			FileOutputStream sauvegarde = null;

			byte[] contentInBytes;


			//charge sauve.maze 		
			try{
				sc = new Scanner(new File("save.maze"));
			} catch(FileNotFoundException e){
				e.printStackTrace();
			}

			//Crée le maze			

			Maze m = new Maze(sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextInt(),sc.nextInt());

			String courant = sc.next();
			int x = 0;
			int y = 0;

			while(sc.hasNext()){

				for (int i = 0, n = courant.length(); i < n; i++) {
					char c = courant.charAt(i);

					if(c == '.'){

						m.setVide(x,y);

					}

					y++;

				}

				courant = sc.next();
				x++;
				y = 0;
			}

			sc.close();

			// change le maze

			System.out.println(m);
			System.out.println("Entrez v pour mettre une case a vide, m pour mettre une case en mur (sauf depart ou arrivee) : ");

			inputLine = inputReader.readLine();

			System.out.println("entrez les coords de la case a changer : ");

			String coord = inputReader.readLine();

			sc = new Scanner(coord);

			x = -1;
			y = -1;
			x = sc.nextInt();
			y = sc.nextInt();

			if (x < 0 || y < 0 || x >= m.getWidth() || y >= m.getHeigth()){

				System.out.println("Input Coord non valide");

			} else if (inputLine.equals("v")){

				m.setVide(x, y);

			} else if (inputLine.equals("m")){

				m.setMur(x, y);

			} else {

				System.out.println("Input Action non valide");

			}

			//sauvegarde le maze

			System.out.println("Voici le nouveau maze : ");
			System.out.println(m);

			try {

				file = new File("save.maze");

				sauvegarde = new FileOutputStream(file);

			// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

			// get the content in bytes
				contentInBytes = String.format("%d %d ",m.getHeigth(),m.getWidth()).getBytes();
				sauvegarde.write(contentInBytes);

				contentInBytes = String.format("%d %d ",m.getStartCell().getX(),m.getStartCell().getY()).getBytes();
				sauvegarde.write(contentInBytes);

				contentInBytes = String.format("%d %d\n",m.getFinishCell().getX(),m.getFinishCell().getY()).getBytes();
				sauvegarde.write(contentInBytes);

				contentInBytes = m.toString().getBytes();
				sauvegarde.write(contentInBytes);

				contentInBytes = "Over\n".getBytes();
				sauvegarde.write(contentInBytes);

				sauvegarde.flush();
				sauvegarde.close();

			} catch (IOException e){
				e.printStackTrace();
			} finally {
				try {
					if (sauvegarde != null) {
						sauvegarde.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
