import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {

	private ArrayList<Robot> bots;
	private Scanner s;

	
	public static void main(String[] args) {
		
		int choice = 0;
		RobotMenu menu = new RobotMenu();
		
		//main sentinel
		do {
			choice = menu.startMenu();
			menu.processInput(choice);
		} while (choice != 0);
		
	}
	
	
	//constructor
	public RobotMenu() {

		s = new Scanner(System.in);
		bots = new ArrayList<Robot>();
	}
	
	
	//
	public int startMenu() {
	
		System.out.println("\nRobot Menu");
		System.out.println("1 - instantiate a bot");
		System.out.println("2 - display list o' bots");
		System.out.println("3 - move a bot");
		System.out.println("4 - rotate a bot");
		System.out.println("5 - distance btw 2 bots");
		System.out.println("0  -  exit");
		int selection = (int) s.nextInt();
		
		//sentinel
		while (selection < 1 || selection > 5) {
			System.out.println("gotta pick a menu item:  ");
			selection = (int) s.nextInt();
		}
		
		return selection;
	}
	
	
	//
	public void processInput(int pick) {
		
		//create a bot
		if (pick == 1) {
			createBot();
		}

		//display a list of bots
		else if (pick == 2) {
			showBots();
		}

		//move a bot
		else if (pick == 3) {
			Robot r = getABot();
			r.move();
		}

		
		//rotate a bot
		else if (pick == 4) {
			Robot r = getABot();
			
			System.out.println("Turn:    1 - left    2 - right");
			int selection = (int) s.nextInt();
			
			//sentinel
			while (selection < 1 || selection > 2) {
				System.out.println("gotta pick a valid direction:  ");
				selection = (int) s.nextInt();
			}

			int degrees = 0;

			switch (selection) {
			case 1:
				degrees = 90;
				break;
			case 2:
				degrees = -90;
				break;
			}
			
			r.rotate(degrees);
		}

		//get distance btw bots
		else if (pick == 5) {
			System.out.print("1st bot?:  ");
			Robot r1 = getABot();			
			System.out.print("2nd bot?:  ");
			Robot r2 = getABot();
			System.out.println("\nThe distance between " + r1.getName() + " and " + r2.getName() + " is " + r1.distanceFromRobot(r2));
		}
			
	}
	
	
	//shows bots
	private void showBots() {

		System.out.println();
		for (int i = 0; i < bots.size(); ++i) {
			System.out.println(i + " - " + bots.get(i));
		}
	}
	
	
	//returns a robot of the user's choosing
	private Robot getABot() {
		
		showBots();
		System.out.println("get a bot");
		int selection = (int) s.nextInt();
		
		//sentinel
		while (selection < 0 || selection > (bots.size() - 1)) {
			System.out.println("c'mon, pick one:  ");
			selection = (int) s.nextInt();
		}
		
		return bots.get(selection);
	}
	
	
	private void createBot() {
		
		System.out.println();
		System.out.print("what's his/her name?:  ");
		String name = s.next();
		
		System.out.print("\nstarting x coord?:  ");
		int x = (int) s.nextInt();
		
		System.out.print("\nstarting y coord?:  ");
		int y = (int) s.nextInt();
		
		System.out.print("\nspeed?:  ");
		int speed = (int) s.nextInt();
		//sentinel - speed validation
		while (speed <= 0) {
			System.out.print("\ngotta be a positive int:  ");
			speed = (int) s.nextInt();
		}
		
		System.out.print("\ndirection (in degrees)?:  ");
		int orientation = (int) s.nextInt();
		//sentinel - orientation validation
		while (orientation < 0 || (orientation % 90 != 0)) {
			System.out.print("\ndirection in positive degrees only:  ");
			orientation = (int) s.nextInt();
		}
		Robot r = new Robot(name, new int[]{x, y}, speed, orientation);
		bots.add(r);
	}

}
