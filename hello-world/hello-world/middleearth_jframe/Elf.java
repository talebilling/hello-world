package middleearth_jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Elf {
	String name;
	/*
	 * -k�ne csin�lni egy f�ggv�nyt, az elfben, egy string tipus� v�ltoz�t, 
	 * -string neve number �rt�ke: eins 
	 * -elfek n�metek
	 * -sayNumber lesz a f�ggv�ny neve
	 * -nincs param�tere a f-nek
	 * -nincs visszat�r�si �rt�ke a f-nek
	 * -ez egy public void f
	 * �s annyit csin�l, hogy ki�rja azt a string-et
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
