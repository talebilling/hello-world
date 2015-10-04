package middleearth_jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Elf {
	String name;
	/*
	 * -kéne csinálni egy függvényt, az elfben, egy string tipusú változót, 
	 * -string neve number értéke: eins 
	 * -elfek németek
	 * -sayNumber lesz a függvény neve
	 * -nincs paramétere a f-nek
	 * -nincs visszatérési értéke a f-nek
	 * -ez egy public void f
	 * és annyit csinál, hogy kiírja azt a string-et
	 */
	
	public Elf(String nameInput, JFrame worldInput) {
		name = nameInput;
		System.out.println ("I am an Elf, " + name);
		JLabel elflabel = new JLabel ("I am an Elf, " + name, JLabel.CENTER);
		worldInput.add(elflabel);
	} 

	public void sayNumber() {
		String number = "eins";
		System.out.println(number);
	}
	
}
