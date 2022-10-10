package ucgenAlanHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int kenar1, kenar2, kenar3,u=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("1. Kenar: ");
		kenar1=input.nextInt();
		System.out.print("2. Kenar: ");
		kenar2=input.nextInt();
		System.out.print("3. Kenar: ");
		kenar3=input.nextInt();
		
		u=(kenar1+kenar2+kenar3)/2;
		System.out.println("Kenarlarý girilen üçgenin alaný: "+(
				u*(u-kenar1)*(u-kenar2)*(u-kenar3)
				));
	}

}
