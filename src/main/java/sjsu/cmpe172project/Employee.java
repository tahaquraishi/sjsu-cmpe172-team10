package sjsu.cmpe172project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private boolean working;
	private boolean scheduled;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isWorking() {
		return working;
	}
	
	public void setWorking(boolean working) {
		this.working = working;
	}
	
	public boolean isScheduled() {
		return scheduled;
	}
	
	public void setScheduled(boolean scheduled) {
		this.scheduled = scheduled;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", working=" + working + ", scheduled=" + scheduled + "]";
	}
	
	
}