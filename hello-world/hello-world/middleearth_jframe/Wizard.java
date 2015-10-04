package middleearth_jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Wizard {
	String name;

	public Wizard(String nameInput) {
		name = nameInput;
		System.out.println ("Hi, I am a great Wizard, " + name);
	}
	
	public Wizard(String nameInput, JFrame worldInput) {
		name = nameInput;
		System.out.println ("Hi, I am a great Wizard, " + name);
		JLabel wizardlabel = new JLabel ("Hi, I am a great Wizard, " + name, JLabel.CENTER);
		worldInput.add(wizardlabel);
	} 

	public void sayNumber() {
		String number = "egy";
		System.out.println(number);
	}
	
	public void sayNumber2() {
		String number = "egy";
		number = "egy";
		System.out.println(number);
	}
}
