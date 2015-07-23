package test;

import java.util.Arrays;
import java.util.List;

public class Museum {
	//List arrays
	private List<Exhibits>[] exhibits;
	private List<ArtisticWorks>[] artisticWorks;
	private List<HistoricalArtefacts>[] historicalArtefacts;
	private List<Employee>[] employee;

	/**
	 * Default Constructor
	 * @param exhibits 
	 * @param artisticWorks 
	 * @param historicalArtefacts
	 * @param employee
	 */
	public Museum(List<Exhibits>[] exhibits,
			List<ArtisticWorks>[] artisticWorks,
			List<HistoricalArtefacts>[] historicalArtefacts,
			List<Employee>[] employee) {
		super();
		this.exhibits = exhibits;
		this.artisticWorks = artisticWorks;
		this.historicalArtefacts = historicalArtefacts;
		this.employee = employee;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Museum other = (Museum) obj;
		if (!Arrays.equals(artisticWorks, other.artisticWorks))
			return false;
		if (!Arrays.equals(employee, other.employee))
			return false;
		if (!Arrays.equals(exhibits, other.exhibits))
			return false;
		if (!Arrays.equals(historicalArtefacts, other.historicalArtefacts))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Museum [exhibits=" + Arrays.toString(exhibits)
				+ ", artisticWorks=" + Arrays.toString(artisticWorks)
				+ ", historicalArtefacts="
				+ Arrays.toString(historicalArtefacts) + ", employee="
				+ Arrays.toString(employee) + "]";
	}

}
