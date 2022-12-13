package _03_Text_Funkifier;

public class customString implements TextFunkifier {

	 private String unfunkifiedText;

	    public customString(String unfunkifiedText) {

	        this.unfunkifiedText = unfunkifiedText;

	    }
	    
	@Override
	public String funkifyText() {
		char[] changer = unfunkifiedText.toCharArray();
		if (Character.isLowerCase(changer[0])) {
		char temp = Character.toUpperCase(changer[0]);
		changer[0] = temp;
		}
		StringBuilder newer = new StringBuilder();
		for (int i = 0; i < changer.length; i++) {
			newer.append(changer[i]);
		}
	
		
		return newer.toString();
	}

}
