package SimpleIntrest.sitask3;

import java.io.IOException;
import java.util.Scanner;

public class simpleI {
	
		static
		{
			float p=0,t=0,r=0;
			float si=0,A=0,n=0;
			Scanner sc=new Scanner(System.in);
			try {
				System.out.write("Enter values of p:".getBytes());
				p=sc.nextFloat();
				System.out.write("Enter values of t in years only:".getBytes());
				t=sc.nextFloat();
				System.out.write("Enter values of r:".getBytes());
				r=sc.nextFloat();
				System.out.write("Enter values of n:".getBytes());
				si=(p*t*r)/100;
				System.out.printf("%f",si);
				A=(float) (p*(Math.pow((1+(r/n)),(n*t))));
				System.out.printf("%f",A);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}
	

}
