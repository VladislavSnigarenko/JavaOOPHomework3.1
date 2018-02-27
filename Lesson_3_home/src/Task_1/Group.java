package Task_1;

import java.util.Arrays;

public class Group {

	private String name;
	private Student[] students = new Student[10];

	public Group(String name) {
		this.name = name;
	}

	public Group() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(Student student) throws MyException {
		int freeIndex = getFreeIndex();
		try {
			students[freeIndex] = student;
		} catch (Exception e) {
			throw new MyException();
		}
	}

	private int getFreeIndex() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null)
				return i;
		}
		return -1;
	}

	public void remove(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				students[i] = null;
				System.out.println(student + " remove from group : " + name);
				return;
			}
		}
		System.out.println("Not exist : " + student + " in group : " + name);
	}

	public void remove(String card) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && card.equals(students[i].getCard())) {
				System.out.println(students[i] + " remove from group : " + name);
				students[i] = null;
				return;
			}
		}
		System.out.println("Not exist student with card : " + card + " in group : " + name);
	}

	public Student Search(String firstName) {
		if (firstName.isEmpty()) {
			return null;
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && firstName.equals(students[i].getFirstName())) {
				return students[i];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		int count = 0;
		for (Student student : students)
			if (student != null)
				count++;

		if (count == 0)
			return "Group : " + name + " is empty." + "\n";

		Student[] studentsLocal = new Student[count];
		int index = 0;
		for (Student student : students)
			if (student != null) {
				studentsLocal[index] = student;
				index++;
			}

		Student student;
		for (int i = 0; i < studentsLocal.length; i++)
			for (int j = i; j < studentsLocal.length; j++) {
				if (studentsLocal[i].toString().compareTo(studentsLocal[j].toString()) > 0) {
					student = studentsLocal[i];
					studentsLocal[i] = studentsLocal[j];
					studentsLocal[j] = student;
				}
			}

		StringBuilder builder = new StringBuilder();
		builder.append("\n" + "Students of group : " + name + ", count = " + studentsLocal.length + "\n");
		for (Student stud : studentsLocal) {
			builder.append(stud + "\n");
		}
		builder.append("\n");

		return builder.toString();
	}

}
