package week4.day1;

public class JavaConnection3a implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println(
				"connect() is an unimplemented method of DatabaseConnection Interface and being implemented as part of Concrete Class JavaConnection3a");

	}

	@Override
	public void disconnect() {
		System.out.println(
				"disconnect() is an unimplemented method of DatabaseConnection Interface and being implemented as part of Concrete Class JavaConnection3a");

	}

	@Override
	public void executeUpdate() {
		System.out.println(
				"executeUpdate() is an unimplemented method of DatabaseConnection Interface and being implemented as part of Concrete Class JavaConnection3a");

	}

	public static void main(String[] args) {

		JavaConnection3a javaOptions = new JavaConnection3a();
		javaOptions.connect();
		javaOptions.disconnect();
		javaOptions.executeUpdate();

	}

}
