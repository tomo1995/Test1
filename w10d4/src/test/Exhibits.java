package test;

public class Exhibits implements Searchable {
	public int ID;
	public String name;
	public String description;
	/**
	 * Default Constructor
	 * @param iD Id of exhibitt.
	 * @param name Name of exhibitte.
	 * @param description 
	 */
	public Exhibits(int iD, String name, String description) {
		super();
		ID = iD;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Exhibits [ID=" + ID + ", name=" + name + ", description="
				+ description + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Exhibits other = (Exhibits) o;
		if (ID != other.ID)
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
	public boolean filtsSearch(String s) {
		// TODO Auto-generated method stub
		return false;
	}

}
