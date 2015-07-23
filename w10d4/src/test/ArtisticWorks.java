package test;

import test.ArtisticWorks.PeriodFounded;

public class ArtisticWorks extends Exhibits {
	private String author;

	public enum PeriodFounded {
		RENESANCE, NEOCLASSICISM, MODERN, CONTEMPORARY_ART;
	}
	/**
	 * Default constructor
	 * @param iD
	 * @param name What is it called
	 * @param description About 
	 * @param author Name of aauthor...
	 * @param period From which is it.
	 */
	public ArtisticWorks(int iD, String name, String description,
			String author, PeriodFounded period) {
		super(iD, name, description);
		this.author = author;
		

	}

	

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		ArtisticWorks other = (ArtisticWorks) o;
		if (ID != other.ID)
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;

	}

	@Override
	public String toString() {
		return ID + "" + name + " " + description + " " + author;
	};

}
