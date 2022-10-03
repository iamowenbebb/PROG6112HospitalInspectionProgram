
package st10244136question2prog6;
/**
 * main class
 */
public class Use_Inspection {

	public static void main(String[] args) {
		// instantiate the Hospital Inspection class.
		HospitalInspection hospitalInspection = new HospitalInspection(null, null, 0); //(w3schools,2022)
		// get input for inspection
		String location = hospitalInspection.getLocation();
		String name = hospitalInspection.getHospitalName();
		int years = hospitalInspection.getYearsSinceInspection(); //(w3schools,2022)
		// print inspection report
		hospitalInspection.printInspectionReport(); //(w3schools,2022)
	}
}

//Ref List
//w3schools,2022,https://www.w3schools.com/ Accessed 3 October 2022