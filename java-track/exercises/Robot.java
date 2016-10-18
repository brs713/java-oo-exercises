
public class Robot{

	//Fields:
	
	protected String name;
	protected int[] position;
	protected int speed;
	protected int orientation;
	protected RobotBehavior behavior;
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
	
	public String getName() {
		return this.name;
	}
	
	public int getX() {
		return this.position[0];
	}
	
	public int getY() {
		return this.position[1];
	}
	
	public int getOrientation() {
		return this.orientation;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
	public void rotate(int rotationDegrees) {
		if (rotationDegrees % 90 != 0) {
			System.out.println("Invalid rotation angle; please use multiples of 90");
			return;
		}
		if (rotationDegrees % 90 != 0 || rotationDegrees % 180 == 0) {
			System.out.println("Just go right or left!");
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
	
	public void setBehavior(RobotBehavior behavior) 
	{
		this.behavior = behavior;
	}

	//toString()
	public String toString() {
		return "Name: " + this.name + "\tPosition: (" + this.position[0] + ", " + this.position[1]  + ")\tSpeed: " + this.speed + "\tOrientation: " + this.orientation;
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
		System.out.println();
		System.out.println((-1 + 4) % 4);
		
		for (int i = 0; i < 5; ++i) {
			System.out.println((i + 4) % 4);
		}

	}
	
	
	
}
