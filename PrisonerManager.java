package lockup;

import java.util.ArrayList;
import java.util.Stack;

public class PrisonerManager {
	
	private ArrayList<Exhibit> exhibits;
	private ArrayList<PrisonerProperty> prisonerProperties;
	private ArrayList<CaseFile> cases;
	private ArrayList<PrisonerRecord> inmates;

	// constructor creates three array list: for exhibits, prisoner properties, case files and prisoner records 
	public PrisonerManager()
	{
		this.exhibits = new ArrayList<Exhibit>();
		this.prisonerProperties = new ArrayList<PrisonerProperty>();
		this.cases = new ArrayList <CaseFile>();
		this.inmates = new ArrayList<PrisonerRecord>();
	}
	
	// add a prisoner to prisoner list
	public void addInmate(String name, String dateOfBirth, String alias, String address, String occupation, String gender,
			String nationality, String nextOfKin, double height, String build, String ethnicity, String hairColour,
			String hairStyle, int cellNumber)
	{
		this.inmates.add(new PrisonerRecord(name, dateOfBirth, alias, address, occupation, gender,
			nationality, nextOfKin, height, build, ethnicity, hairColour,
			 hairStyle, cellNumber));
	}
	
	// add case file to case file list
	public void addCaseFile(String offence, String dateOffenceCommitted,String timeOffenceCommited, String locationCommitted, 
			PoliceOfficerInformation investigatingOfficer,
			String witnesses, String weaponUsed)
	{
		this.cases.add(0, new CaseFile(offence, dateOffenceCommitted, timeOffenceCommited, locationCommitted, 
			 investigatingOfficer,
			 witnesses, weaponUsed));
		
	}
	
	// add exhibits to exhibits list
	public void addExhibit()
	{
		
	}
	
	// add prisoner property to prisoner property list
	public void addPrisonerProperty()
	{
		
	}
	
	//return prisonerRecord object given id number. what this will do is iterate via the list of prisoner and check their id
	//number and return the object if it matches given id number
	public PrisonerRecord searchPrisoner(int id_number)
	{
		return null;
	}
	
	// return case file object given id number
	public CaseFile searchCaseFile(int id_number)
	{
		return null;
	}
	
	// return exhibit object given id_number
	public Exhibit searchExhibit(int id_number)
	{
		return null;
	}
	
	// return prisoner property given prisoner id
	public PrisonerProperty searchPrisonerProperty(int id_number)
	{
		return null;
	}
	
	//
	public void sortCasesbydate()
	{
		
	}
	
	// sort inmates in descending order of id number
	public void sortInmateDescending()
	{
		
	}
	
	// sort inmates in ascending order of id number
	public void sortInmateAscending()
	{
		
	}
	
	//view
	public void viewExhibits()
	{
		
	}
	
	public void viewPrisonerProperties()
	{
		
	}
	
	// 
	public void viewAllCases()
	{
		for (CaseFile casefile: cases)
		{
			System.out.println(casefile.toString());
		}
	}
	
	public void viewCasesByMonthYear(int month, int year)
	{
		
	}
	
	public void viewSortedInmates()
	{
		for (PrisonerRecord inmate: inmates)
		{
			System.out.println(inmate.toString());
		}
	}
			
	public static void main(String[] args) {
		
		PrisonerManager manager = new PrisonerManager();
		manager.addInmate("bob bill", "1996/02/10", "bobby", "3 make up town, kgn 13", "fireman", "male", "jamaican",
				"marcia barnet", 6, "slim", "indian", "black", "corn row", 14);
		PoliceOfficerInformation john = new PoliceOfficerInformation("John Brown", "Sgt", 15823);
		manager.addCaseFile("Murder", "2019/03/01", "2am","Voilence Land kgn 18", john,"patsy", "knife");
		manager.addCaseFile("rape", "2019/04/11", "5am","raper Land kgn 12", john, "hemma", "penis/vagina");
		manager.addCaseFile("robbery", "2019/04/11", "5am","raper Land kgn 12", john, "hemma", "penis/vagina");
		
		manager.viewAllCases();
		manager.viewSortedInmates();
		
		
	}

}
