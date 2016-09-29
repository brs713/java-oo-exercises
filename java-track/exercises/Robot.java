
public class Robot {

	//Fields:
	
	private String name;
	private int[] position;
	private int speed;
	private int orientation;
	//name - String
	//position (x, y) - int[]
	//speed - int
	//orientation (N, S, E, W) - int
	
	//Behaviors:
	
	public Robot(String name, int[] position, int speed, int orientation) {
		this.name = name;
		this.position = position;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	//it can move - (depending on orientation, speed, & position)
	public void move() {
		
		switch (this.orientation) {
		case 0:
			this.position[0] += this.speed;
			break;
			
		case 90:
			this.position[1] += this.speed;
			break;
			
		case 180:
			this.position[0] -= this.speed;
			break;
			
		case 270:
			this.position[1] -= this.speed;
			break;
		}
	}

	//it can rotate - (depending on orientation)
// TODO:  This isn't to specs...needs to be 90 degrees left or right...refactor this!
	public void rotate(int rotationDegrees) {
		if (rotationDegrees % 90 != 0) {
			System.out.println("Invalid rotation angle; please use multiples of 90");
			return;
		}
		this.orientation = (this.orientation + rotationDegrees) % 360;
	}

	//it can determine distance from another robot
	public double distanceFromRobot(Robot nuthaRobot) {
		double xSquared = Math.pow((this.position[0] - nuthaRobot.position[0]), 2);
		double ySquared = Math.pow((this.position[1] - nuthaRobot.position[1]), 2);
		double distance = Math.pow((xSquared + ySquared), .5);
		return distance;
	}

	//toString()
	public String toString() {
		return "Name: " + this.name + "  Position: (" + this.position[0] + ", " + this.position[1]  + ")  Speed: " + this.speed + "  Orientation: " + this.orientation;
	}

	//Implement main function to test functionality
	public static void main(String[] args) {
		int[] position = {1, 2};
		int[] position2 = {-4, 20};
		Robot sarge = new Robot("Sarge", position, 20, 90);
		Robot siri = new Robot("Siri", position2, 10, 270);
		
		System.out.println(sarge);
		sarge.rotate(12);
		sarge.rotate(270);
		System.out.println(sarge);
		System.out.println(sarge.distanceFromRobot(siri));
		sarge.move();
		System.out.println(sarge);
		sarge.rotate(450);
		sarge.move();
		System.out.println(sarge);
		System.out.print("invalid rotation input line:   ");
		sarge.rotate(9);
		sarge.move();
		System.out.println("\n" + sarge);
		System.out.println(sarge.distanceFromRobot(siri));
		sarge.rotate(180);
		sarge.move();
//		System.out.println("\n-After 180 & move(),   " + sarge);
		sarge.move();
		
		sarge.rotate(270);
		sarge.move();
		sarge.rotate(-90);
		
		System.out.println("\nShould be back to origin now:");
		System.out.println(sarge);
		System.out.println(sarge.distanceFromRobot(siri));
	}
}
