package loops;

import com.sun.jndi.url.dns.dnsURLContext;

//feladat: csinálni ciklust 10-ig -10-ig, 100-ig kettesével és 3-asával lépve, és minuszba.
public class SimpleLoop {
	public static void main(String[] a){
		System.out.println("Számok 0-9-ig:");
		for (int i = 0;i < 10; i++){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Számok 1-10-ig:");
		for (int i = 1; i <= 10; i++){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Páros számok 100-ig:");
		for (int i = 0; i <= 100; i = i+2){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Számok 3 számjegy távolságra:");
		for (int i = 1; i < 50; i = i+3){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Egész számok 5 és -10 között");
		for(int i = 5; i >= -10; i = i-1){
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("A kettes szám hatványai 100-ig:");
		for (int i = 2; i < 100; i = i*2){
			System.out.println(i);

		}
	}
}
