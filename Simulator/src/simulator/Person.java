package simulator;

public class Person extends Simulator {
	
	public Person(){}
	
	
	public Person getInstance() 
	{
		
		return new Person();
	}
	

	public String toString()
	{
		return "Country Of Origin: " + this.countryOfOrigin + "\nInfected: " + this.infected 
				+"\nExposure Value: " + this.exposureValue + "\nSex: " + this.sex + "\nAge: " + this.age 
				+"\nDiseaseType: " + this.diseaseType + "\n\n";
	}
	

	
	
	

}
