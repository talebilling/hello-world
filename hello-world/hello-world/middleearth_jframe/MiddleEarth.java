package middleearth_jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiddleEarth {

	public static void main(String[] args) {
		JLabel label = new JLabel("Hello World", JLabel.CENTER);
		JFrame middleEarth = new JFrame("Middle Earth");
		middleEarth.setSize(600, 600);
		middleEarth.setVisible(true);
		middleEarth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		middleEarth.add(label);
		
		Elf legolas = new Elf("Legolas", middleEarth);
		Elf thranduil = new Elf("Thranduil", middleEarth);
		Dwarf gimli = new Dwarf("Gimli", middleEarth);
		Dwarf miffin = new Dwarf("Miffin", middleEarth);
		Wizard saruman = new Wizard("Saruman");
		Wizard gandalf = new Wizard("Gandalf");
		legolas.sayNumber();
		gimli.sayNumber();
		gandalf.sayNumber();
		
	}

}
