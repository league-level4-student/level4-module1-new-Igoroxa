package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
List <Doctor> docs = new ArrayList<Doctor>();
List <Patient> fulllist = new ArrayList<Patient>();
	public void assignPatientsToDoctors() {
		for (int i = 0; i < docs.size(); i++) {
			docs.get(i).assignPatient(fulllist.get(i));
		}
		
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return docs;
	}

	public void addDoctor(Surgeon surgeon) {
		docs.add(surgeon);
		
	}

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		docs.add(generalPractitioner);
		
	}


	public List<Patient> getPatients() {
	
		return fulllist;
	}

	public void addPatient(Patient patient) {
fulllist.add(patient);
		
	}

	

}
