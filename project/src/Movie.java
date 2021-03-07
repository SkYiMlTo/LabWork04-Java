import java.util.LinkedList;

public class Movie {

	private String title;
	private People director;
	private LinkedList<People> actors;
	private int year;
	
	
	
	
	public Movie(String titleP, People director, int year) {
		super();
		title = titleP;
		this.director = director;
		this.year = year;
		this.actors = new LinkedList<People>();
	}
	
	public void addActor(People p1) {
		actors.add(p1);
	}

	public void setActors(LinkedList<People> actors) {
		this.actors = actors;
	}

	public String getTitle() {
		return title;
	}
	public People getDirector() {
		return director;
	}
	public LinkedList<People> getActors() {
		return actors;
	}
	public int getYear() {
		return year;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", actors=" + actors + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (actors == null) {
			if (other.actors != null)
				return false;
		} else if (!actors.equals(other.actors))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	
	}

	

