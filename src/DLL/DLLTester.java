package DLL;

public class DLLTester {

	public static void main(String[] args) {

		DLL ddl = new DLL();

		ddl.insert(10);
		ddl.insert(11);
		ddl.insert(12);
		ddl.insert(13);
		ddl.insert(14);

		ddl.display();

		System.out.println("Insert at position");
		ddl.insertAtPosition(16, 3);
		ddl.display();

		System.out.println("delete by position");
		ddl.deleteByposition(3);
		ddl.display();

		System.out.println("delete by value");
		ddl.deleteByValue(13);
		ddl.display();
	}

}
