
public class PopcornMaker {
public static void main(String[] args) {
	Microwave microwave = new Microwave();
	Popcorn popcorn = new Popcorn("white cheddar");
	microwave.putInMicrowave(popcorn);
	microwave.setTime(3);
	microwave.startMicrowave();
	

	
	
}
}
