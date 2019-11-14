package lockup;

import java.util.ArrayList;

public class PrisonerRecord
{

	private String name;
	private String dateOfBirth;
	private String alias;
	private String address;
	private String occupation;
	private String gender;
	private String nationality;
	private String nextOfKin;
	private double height;
	private String build;
	private String ethnicity;
	private String hairColour;
	private String hairStyle;
	private int cellNumber;
	private PoliceOfficerInformation arrestingOfficer;
	private ArrayList<CaseFile> cases;
	private int IDNumber;
	private int bailStatus;
	private int counter;
	
	
	public PrisonerRecord(String name, String dateOfBirth, String alias, String address, String occupation, String gender,
			String nationality, String nextOfKin, double height, String build, String ethnicity, String hairColour,
			String hairStyle, int cellNumber)
	{
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.alias = alias;
		this.address = address;
		this.occupation = occupation;
		this.gender = gender;
		this.nationality = nationality;
		this.nextOfKin = nextOfKin;
		this.height = height;
		this.build = build;
		this.ethnicity = ethnicity;
		this.hairColour = hairColour;
		this.hairStyle = hairStyle;
		this.cellNumber = cellNumber;
		this.counter = DataManager.getPrisonerCount();
		this.IDNumber = ++counter;
		this.bailStatus = 0;
		this.arrestingOfficer = null;
		this.cases = new ArrayList<CaseFile>();
		
		DataManager.savePrisonerCount(counter);
		
	}
	
	public PrisonerRecord(){}

	
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDateOfBirth() 
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}

	public String getAlias()
	{
		return alias;
	}

	public void setAlias(String alias) 
	{
		this.alias = alias;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNextOfKin() {
		return nextOfKin;
	}

	public void setNextOfKin(String nextOfKin) {
		this.nextOfKin = nextOfKin;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBuild() {
		return build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	public String getHairStyle() {
		return hairStyle;
	}

	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}

	public int getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(int cellNumber) {
		this.cellNumber = cellNumber;
	}

	public ArrayList<CaseFile> getCases() {
		return cases;
	}
	
	public String getAllCaseNumbers()
	{
		String caselist = "";
		for (CaseFile casefile: cases)
		{
			caselist+= "#"+casefile.getCaseID()+"| ";
		}
		return caselist;
	}
	
	public void addCase(CaseFile casefile)
	{
		this.cases.add(casefile);
	}
	
	public int getIDNumber()
	{
		return this.IDNumber;
	}
	
	public int getBailStatus()
	{
		return this.bailStatus;
	}
	
	public void setBailStatus(int bailValue)
	{
		if (bailValue > 3 || bailValue < 0)
		{
			this.bailStatus = 3;
		}
		else
		{
			this.bailStatus = bailValue;	
		}
	}
	
	public String toString(){
		String prisonerData = "Name: "+this.name+"\nID Number: "+this.getIDNumber()+"\nDate of Birth: "+this.dateOfBirth+"\nAlias: "+this.alias+"\nOccupation: "+this.occupation
				+"\nGender: "+this.gender+"\nNationality: "+this.nationality+"\nNext of Kin: "+this.nextOfKin+"\nHeight: "+
				this.height+"\nBuild: "+this.build+"\nHair Colour: "+this.hairColour+"\nHair Style: "+this.hairStyle+
				"\nCell Number: "+this.cellNumber+"\nCases: "+this.getAllCaseNumbers();
		return prisonerData+"\n_____________________________________________________________"+
				"\n_____________________________________________________________\n";
	}
	
	public static void main(String [] args)
	{
		PrisonerRecord bob = new PrisonerRecord("bob bill", "1996/02/10", "bobby", "3 make up town, kgn 13", "fireman", "male", "jamaican",
				"marcia barnet", 6, "slim", "indian", "black", "corn row", 14);
		System.out.println(bob.toString());
	}
	
	
}
