package hibernate;
/**
 * 
 * @author 焦计划
 * @date 2019年6月26日  下午11:32:22
 */
public class Student {
	private int id;
	private String name;
	private String grade;
	private School school;

	public Student() {
		super();
	}

	public Student(String name, String grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	

	public Student(String name, String grade, School school) {
		super();
		this.name = name;
		this.grade = grade;
		this.school = school;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
}
