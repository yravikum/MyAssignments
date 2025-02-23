package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		// Declare a String array and add the values as {HCL, Wipro, Aspire Systems,CTS}
		String[] companies = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// Add the array elements to the List
		List<String> companyNames = new ArrayList<String>();
		
		Collections.addAll(companyNames, companies);

		System.out.println("Company Names before sorting is : " + companyNames);

		// Sort using Collections
		Collections.sort(companyNames);
		System.out.println("Company Names After sorting is :" + companyNames);

		// Print the required output as Wipro, HCL, CTS, Aspire Systems

		// Using collections
		Collections.reverse(companyNames);

		System.out.println("Reverse of companyNames Array via collections is  : " + companyNames);

	}

}
