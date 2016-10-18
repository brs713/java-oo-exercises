
public class AssemblerBot extends Robot {

	private int numberOfArms;
	private String[] tasks;
	
	public AssemblerBot(String name, int[] position, int speed, int orientation) {
		super(name, position, speed, orientation);
		this.speed = 0;

	}

	@Override
	public void setSpeed(int speed) {
		this.speed = 0;
	}
	
	public int getNumberOfArms() {
		return numberOfArms;
	}

	public String[] getTasks() {
		return tasks;
	}

	public void setTasks(String[] tasks) {
		this.tasks = tasks;
	}

	
	
}
