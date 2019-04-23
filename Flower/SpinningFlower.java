import info.gridworld.actor.Flower;

public class SpinningFlower extends Flower {
	private int x = 0;

	@Override
	public void act() {
		x += 180;
		setDirection(x);
	}
}
