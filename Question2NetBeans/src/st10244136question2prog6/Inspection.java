
package st10244136question2prog6;

import java.util.Scanner;

/**
 * Inspection abstract class implements the iInspection interface
 */
public abstract class Inspection implements iInspection { //(w3schools,2022)
	// instance variables
	protected String location;
	protected String hospitalName;
	protected int years; 

	/**
	 * constructor
	 * 
	 * @param location
	 * @param hospitalName
	 * @param years
	 */
	public Inspection(String location, String hospitalName, int years) {
		this.location = location;
		this.hospitalName = hospitalName;
		this.years = years;
	} //(w3schools,2022)

	public String getLocation() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the hospital location: ");
		location = scanner.nextLine();
		return location;
	} //(w3schools,2022)

	public String getHospitalName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the hospital name: ");
		hospitalName = scanner.nextLine();
		return hospitalName;
	} //(w3schools,2022)

	public int getYearsSinceInspection() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter years since last inspection: ");
		years = scanner.nextInt();
		return years;
	} //(w3schools,2022)
}
//Ref List
//w3schools,2022,https://www.w3schools.com/ Accessed 3 October 2022