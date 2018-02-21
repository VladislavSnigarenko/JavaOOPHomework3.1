package Task_1;

public class Main {

	public static void main(String[] args) {

		Group group_2_k = new Group("2k");
		System.out.println(group_2_k);

		group_2_k.add(new Student("Белов", "Петр", 19, "KT-256879", 4));
		System.out.println(group_2_k);
		
		group_2_k.add(new Student("Кузьминов", "Владимир", 20, "KT-256015", 1));
		System.out.println(group_2_k);
		
		group_2_k.add(new Student("Белов", "Андрей", 22, "KБ-250241", 2));
		System.out.println(group_2_k);
		
		
		if ("Иван".compareTo("Петр") > 0)
			System.out.println("+");
		else
			System.out.println("-");

		/*
		if ("Иван".compareTo(n) > 0)
			System.out.println("+");
		else
			System.out.println("-");
		 */			

	}

}
