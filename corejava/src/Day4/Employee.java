package Day4;

public class Employee {
	private int id;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", experience=" + experience + ", seniority="
				+ seniority + ", salary=" + salary + "]";
	}

	private String name;
	private int age;
	private int experience;
	private int seniority;
	private int salary;
    private int dept_id;
	public Employee() {}

	public Employee(String name, int age, int experience, int seniority, int salary,int dept_id) {
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.seniority = seniority;
		this.salary = salary;
		this.dept_id=dept_id;
	}


	public Employee(int id, String name, int age, int experience, int seniority, int salary,int dept_id) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.seniority = seniority;
		this.salary = salary;
		this.dept_id=dept_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setDeptId(int dept_id) {
		// TODO Auto-generated method stub
		this.dept_id=dept_id;
	}

	public int getDeptId() {
		// TODO Auto-generated method stub
		return dept_id;
	}
	

}
