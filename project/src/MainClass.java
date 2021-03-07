import java.util.LinkedList;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {	
		PART1();		
		PART2();		
		PART3();		
		PART4();		
	}
	
	static void PART1() {
		System.out.println("##### PART 1 #####");
		System.out.println();
		
		/* Create director */
		People d1 = new People("Jean-Luc","Mélenchon");
		
		/* Create Movie */
		Movie myMovie = new Movie("Oui", d1, 2020);
		
		/* Create actors */
		People p1 = new People("firstName1","lastName1");
		People p2 = new People("firstName2","lastName2");
		
		/* Print actors we created */
		System.out.println("Actor created :");
		System.out.println("Actor 1 : " + p1.toString());
		System.out.println("Actor 2 : " + p2.toString());
		System.out.println();
		
		/* Add actors to movie */
		myMovie.addActor(p1);
		myMovie.addActor(p2);
		
		/* Print the movie */
		System.out.println("Movie created :");
		System.out.println(myMovie);
		
		System.out.println();
	  }
	
	static void PART2() {
		System.out.println("##### PART 2 #####");
		System.out.println();
		
		/* Display 20 movies using populateBase */
		ReadFileMovie bob2 = new ReadFileMovie();
		System.out.println("Filling dataBase (no random) : ");
		bob2.populateBase();
		System.out.println();
		System.out.println("Sample of database no random (20 movies) :");
		bob2.displaySample(20);
		System.out.println();
		
		/* Display 20 movies using populateBaseRandom */
		ReadFileMovie bob = new ReadFileMovie();
		System.out.println("Filling dataBase (random) : ");
		bob.populateBaseRandom();
		System.out.println();
		System.out.println("Sample of database random (20 movies) :");
		bob.displaySample(20);
		
		System.out.println();
	}
	
	static void PART3() {
		System.out.println("##### PART 3 #####");
		System.out.println();
		
		/* Display 20 movies using populateBase */
		ReadFileMovie reader = new ReadFileMovie();
		LinkedList<Movie> lMovies;
		
		System.out.println("Filling dataBase (no random) : ");
		lMovies = reader.populateBase();
		System.out.println();
		
		DVDlibrary library = new DVDlibrary(lMovies);
		
		System.out.println("Number of movies released in 1997 in databse : " + library.researchYear(1997));
		System.out.println("Number of movies released in 1914 in databse : " + library.researchYear(1914));
		System.out.println("Number of movies released in 2005 in databse : " + library.researchYear(2005));
		System.out.println("Number of movies released in 2007 in databse : " + library.researchYear(2007));
		/* 
		 * Equivalent of :
		 * int nbOfFilmsYear = library.researchYear(2007);
		 * System.out.println(nbOfFilmsYear);
		 */
		
		System.out.println();
		
		System.out.println("Number of movies from Tarantino in databse : " + library.nbMovieDirector(new People("Quentin", "Tarantino")));
		/* 
		 * Equivalent of :
		 * People tarantino = new People("Quentin", "Tarantino");
		 * int nbOfFilmsDirector = library.nbMovieDirector(tarantino);
		 * System.out.println(nbOfFilmsDirector);
		 */
		
		People chaplin = new People("Charlie", "Chaplin");
		System.out.println("Number of movies from Chaplin in databse : " + library.nbMovieDirector(chaplin));
		
		People kubrick = new People("Stanley", "Kubrick");
		System.out.println("Number of movies from Kubrick in databse : " + library.nbMovieDirector(kubrick));
		
		System.out.println();
	}
	
	static void PART4() {
		System.out.println("##### PART 4 #####");
		System.out.println();
		
		ReadFileMovie readFiles = new ReadFileMovie();
		System.out.println("Filling dataBase (no random) : ");
		readFiles.populateBase();
		System.out.println();
		
		/* Create object duplicate */
		Duplicate dupli = new Duplicate();
		
		LinkedList<People> list = readFiles.getAllPeople(); // Get and print not reduced list
		int sizeNotReduced = list.size();
		System.out.println("All the people in the database : " + sizeNotReduced);
		System.out.println();
		
		System.out.println("Execution time of 3 methods : ");
		/* Execution time remove duplicate slow */
		long timeBeforeExecution = System.currentTimeMillis ();
		LinkedList<People> reducedListSlow = dupli.getPeopleListSlow(list); // Get and print reduced list
		long timeAfterExecution = System.currentTimeMillis ();
		long exectutionTime = timeAfterExecution - timeBeforeExecution;
		int sizeReducedSlow = reducedListSlow.size();
		System.out.println("Execution time of method \"getPeopleListSlow\" (using for) : " + exectutionTime + "ms (" + sizeReducedSlow + " people in list).");
		
		
		/* Execution time remove duplicate slow */
		long timeBeforeExecution2 = System.currentTimeMillis ();
		LinkedList<People> reducedListFast = dupli.getPeopleListFast(list); // Get and print reduced list
		long timeAfterExecution2 = System.currentTimeMillis ();
		long exectutionTime2 = timeAfterExecution2 - timeBeforeExecution2;	
		int sizeReducedFast = reducedListFast.size();
		System.out.println("Execution time of method \"getPeopleListFast\" (using iterator) : " + exectutionTime2 + "ms (" + sizeReducedFast + " people in list).");
		
		long timeBeforeExecution3 = System.currentTimeMillis ();
		TreeSet<People> treePeople = dupli.getPersonsABR(list);
		long timeAfterExecution3 = System.currentTimeMillis ();
		long exectutionTime3 = timeAfterExecution3 - timeBeforeExecution3;
		System.out.println("Execution time of method \"getPersonsABR\" (using TreeSet) : " + exectutionTime3 + "ms (" + treePeople.size() + " people in list).");
		System.out.println();
		System.out.println("getPersonsABR have only 57149 people car there is no (null) in it.");
	}
}



















