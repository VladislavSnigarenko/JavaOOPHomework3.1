package Task_1;

import java.util.Arrays;

public class Group {

	private String name;
	private Student[] students = new Student[10];
	private Student[] studentsLocal;

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

	public void add(Student student) {

		int freeIndex = getFreeIndex();

		System.out.println("freeIndex = " + freeIndex);
		
		try {
			students[freeIndex] = student;
		} catch (Exception e) {
			e.getMessage();
		}

		System.out.println(students.length);

	}

	private int getFreeIndex() {
		int index = -1;
		
		System.out.println("students.length = " + students.length);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("i = " + i + " / " + students[i]);
			if (students[i] == null)
				return i;
		}
		
		System.out.println("Ok");
		
		return index;
	}

	public void remove(Student student) {
	}

	public void found(String card) {
	}

	public class MyException extends Exception {
		@Override
		public String getMessage() {
			return "The maximum count students = 10";
		}
	}

	@Override
	public String toString() {
		int count = 0;
		for (Student student : students)
			if (student != null)
				count++;

		if (count == 0)
			return "Group : " + name + " is empty.";

		studentsLocal = new Student[count];
		int index = 0;
		for (Student student : students)
			if (student != null) {
				studentsLocal[index] = student;
				index++;
			}

		System.out.println("students : " + Arrays.toString(students));
		System.out.println("studentsLocal : " + Arrays.toString(studentsLocal));

		Student student;
		for (int i = 0; i < studentsLocal.length; i++)
			for (int j = i; j < studentsLocal.length; j++) {
				if (studentsLocal[i].toString().compareTo(studentsLocal[j].toString()) > 0) {
					student = studentsLocal[i];
					studentsLocal[i] = studentsLocal[j];
					studentsLocal[j] = student;
				}
			}

		return "Group [students=" + Arrays.toString(studentsLocal) + "]";
	}

}
