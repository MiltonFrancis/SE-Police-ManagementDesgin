package lockup;

import java.util.*;


public class CaseFile 
{
	private Date date;
	private String offence;
	private PoliceOfficerInformation investigatingOfficer;
	private String dateOffenceCommitted;
	private String timeOffenceCommitted;
	private String locationCommitted;
	private String witnesses;
	private String weaponUsed;
	private String dateCaseStarted;
	private int caseID;
	private String investigatingOfficerStatement;
	private String witnessStatement;
	private ArrayList<Exhibit> exhibits;
	private boolean caseStatus;
	private int counter;
	private ArrayList<PrisonerRecord> prisonerLinked;
	
	public CaseFile(String offence, String dateOffenceCommitted,String timeOffenceCommitted, String locationCommitted, 
			PoliceOfficerInformation investigatingOfficer,
			String witnesses, String weaponUsed)
	{
		this.offence = offence; 
		this.investigatingOfficer = investigatingOfficer;
		this.dateOffenceCommitted = dateOffenceCommitted;
		this.timeOffenceCommitted = timeOffenceCommitted;
		this.locationCommitted = locationCommitted;
		this.witnesses = witnesses;
		this.weaponUsed = weaponUsed;
		this.counter = DataManager.getCaseCount();
		this.caseID = ++counter;
		this.caseStatus = false;
		this.exhibits = new ArrayList<Exhibit>();
		this.prisonerLinked = new ArrayList<PrisonerRecord>();
		this.date = new Date();
		this.dateCaseStarted = date.toString();
		
		DataManager.saveCaseCount(counter);
	}
	// null constructor
	public CaseFile(){}
	
	// get offence for casefile
	public String getOffence() 
	{
		return offence;
	}

	// set offence for case file
	public void setOffence(String offence) 
	{
		this.offence = offence;
	}
	
	// get investigating officer of the case file
	public PoliceOfficerInformation getInvestigatingOfficer() 
	{
		return investigatingOfficer;
	}
	
	// assign investigating officer to case
	public void setInvestigatingOfficer(PoliceOfficerInformation investigatingOfficer) 
	{
		this.investigatingOfficer = investigatingOfficer;
	}

	// get the date offence was committed
	public String getDateOffenceCommitted() {
		return dateOffenceCommitted;
	}

	// set the date offence took place for a case
	public void setDateOffenceCommitted(String dateOffenceCommitted) {
		this.dateOffenceCommitted = dateOffenceCommitted;
	}

	//returns the time offence committed
	public String getTimeOffenceCommited() {
		return timeOffenceCommitted;
	}

	// set the time offence commited for case
	public void setTimeOffenceCommited(String timeOffenceCommited) {
		this.timeOffenceCommitted = timeOffenceCommited;
	}

	//
	public String getLocationCommitted() {
		return locationCommitted;
	}

	public void setLocationCommitted(String locationCommitted) {
		this.locationCommitted = locationCommitted;
	}

	public String getWitnesses() {
		return witnesses;
	}

	public void setWitnesses(String witnesses) {
		this.witnesses = witnesses;
	}

	public String getWeaponUsed() {
		return weaponUsed;
	}

	public void setWeaponUsed(String weaponUsed) {
		this.weaponUsed = weaponUsed;
	}

	public ArrayList<PrisonerRecord> getPrisonerLinked() {
		return prisonerLinked;
	}
	
	public long getCaseID()
	{
		return this.caseID;
	}
	
	public boolean getCaseStatus()
	{
		return this.caseStatus;
	}
	
	public void setCaseStatus(boolean status)
	{
		this.caseStatus = status;
	}

	public void setPrisonerLinked(ArrayList<PrisonerRecord> prisonerLinked) {
		this.prisonerLinked = prisonerLinked;
	}
	
	public void addInvestigatingOfficerStatement(String statement)
	{
		this.investigatingOfficerStatement = statement;
	}
	
	public void addWitnessStatement(String statement)
	{
		this.witnessStatement = statement;
	}
	
	public String getDateStarted()
	{
		return this.dateCaseStarted;
	}
	
	public String toString()
	{
		return "Offence: "+this.offence+"\nCase ID: "+this.getCaseID()+"\nDate Case Started: "+this.getDateStarted()+
				"\nDate offence commited: "+this.dateOffenceCommitted+"\nTime of offence: "+
				this.timeOffenceCommitted+"\nLocation Offence committed: "+this.locationCommitted+
				"\nInvestigating Officer: "+this.investigatingOfficer.tostring()+
				"\nWitnesses: "+this.witnesses+"\nWeapon Used: "+ this.weaponUsed+
				"\n_____________________________________________________________\n"+
				  "_____________________________________________________________\n";
				
	}
	
	public static void main(String [] args)
	{
		PoliceOfficerInformation john = new PoliceOfficerInformation("John Brown", "Sgt", 15823);
		CaseFile regina = new CaseFile("Murder", "2019/03/01", "2am","Voilence Land kgn 18", john, "patsy", "knife");
		
		System.out.println(regina.toString());
	}
}
