import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CritterRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		// HungryCritter critter = new HungryCritter(Color.BLACK);
		RockCritter critter = new RockCritter();
		world.add(new Location(1, 2), new Rock(Color.BLUE));
		world.add(new Location(3, 4), new Rock(Color.YELLOW));
		world.add(new Location(5, 3), new Rock(Color.BLACK));
		world.add(new Location(2, 8), new Flower(Color.BLUE));
		world.add(new Location(5, 5), new Flower(Color.PINK));
		world.add(new Location(1, 5), new Flower(Color.RED));
		world.add(new Location(7, 2), new Flower(Color.YELLOW));
		world.add(new Location(4, 4), critter);
		world.show();
	}
}
