package simulator;

//test
//test in class

public class Person extends Simulator {
	
	private boolean infected;
	private double exposureValue;
	private String sex;
	private int age;
	// countries with ebola outbreaks
	public enum Country {SIERRA_LEONE, LIBERIA, GUINEA, NIGERIA, MALI};
	Country countryOfOrigin;
	
	Simulator.Simulator_Type diseaseType;
	
	
	public Person(){}
	
	public Person(Simulator.Simulator_Type diseaseType, boolean infected, String sex, 
			int age, Country countryOfOrigin, float exposureValue) 
	{
		this.diseaseType = diseaseType;
		this.infected = infected;
		this.sex = sex;
		this.age = age;
		this.countryOfOrigin = countryOfOrigin;
		this.exposureValue = exposureValue;
	}
	
	
	public Person getInstance() 
	{
		
		return new Person();
	}
	
	//get disease Type
	public Simulator.Simulator_Type getDiseaseType()
	{
		return this.diseaseType;
	}
	
	//set disease Type
	public void setDiseaseType(Simulator.Simulator_Type disease)
	{
		this.diseaseType = disease;
	}
	
	// informational purposes
	public boolean isInfected()
	{		
		return infected;
	}
	
	public void setInfectedStatus(boolean infected)
	{
		this.infected = infected;
	}
	
	// hah thats what she said
	// should probably change this to gender 
	public String getSex()
	{
		// cleaning up input
		return this.sex.trim().substring(0,1);
	}
	
	public void setSex(String sex)
	{
		// cleaning up input
		this.sex = sex.trim().substring(0,1);
	}
	
	// sets age
	public void setAge(int age)
	{
		this.age = age;
	}
	
	//gets age
	public int getAge()
	{ 
		return this.age;
	}
	
	// sets countryOfOrigin
	public Country getCountryOfOrigin()
	{
		return this.countryOfOrigin;
	}
	
	//gets countryOfOrigin
	public void setCountryOfOrigin(Country country)
	{
		this.countryOfOrigin = country;
	}
	
	// sets Degree Of Exposure 
	public void setDegreeOfExposure(double exposureValue)
	{
		this.exposureValue = exposureValue;
	}
	
	// gets Degree of Exposure
	public double getDegreeOfExposure()
	{
		return this.exposureValue;
	}
	

	public String toString()
	{
		return "Country Of Origin: " + this.countryOfOrigin + "\nInfected: " + this.infected 
				+"\nExposure Value: " + this.exposureValue + "\nSex: " + this.sex + "\nAge: " + this.age 
				+"\nDiseaseType: " + this.diseaseType + "\n\n";
	}
	

	
	
	

}
