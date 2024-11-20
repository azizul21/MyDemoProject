
public class User {
	private String name;
	private String cat;
	private int sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public User(String name, String cat, int sal) {
		//super();
		this.name = name;
		this.cat = cat;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", cat=" + cat + ", sal=" + sal + "]";
	}
	
	
	
}
