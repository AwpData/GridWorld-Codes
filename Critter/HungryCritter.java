import java.awt.Color;
import java.util.*;
import info.gridworld.actor.Actor;

public class HungryCritter extends ChameleonCritter {

	public HungryCritter(Color color) {
		this.setColor(color);
	}

	@Override
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		if (n == 0) {
			return;
		}
		int r = (int) (Math.random() * n);

		Actor other = actors.get(r);
		if (other.getColor().equals(this.getColor())) {
			other.removeSelfFromGrid();
		}

	}
}
