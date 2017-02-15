
public class source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long coconuts = 0;
		int sailors = 1;
		while (!testCoconuts(sailors, sailors, coconuts) && sailors != 1) {
			coconuts++;
		}
		System.out.println("Number of Sailors = " + sailors);
		System.out.println("Minimum coconuts = " + coconuts);
	}
	
	public static boolean testCoconuts(int sailors, int sailorsSleeping, long coconuts){

        // Fails the case where the sailor would take all the coconuts for himself
		// and never leaves a coconut for the monkey
		if (sailors == 1) {
			return false;
		}
		// Every sailors has taken their turn to mess around with
		// the coconut pile
		else if (sailorsSleeping < 0) {
			return true;
		}
        // checks if the coconut is divisible evenly with an extra coconut
		// for the monkey
		else if (coconuts%sailors == 1) {
			coconuts -= 1;
			coconuts -= coconuts / sailors;
			sailorsSleeping--;
			return testCoconuts(sailors, sailorsSleeping, coconuts);
		}
        // and false otherwise. 
		else {
			return false;
		}
   }
}
