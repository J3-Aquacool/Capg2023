import java.io.IOException;
import java.io.UnsupportedEncodingException;
//Creator
class Voter
{
	
	void checkAge(int age)throws IOException
	{
		if(age <18)
		{
			throw new IOException("NOT VALID");
			
		}
		else
		{
		System.out.println("Valid");
		}
		
	}
	
}









public class CheckedExceptionUnderstanding {

	public static void main(String[] args)throws IOException
	{ 
		Voter v=new Voter();
		v.checkAge(19);
		
	
	}
	
	
	
	

}
