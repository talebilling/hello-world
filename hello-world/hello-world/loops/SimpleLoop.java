package loops;

import com.sun.jndi.url.dns.dnsURLContext;

//feladat: csin�lni ciklust 10-ig -10-ig, 100-ig kettes�vel �s 3-as�val l�pve, �s minuszba.
public class SimpleLoop {
	public static void main(String[] a){
		System.out.println("Sz�mok 0-9-ig:");
		for (int i = 0;i < 10; i++){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Sz�mok 1-10-ig:");
		for (int i = 1; i <= 10; i++){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("P�ros sz�mok 100-ig:");
		for (int i = 0; i <= 100; i = i+2){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Sz�mok 3 sz�mjegy t�vols�gra:");
		for (int i = 1; i < 50; i = i+3){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Eg�sz sz�mok 5 �s -10 k�z�tt");
		for(int i = 5; i >= -10; i = i-1){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("A kettes sz�m hatv�nyai 100-ig:");
		for (int i = 2; i < 100; i = i*2){
			System.out.println(i);

		}
	}
}
