
public class BuildingBehavior implements RobotBehavior{

	private Robot r;
	
	@Override
	public void doNextMove(Robot r) {
		//does something.
		//unfortunately, this has to be something that all Robots do, so doNextMove() seems like a crappy design constraint.
		r.move();
	}


}
