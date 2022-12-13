package _03_Text_Funkifier;

import javax.xml.stream.events.Characters;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		String changed = unfunkifiedText;
		StringBuilder tempor = new StringBuilder(unfunkifiedText);
		
		char[] newed = changed.toCharArray();
		char now = Character.toLowerCase(newed[0]);
		newed[0] = now;
		System.out.println(newed);
		for (int i = 0; i < newed.length; i++) {
			if ( i%2 != 0 && i != 0) {
				char temp = Character.toUpperCase(newed[i]);
				newed[i] = temp;
				System.out.println(newed);
			}
		}

		StringBuilder newer = new StringBuilder();
		for (int i = 0; i < newed.length; i++) {
			newer.append(newed[i]);
		}
		String finish = newer.toString();
		System.out.println(newer);
		return finish;
	}

}
