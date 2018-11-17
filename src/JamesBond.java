 
public class JamesBond {

	public void findCode(Vault v){
		for (int i = 0; i < 1000000; i++) {
			boolean correct = v.trycode(i);
			if(correct == true) {
				System.out.println("success");
			}
		}
		
	}
}
