package simulator;

public class Person extends Simulator {
	
	
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
		
		
	}
	
	//get disease Type
	public Simulator.Simulator_Type getDiseaseType()
	{
		
	}
	
	//set disease Type
	public void setDiseaseType(Simulator.Simulator_Type disease)
	{
		
	}
	
	// informational purposes
	public boolean isInfected()
	{		
		
	}
	
	public void setInfectedStatus(boolean infected)
	{
		
	}
	
	
	public String getSex()
	{
		
	}
	
	public void setSex(String sex)
	{
		
	}
	
	// sets age
	public void setAge(int age)
	{
		
	}
	
	//gets age
	public int getAge()
	{ 
		
	}
	
	// sets countryOfOrigin
	public Country getCountryOfOrigin()
	{
		
	}
	
	//gets countryOfOrigin
	public void setCountryOfOrigin(Country country)
	{
		
	}
	
	// sets Degree Of Exposure 
	public void setDegreeOfExposure(double exposureValue)
	{
		
	}
	
	// gets Degree of Exposure
	public double getDegreeOfExposure()
	{
		
	}
	

	public String toString()
	{
		
	}
	

	
	
	

}