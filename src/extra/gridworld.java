package extra;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {

	private World world;
	private Location loc;
	private Flower flower;

	public World() {
		this.world = world;
	}

	public void Show() {
		world.show();
	}

	public void add(Location loc, Actor occupant) {
		world.add(loc, occupant);

	}

	public void Turn() {

	}

	public Flower() {
		this.flower = flower;
		
	}

	public void setColor(Color newColor) {
		this.newColor = olor;
	}
}
