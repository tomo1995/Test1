package test;

public class HistoricalArtefacts extends Exhibits {

	private String origin;

	public enum Period {

		CLASSICAL, MIDDLE_AGES, MODERN_ERA;

	}
	/**
	 * 
	 * @param iD
	 * @param name Namre of artifact
	 * @param description description of artifact
	 * @param origin where artifact is founded
	 * @param period From which ages.
	 */
	public HistoricalArtefacts(int iD, String name, String description,
			String origin, Period period) {
		super(iD, name, description);
		this.origin = origin;

	}
	

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!super.equals(o))
			return false;
		if (getClass() != o.getClass())
			return false;
		HistoricalArtefacts other = (HistoricalArtefacts) o;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ID + " " + name + " " + description + "" + origin + " ";
	}

}
