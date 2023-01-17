package _06_Hospital;

public class GeneralPractitioner extends Doctor {

	Boolean makeHouseCalls = false;
	

	public Object makesHouseCalls() {
	makeHouseCalls = true;
		return makeHouseCalls;
	}


	public Object performsSurgery() {
		
		return false;
	}


}
