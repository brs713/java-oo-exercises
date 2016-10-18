 
public class ConstructorBot extends Robot{
	
	private String tool;
	private String[] tasks;

	public ConstructorBot(String name, int[] position, int speed, int orientation) {
		super(name, position, speed, orientation);
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public String[] getTasks() {
		return tasks;
	}

	public void setTasks(String[] tasks) {
		this.tasks = tasks;
	}

	
}
