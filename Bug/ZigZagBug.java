import info.gridworld.actor.Bug;

public class ZigZagBug extends Bug {
	private int steps;

	public ZigZagBug() {
		steps = 0;
	}

	public void act() {
		if (steps < 1 && canMove()) {
			setDirection(-90);
			move();
			steps++;
		} else {
			setDirection(0);
			move();
			steps = 0;
		}
	}
}
