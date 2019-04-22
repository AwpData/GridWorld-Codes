import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CritterRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		HungryCritter critter = new HungryCritter();
		//RockCritter critter = new RockCritter();
		world.add(new Location(7, 8), new Rock());
		world.add(new Location(3, 3), new Rock());
		world.add(new Location(2, 8), new Flower(Color.BLUE));
		world.add(new Location(5, 5), new Flower(Color.PINK));
		world.add(new Location(1, 5), new Flower(Color.RED));
		world.add(new Location(7, 2), new Flower(Color.YELLOW));
		world.add(new Location(4, 4), critter);
		world.show();
	}
}

//REMOVE LATER 
//Exercise 5
/*
 * getActors() returns the number of actors for processing. It returns the
 * actors that occupy neighboring grid locations processActors() causes the
 * actors to eat any actors that arn't rocks or critters. getMoveLocations()
 * lists all the possible locations for the next move. It returns empty
 * neighboring locations selectMoveLocation() selects the location for the next
 * move. It randomly picks one of the possible locations or the current location
 * if there are none. makeMove() moves the critter to this given location or
 * removes it if location is null. If there is an actor at the location, it
 * removes that actor before placing.
 */
