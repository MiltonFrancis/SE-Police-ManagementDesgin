package lockup;

import java.util.ArrayList;

public class Exhibit extends Item{
	
	private ArrayList<CaseFile> cases;

	public Exhibit(String itemName, String type, int shelfNumber,
			String description) {
		super(itemName, type, shelfNumber, description);
		
		this.cases = new ArrayList<CaseFile>();
	}
	
	public ArrayList<CaseFile> getCases()
	{
		return this.cases;
	}
	
	public void assignCase(CaseFile casefile)
	{
		this.cases.add(casefile);
	}
	
	public String getAllCaseID()
	{
		String casefiles = "";
		for (CaseFile casefile: cases)
		{
			casefiles += "#"+casefile.getCaseID()+"| ";
		}
		return casefiles;
	}
	
	public String toString()
	{
		return "\nItem Name: "+super.getItemName()+"\nType: "+super.getType()+"\nID Number: "+super.getIDNumber()
				+"\nShelf Number: "+super.getShelfNumber()+"\nDescription: "+super.getDescription()+"\nCase Linked: "+this.getAllCaseID()+
				"\n_____________________________________________________________\n"+
				  "_____________________________________________________________\n";
	}
	
	public static void main(String [] args)
	{
		Exhibit knife = new Exhibit("knife", "exhibit", 13, 
				"brown handle ratchet knife with red paint");
		
		System.out.println(knife.toString());
	}
}
