
public class HaulingBehavior implements RobotBehavior{

	private Robot r;
	
	@Override
	public void doNextMove(Robot r) {
		//relocate
		r.move();
	}

}
