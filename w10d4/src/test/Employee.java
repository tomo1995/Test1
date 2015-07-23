package test;

public class Employee implements Searchable {
	private String name;
	private String surname;
	private int ID;
	private int salary;
	private int ages;
	/**
	 * Default constructor
	 * @param name Name of employe.
	 * @param surname His surname.
	 * @param iD .
	 * @param salary Wage of employee
	 * @param ages How many years employee has . .
	 */
	public Employee(String name, String surname, int iD, int salary, int ages) {
		super();
		this.name = name;
		this.surname = surname;
		ID = iD;
		this.salary = salary;
		this.ages = ages;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  name + " " + surname + " " + ID + " " + salary + " " + ages + " ";
	}


	@Override
	public boolean filtsSearch(String s) {
		// TODO Auto-generated method stub
		return false;
	}

}
