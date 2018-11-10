
public class TeaParty {
	String name;
	
	
	public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
		String welcomeMessage = "Hello " ;
		if(isWoman) {
			welcomeMessage += "Ms. ";
		}
		else {
			if(isKnighted) {
				welcomeMessage += "Sir ";
			}
			else {
				welcomeMessage += "Mr. ";
			}
		}
	welcomeMessage += name;
		return welcomeMessage;
		
		
		}
	
    }

