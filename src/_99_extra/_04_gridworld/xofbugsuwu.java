package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class xofbugsuwu {

	public static void main(String[] args) {

		Location bug_location = new Location(2, 7);
		Bug mybug = new Bug();
		mybug.setColor(Color.blue);
		mybug.turn();
		mybug.turn();
		myworld.add(bug_location, mybug);

	}
}
