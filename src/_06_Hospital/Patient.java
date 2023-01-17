package _06_Hospital;

public class Patient {

	private boolean feelsCaredFor = false;
	private boolean pulsechecked = false;

	public boolean feelsCaredFor() {
		if (pulsechecked == true) {
			feelsCaredFor = true;
			return feelsCaredFor;
		}
		feelsCaredFor = false;
		return feelsCaredFor;
	}

	public boolean checkPulse() {
		pulsechecked = true;
		return pulsechecked;
	}
}
