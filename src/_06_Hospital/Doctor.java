package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {

	Boolean doingmedicine = false;
	List<Patient> docspatients = new ArrayList<Patient>();
	

	public void doMedicine() {
		for (int i = 0; i < docspatients.size(); i++) {
			docspatients.get(i).checkPulse();
			
		}
		
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (docspatients.size() < 3) {
			this.docspatients.add(patient);
		}
		else {
			throw new DoctorFullException("Doctor can only have 3 patients.");
			
		}
		
	}

	public List<Patient> getPatients() {
	
		
		return docspatients;
	}
	 
}
