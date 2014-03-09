import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Arrays;
 
public class GedcomReader 
{         
	public static void main(String[] args)
    {         
		List<String> tags = Arrays.asList(new String[]{"INDI","NAME","SEX","BIRT","DEAT","FAMC","FAMS","FAM","MARR","HUSB","WIFE","CHIL","DIV","DATE","TRLR","NOTE"});

	    try 
	    {
	        FileReader fr = new FileReader("gedcom.ged");
	        BufferedReader br = new BufferedReader(fr);
	        String s;
	        while((s = br.readLine()) != null)
	        {
	            System.out.println(s);
	        	String[] records = s.split("\\s");
	        	String level = records[0];
	        	String tag = records[1];
	        	System.out.println(level);	        	
        		if (!tags.contains(tag))
        		{
        			System.out.println("Invalid tag");
        		}
        		else
        		{
        			System.out.println(tag);
        		}
	        }
	        fr.close();
	    }
	    catch(Exception e) 
	    {
	        System.out.println("Error: " + e.getMessage());
	    }//end try catch
    }//end main     
}//end class