package week4.day1;

public class JavaConnection3b extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println(
				"connect() is an unimplemented method of DatabaseConnection Interface and implemented as part of concrete class JavaConnection3b");

	}

	@Override
	public void disconnect() {
		System.out.println(
				"disconnect() is an unimplemented method of DatabaseConnection Interface and implemented as part of concrete class JavaConnection3b");

	}

	@Override
	public void executeUpdate() {
		System.out.println(
				"executeUpdate() is an unimplemented method of DatabaseConnection Interface and implemented as part of concrete class  JavaConnection3b");

	}

	@Override
	public void executeQuery() {
		System.out.println(
				"executeQuery() is an unimplemented method of MySqlConnection Abstract Class and implemented as part of concrete class JavaConnection3b");

	}

	public static void main(String[] args) {
		JavaConnection3b javaOptions = new JavaConnection3b();
		javaOptions.connect();
		javaOptions.disconnect();
		javaOptions.executeQuery();
		javaOptions.executeQuery();
	}

}
