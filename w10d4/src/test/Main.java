package test;

import test.ArtisticWorks.PeriodFounded;
import test.HistoricalArtefacts.Period;

public class Main {
	Exhibits e1 = new Exhibits(1, "exhibit", "exhibit1");
	Exhibits e2 = new Exhibits(2, "exhibit2", "This is exhibit2");
	Exhibits e3 = new Exhibits(3, "exhibit3", "This is exhibit3");

	ArtisticWorks aw1 = new ArtisticWorks(1, "Tribuna of the Uffizi",
			"showing many famous works of European art", "Johann Zoffany",
			PeriodFounded.RENESANCE);
	ArtisticWorks aw2 = new ArtisticWorks(2, "The Birth of Venus",
			"It depicts the goddess Venus, having emerged from the sea as an adult woman,"
					+ " arriving at the sea-shore", "Sandro Botticelli",
			PeriodFounded.RENESANCE);
	HistoricalArtefacts haf = new HistoricalArtefacts(1,
			"megalithic standing stones", "historicalArtifact", "Lugg",
			Period.MIDDLE_AGES);
	HistoricalArtefacts haf2 = new HistoricalArtefacts(2, "Temple of Eshmun",
			"historical artefact 2", "Lebanon", Period.MIDDLE_AGES);
	Employee employee = new Employee("Bilal", "Bilalcic", 10013, 1000, 30);
	Employee employee2 = new Employee("Borislav", "Borislavic", 10105, 500, 23);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
