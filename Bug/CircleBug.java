import info.gridworld.actor.Bug;

public class CircleBug extends Bug {
	private int steps;

	public CircleBug() {
		steps = 0;
	}

	@Override
	public void act() {
		if (steps < 2 && canMove()) {
			move();
			steps++;
		} else {
			turn();
			steps = 0;
		}
	}

	@Override
	public void turn() {
		setDirection(getDirection() + 45);
	}
}
