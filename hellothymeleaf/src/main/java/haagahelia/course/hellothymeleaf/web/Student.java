package haagahelia.course.hellothymeleaf.web;

public class Student {
	
	private String first;
	private String last;
	private String email;
	
	public Student(String first, String last, String email) {
		// TODO Auto-generated constructor stub
		this.first = first;
		this.last = last;
		this.email = email;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
