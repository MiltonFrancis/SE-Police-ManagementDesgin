package lockup;

public class PoliceOfficerInformation
{
	private String name;
	private String rank;
	private int IDNumber;
	
	public PoliceOfficerInformation(String name, String rank, int IDNumber)
	{
		this.name = name;
		this.rank = rank;
		this.IDNumber = IDNumber;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}
	
	public String tostring(){
		return this.IDNumber+" "+this.rank+" "+this.name;
	}
	
}
