import java.util.LinkedList;

public class DVDlibrary {

	private LinkedList<Movie> listMovies;

	public DVDlibrary(LinkedList<Movie> listOfMovie) {
		this.listMovies = listOfMovie;
	}

	public int researchYear(int year) {
		int nbFilms = 0;
		for(int num=0; num<listMovies.size(); num++) // size - Give size of listOfMovie
		{
			Movie currentMovie = listMovies.get(num); // Take film in location "num" in list
			if(currentMovie.getYear() == year) // If year of current film = year we want, number of film of this year ++
				nbFilms++;
        }
		return nbFilms; // We return number of films of this year
	}

	public int nbMovieDirector(People directorP) {
		int nbFilms = 0;
		for(int num=0; num<listMovies.size(); num++) // size - Give size of listOfMovie
		{
			Movie currentMovie = listMovies.get(num); // Take film in location "num" in list
			People director = currentMovie.getDirector();
			if(directorP.equals(director))
				nbFilms++;
			//System.out.println("Hello World !");
			//if(director.getFirstName() == directorP.getFirstName() && director.getLastName() == directorP.getLastName())
			//	nbFilms++;
        }
		return nbFilms;
	}
}