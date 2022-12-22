package stack_generic;

public class Main {

	public static void main(String[] args) {

		StackGeneric<Employee> stackE = new StackGeneric<Employee>();

		stackE.push(new Employee(10, "Jayesh"));
		stackE.push(new Employee(11, "Pritam"));
		stackE.push(new Employee(12, "Suraj"));
		stackE.push(new Employee(13, "Hemant"));
		
		Employee e = stackE.pop();
		e.display();
		
		
		
		StackGeneric<String> sstack = new StackGeneric<>();
		
		sstack.push("Jayesh");
		sstack.push("Hemant");
		sstack.push("Suraj");
		
		System.out.println(sstack.pop());

	}

}
