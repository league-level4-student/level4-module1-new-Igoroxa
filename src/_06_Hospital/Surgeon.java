package _06_Hospital;

public class Surgeon extends Doctor{

	Boolean performsSurgery = false;
	
	public Object performsSurgery() {
		performsSurgery = true;
		return performsSurgery;
	}

	public Object makesHouseCalls() {
	
		return false;
	}

}
