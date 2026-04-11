package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Classlmaoiahcm {

	public static void main(String[] args) {

		World myworld = new World();
		myworld.show();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Flower myflower = new Flower();
				Location flower_location = new Location(i, j);
				if (i % 2 == 0) {
					myflower.setColor(Color.red);
				} else {
					myflower.setColor(Color.white);
				}
				myworld.add(flower_location, myflower);
			}
		}
	}
}
