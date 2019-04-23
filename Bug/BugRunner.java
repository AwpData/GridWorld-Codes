import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;

public class BugRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		//CircleBug bug = new CircleBug();
		ZigZagBug bug = new ZigZagBug();
		world.add(bug);
		//bug.moveTo(new Location(7,0));
		bug.moveTo(new Location(9,9));
		world.show();
	}
}
