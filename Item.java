package lockup;

public class Item 
{

	private String itemName;
	private String type;
	private int shelfNumber;
	private String description;
	private int IDNumber;
	private int counter;
	
	public Item(String itemName, String type, int shelfNumber, String description)
	{
		this.itemName = itemName;
		this.type = type;
		this.shelfNumber = shelfNumber;
		this.description = description;
		this.counter = DataManager.getItemCount();
		this.IDNumber = ++counter;
		DataManager.saveItemCount(counter);
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getShelfNumber() {
		return shelfNumber;
	}

	public void setShelfNumber(int shelfNumber) {
		this.shelfNumber = shelfNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getIDNumber()
	{
		return this.IDNumber;
	}
}
