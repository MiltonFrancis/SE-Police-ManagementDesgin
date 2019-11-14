package lockup;

import java.util.ArrayList;

public class Authenticator {
	
	private PrisonerManager manager; 
	private ValidUser admin;
	private ArrayList<ValidUser> validUsers;
	
	public Authenticator ()
	{
		this.manager = DataManager.getPrisonerManager();
		this.admin = new ValidUser(); 
		this.validUsers = new ArrayList<ValidUser>();
	}
	
	public void changeAdminInfo(int userName, String password)
	{
		this.admin.setUserName(userName);
		this.admin.setPassword(password);
	}
	
	public void createValidUser(int username, String password, int accessLevel)
	{
		validUsers.add(new ValidUser(username, password, accessLevel));
	}
	
	public void removeValidUser(int userName)
	{
		for (ValidUser validUser: validUsers)
		{
			if (validUser.getUserName() == userName)
			{
				validUsers.remove(validUser);
				break;
			}
		}
	}
	
	public boolean access(int enteredUserName, String enteredPassword)
	{
		for (ValidUser validUser: validUsers)
		{
			if ((validUser.getUserName()== enteredUserName) && (enteredPassword.equals(validUser.getPassword())))
			{
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {


	}

}
