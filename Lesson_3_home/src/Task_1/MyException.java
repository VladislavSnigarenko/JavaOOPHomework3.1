package Task_1;

public class MyException extends Exception {

	@Override
	public String getMessage() {
		return "Error - limit 10 students."; 
	}

}
