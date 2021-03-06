import java.util.*;
import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class RockCritter extends Critter {

	public RockCritter() {
		this.setColor(Color.RED);
	}

	@Override
	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors) {
			if (!(a instanceof Rock) && !(a instanceof Critter)) {
				Location loc = a.getLocation();
				this.getGrid().put(loc, new Rock(a.getColor()));
			}
		}
	}
}
