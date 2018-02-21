package Task_1;

public class Student extends Person {

	@Override
	public String toString() {
		return "Student : " + getFirstName() + ", " + getLastName() + ", " + getAge() + ", [card=" + card + ", course=" + course + "]";
	}

	private String card;
	private Integer course;

	public Student() {
		super();
	}

	public Student(String firstName, String lasrName, Integer age, String card, Integer course) {
		super(firstName, lasrName, age);
		this.card = card;
		this.course = course;
	}

	public Student(String card, Integer course) {
		super();
		this.card = card;
		this.course = course;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

}
