
public class HaulerBot extends Robot{
	
	private double horsepower;
	private int maxLoad;
	private boolean isLoaded;

	public HaulerBot(String name, int[] position, int speed, int orientation) {
		
		super(name, position, speed, orientation);
		
	}

	public double getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(double horsepower) {
		this.horsepower = horsepower;
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	public boolean isLoaded() {
		return isLoaded;
	}

	public void setLoaded(boolean isLoaded) {
		this.isLoaded = isLoaded;
	}
	
	

}
