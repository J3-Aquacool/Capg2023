class NoInteractionException extends Exception
{
	
	public NoInteractionException(String s) {
		//System.out.println("No Interaction Found with Participants");
	super(s);
	}
	
	public String getMyMessage()
	{
		return "No Interaction Found with Participants";
	}
}


class Trainer
{
	
	
	void askQuestions(String quest,String ans)throws NoInteractionException
	{
		if(quest!=null && ans==null)
		{
			throw new NoInteractionException("Particpants where not interactive");
		}
		else
		{
			System.out.println("Question Asked:"+quest);
			System.out.println("Answer  Rexcived:"+ans);
			
		}
	}
	
}



public class UserDefinedExcpDemo {

	public static void main(String[] args) throws NoInteractionException // throws NoInteractionException
	{
		// TODO Auto-generated method stub

		
		
		Trainer obj=new Trainer();
		
			obj.askQuestions("What is Encapsulation?",null);
		
	}

}

// ARM Feature