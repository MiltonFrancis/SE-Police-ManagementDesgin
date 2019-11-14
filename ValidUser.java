package lockup;

public class ValidUser 
{
	private int accessLevel;
	private int userName;
	private String password;
	
	public ValidUser(int userName, String password, int accessLevel)
	{
		this.accessLevel = accessLevel;
		this.userName = userName;
		this.password = password;
	}
	
	public ValidUser()
	{
		this.userName = 0000;
		this.password = "admin";
	}
	public int getUserName() {
		return userName;
	}
	
	public void setAccessLevel(int level)
	
	{
		if (level>1 || level < 0)
		{
			accessLevel = 0;
		}
		
		this.accessLevel = level;
	}
	
	public int getAccessLevel()
	{
		return this.accessLevel;
	}

	public void setUserName(int userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		

	}

}
