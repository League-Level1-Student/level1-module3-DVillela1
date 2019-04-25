package netflix;

public class classs {
	static NetflixQueue nq = new NetflixQueue();
	static Movie og1 = new Movie("A", 1);
	static Movie nb = new Movie("rr", 2);
	static Movie jn = new Movie("qw", 3);
	static Movie dl = new Movie("in", 4);
	static Movie ev = new Movie("zh", 5);

	public static void main(String[] args) {
		og1.compareTo(jn);
		nb.getRating();
		ev.getTicketPrice();
		jn.getTitle();
		nq.addMovie(og1);
		nq.getBestMovie();
		nq.getMovie(2);
		nq.sortMoviesByRating();
	}

}
