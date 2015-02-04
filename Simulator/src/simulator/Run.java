<<<<<<< HEAD
package simulator;

import simulator.Person.Country;

/**
 * @author Tyler Davis
 * This will initiate the Simulator
 */

//test
//test
//test 3
//test 4
public class Run extends Simulator {

	public static void main(String[] args) {
		
		Simulator sim = getInstance(Simulator_Type.DISEASE_TWO);
		System.out.println("Sim type: " + sim.get_Type());
		sim.run_Simulator();
		
		/* Added a person and some characteristics
		 * 
		 * Future Thoughts: 
		 * 
		 * 
		 * Attribute Logic/Calculations to the Degree Of Exposure Based
		 * Add something to the Person Class that would determine the 
		 * likelihood of being contaminated within a certain period (Month, Day, Second, etc.)
		 */
		Person p = new Person();
		p.setAge(90);
		p.setInfectedStatus(true);
		p.setSex("Male");
		p.setDiseaseType(sim.get_Type());
		p.setCountryOfOrigin(Country.GUINEA);
		p.setDegreeOfExposure(0.98);
		
		System.out.println(p.toString());
		

		
	}
}
=======
package simulator;

/**
 * @author Tyler Davis
 * This will initiate the Simulator
 */

//test
//test
//test 3

public class Run extends Simulator {

	public static void main(String[] args) {
		
		Simulator sim = getInstance(Simulator_Type.DISEASE_TWO);
		System.out.println("Sim type: " + sim.get_Type());
		sim.run_Simulator();
	}
}
>>>>>>> parent of 2af2b29... Added some more to person class and to the run class to show stuff from
