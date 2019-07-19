package hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;


/**
 * 
 * @author 焦计划
 * @date 2019年6月29日 上午7:32:25
 */
@Entity
@Table(name="grade")
public class Grade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY,generator="id_generator")
	private int gid;
	@Column(name="gName", nullable=false,length=50)
	private String name;
	@Transient
	private List<Student> students;
	@Transient
	private School school;

	public Grade() {
		super();
	}
	
	
	public Grade(String name) {
		super();
		this.name = name;
	}


	public Grade(String name, List<Student> students, School school) {
		super();
		this.name = name;
		this.students = students;
		this.school = school;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}
