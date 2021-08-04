package hashmap.easy;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 10;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
