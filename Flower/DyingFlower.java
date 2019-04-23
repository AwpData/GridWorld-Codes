//import info.gridworld.actor.Flower;
public class DyingFlower extends SpinningFlower {
	private final int LIFETIME = 50;
	private int age;

	public DyingFlower() {
		super();
		this.age = 0;
	}

	@Override
	public void act() {
		super.act();
		age++;
		if (age == LIFETIME) {
			removeSelfFromGrid();
		}
	}
}
