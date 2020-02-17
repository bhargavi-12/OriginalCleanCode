package SimpleIntrest.sitask3;

import java.util.Scanner;

public class CostOFBuilding
{
	public void cost(){
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.format("%s","menu");
		System.out.format("%s","\n1.standard materials");
		System.out.format("%s","\n2.above stabdard materials");
		System.out.format("%s","\n3.high standard materials");
		System.out.format("%s","\n4.high standar materials and fully automated home");
		int[] mc= {1200,1500,1700,2600};
		int res;
		double x,y;
		System.out.format("%s","\n enter your choice for material of house");
		res=s.nextInt();
		System.out.format("%s","\n enter total area of the house in sq.ft");
		x=s.nextDouble();
		y=mc[res-1]*x;
		System.out.format("the cost of constuction is %.2f",y);
		
	}
}