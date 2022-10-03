
package st10244136question2prog6;
/**
 * class HospitalInspection inherits from Inspection class
 */
public class HospitalInspection extends Inspection { //(w3schools,2022)

	/**
	 * constructor
	 * 
	 * @param location
	 * @param hospitalName
	 * @param years
	 */
	public HospitalInspection(String location, String hospitalName, int years) {
		// call to super class constructor
		super(location, hospitalName, years); //(w3schools,2022)
	}

	@Override
	public String getInspectionNeeded() {
		// check if years of inspection for more than 2 years
		if (years > 2) {
			return "YES";
		} else {
			return "NO";
		}
	} //(w3schools,2022)

	/**
	 * Prints the hospital location, hospital name, years and whether inspection is
	 * due
	 */
	public void printInspectionReport() {
		System.out.println("\nHospital Inspection Report");
		System.out.println("********************");
		System.out.println("Hospital Location: " + location);
		System.out.println("Hospital: " + hospitalName);
		System.out.println("Years Since Inspection: " + years);
		System.out.println("Inspection Needed: " + getInspectionNeeded());
	} //(w3schools,2022)
}

//Ref List
//w3schools,2022,https://www.w3schools.com/ Accessed 3 October 2022