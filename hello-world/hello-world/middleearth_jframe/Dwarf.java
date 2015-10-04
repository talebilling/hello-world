package middleearth_jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dwarf {
	String name;

	public Dwarf(String nameInput) {
		name = nameInput;
		System.out.println ("I hate every Elf, I am a Dwarf, " + name);
	}

	public Dwarf(String nameInput, JFrame worldInput) {
		name = nameInput;
		System.out.println ("I hate every Elf, I am a Dwarf, " + name);
		JLabel dwarflabel = new JLabel ("I hate every Elf, I am a Dwarf, " + name, JLabel.CENTER);
		worldInput.add(dwarflabel);
	} 

	public void sayNumber() {
		String number2 = "one";
		System.out.println(number2);
	}
}
