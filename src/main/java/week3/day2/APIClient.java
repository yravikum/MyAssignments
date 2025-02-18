package week3.day2;

public class APIClient {

	// Demonstrating Method Overloading in Java

	public void sendRequest(String endpoint) {
		System.out.println(endpoint);

	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint + "     " + requestBody + "     " + requestStatus);

	}

	public static void main(String[] args) {
		APIClient options = new APIClient();
		options.sendRequest("https://google.com");
		options.sendRequest("https://facebook.com", "<html><body>This is the body</body></html>", true);

	}

}
