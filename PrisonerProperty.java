package lockup;

import java.util.ArrayList;

public class PrisonerProperty extends Item
{
	
	private PrisonerRecord prisoner;
	
	public PrisonerProperty(String itemName, String type, int shelfNumber,
			String description) {
		super(itemName, type, shelfNumber, description);
		
		this.prisoner = new PrisonerRecord();
	}

	public PrisonerRecord getPrisonerRecord()
	{
		return this.prisoner;
	}
	
	public void assignToPrisoner(PrisonerRecord prisoner)
	{
		this.prisoner = prisoner;
	}
	
	public String toString()
	{
		return "\nItem Name: "+super.getItemName()+"\nType: "+super.getType()+"\nID Number: "+super.getIDNumber()
				+"\nShelf Number: "+super.getShelfNumber()+"\nDescription: "+super.getDescription()+"\nOwner: "+this.prisoner.getIDNumber()+
				"\n_____________________________________________________________\n"+
				  "_____________________________________________________________\n";
	}
	
	public static void main(String [] args)
	{
		PrisonerProperty cellPhone = new PrisonerProperty("IPhoneX", "prisoner Property", 12, 
				"black iphone x with three scratches on the back");
		
		System.out.println(cellPhone.toString());
	}
}
