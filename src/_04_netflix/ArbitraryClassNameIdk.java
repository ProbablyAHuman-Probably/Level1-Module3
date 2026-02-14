package _04_netflix;

import javax.swing.*;

public class ArbitraryClassNameIdk {

	public static void main(String[] args) {
		Movie movie_01 = new Movie("Cade: The Tortured Crossing", 999999999);
		Movie movie_02 = new Movie("Dire Duplicity", 999999997);
		Movie movie_03 = new Movie("Twisted Pair", 999999996);
		Movie movie_04 = new Movie("Pass Thru", 999999995);
		Movie movie_05 = new Movie("Fateful Findings", 999999998);
		Movie movie_06 = new Movie("I Am Here....Now", 999999994);
		Movie movie_07 = new Movie("Double Down", 999999993);
		Movie movie_08 = new Movie("When My Ex Becomes My Gynecologist", -999999999);
		Movie twilight = new Movie("Twilight", -999999999);

		JOptionPane.showMessageDialog(null, movie_08.getTicketPrice());
		JOptionPane.showMessageDialog(null, twilight.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();

		queue.addMovie(movie_01);
		queue.addMovie(movie_02);
		queue.addMovie(movie_03);
		queue.addMovie(movie_04);
		queue.addMovie(movie_05);
		queue.addMovie(movie_06);
		queue.addMovie(movie_07);
		queue.addMovie(movie_08);
		queue.addMovie(twilight);
		queue.printMovies();

		JOptionPane.showMessageDialog(null, "the best movie is " + queue.getBestMovie().getTitle());
		JOptionPane.showMessageDialog(null, "the second best movie is " + queue.movies.get(1).getTitle());

	}

}
