package extra;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {

	private World world;
	private Location loc;
	private Flower flower;
	private Actor actor;

	public void World() {
		this.world = world;
	}

	public void Show() {
		world.show();
	}

	public void add(Location loc, Bug bug, Flower flower) {
		world.add(loc, bug);
		world.show();
		bug.setColor(Color.BLUE);
		bug.turn();
		bug.canMove();
		loc.equals(bug);
		flower.moveTo(loc);
	}

	public void Turn() {

	}

	public void Flower() {
		this.flower = flower;
	}

	public void setColor(Color newColor) {
		this.color = color;
	}
}
