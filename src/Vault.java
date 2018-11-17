import java.nio.charset.MalformedInputException;

public class Vault {
	private int SecretCode = 2354;
	public Vault(int num){
		SecretCode = num;
	}
public boolean trycode(int num) {
	if(SecretCode == num) {
		return true;
	}
	else {
		return false;
	}
	}

}
