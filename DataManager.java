package lockup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DataManager {
	
	/**
	 * This method saves a address book object to a binary file (data.bin)
	 * @param myBook accepts an address book object
	 */
	
	public static void save(PrisonerManager lock_up){
		
		FileOutputStream fos;
		ObjectOutputStream oos;	
		
		try{
			
			File file = new File("lock_up.bin");
		
			 fos = new FileOutputStream(file);
			 oos =  new ObjectOutputStream(fos);
		
			oos.writeObject(lock_up);
			
			oos.close();
			fos.close();
			
		}catch(Exception e){
			
		}

	}
	
	/**
	 * This method retrieves an address book object from data.bin file
	 * @return an address book object
	 */
	public static PrisonerManager getPrisonerManager(){
		
		File file = new File("data.bin");
		
		try{
			
			
			if (file.exists()){
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois =  new ObjectInputStream(fis);
				
				PrisonerManager book =  (PrisonerManager)ois.readObject();
				fis.close();
				ois.close();
				return book;
			
			}
			else  
				return null;
	
		}catch (Exception e){
			
			e.printStackTrace();
			return null;	
		}
		
	}
	

	public static void saveItemCount(int counter){
		
		FileOutputStream fos1;
		ObjectOutputStream oos1;
		
		try{
			
			File file1 = new File ("item_count.bin");
			fos1 = new FileOutputStream(file1);
			oos1 =  new ObjectOutputStream(fos1);
			oos1.write(counter);
			oos1.close();
			fos1.close();
			
		}catch(Exception e){
			
		}
			
	}
	
	
	public static int getItemCount(){
		
		int counter = 0;
		ObjectInputStream ois;
		
		try{
			File file = new File("item_count.bin");
			ois = new ObjectInputStream(new FileInputStream(file));
			
			if(file.length() == 0){
				ois.close();
				return counter;
			}
			else{
				counter = ois.read();
				ois.close();
				return counter;
			}
		}
		catch(Exception e){
			return counter;
		}
	}
	
	public static void saveCaseCount(int counter){
		
		FileOutputStream fos1;
		ObjectOutputStream oos1;
		
		try{
			
			File file1 = new File ("case_count.bin");
			fos1 = new FileOutputStream(file1);
			oos1 =  new ObjectOutputStream(fos1);
			oos1.write(counter);
			oos1.close();
			fos1.close();
			
		}catch(Exception e){
			
		}
			
	}
	
	
	public static int getCaseCount(){
		
		int counter = 0;
		ObjectInputStream ois;
		
		try{
			File file = new File("case_count.bin");
			ois = new ObjectInputStream(new FileInputStream(file));
			
			if(file.length() == 0){
				ois.close();
				return counter;
			}
			else{
				counter = ois.read();
				ois.close();
				return counter;
			}
		}
		catch(Exception e){
			return counter;
		}
	}
	
	public static void savePrisonerCount(int counter){
		
		FileOutputStream fos1;
		ObjectOutputStream oos1;
		
		try{
			
			File file1 = new File ("prisoner_count.bin");
			fos1 = new FileOutputStream(file1);
			oos1 =  new ObjectOutputStream(fos1);
			oos1.write(counter);
			oos1.close();
			fos1.close();
			
		}catch(Exception e){
			
		}
			
	}
	
	
	public static int getPrisonerCount(){
		
		int counter = 0;
		ObjectInputStream ois;
		
		try{
			File file = new File("prisoner_count.bin");
			ois = new ObjectInputStream(new FileInputStream(file));
			
			if(file.length() == 0){
				ois.close();
				return counter;
			}
			else{
				counter = ois.read();
				ois.close();
				return counter;
			}
		}
		catch(Exception e){
			return counter;
		}
	}
}


