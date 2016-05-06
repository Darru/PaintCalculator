import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorSystem
{
	public static void main(String[] args)
	{
		int howManyWalls;
		double wallWidth;
		double wallHeight;
		double wallSize;
		double wallTotal = 0;
		
		DecimalFormat formatDecimal = new DecimalFormat("##.00");
		
		Scanner userInput = new Scanner(System.in);
				
		Paint cheapMax = new Paint ("Cheap Max", 11, 20, 19.99);
		Paint averageJoe = new Paint ("Average Joe", 14, 15, 19.99);
		Paint duluxPaint = new Paint ("Dulux Paint", 17, 10, 19.99);
			
		
		do 
		{
			System.out.println("How many walls do you have?");
			
			while (!userInput.hasNextInt())
				{
				System.out.println("Please enter a number greater than 0.");
				userInput.next();				
				}
			howManyWalls = userInput.nextInt();
		}
		while (howManyWalls <=1);
		
		for (int i=0; i < howManyWalls; i++)
		{
			System.out.println("Please enter the width in metre. Wall " + (i + 1));
			wallWidth = userInput.nextInt();
			
			System.out.println("Please enter the height in metre. Wall " + (i + 1));
			wallHeight = userInput.nextInt();
			
			RoomSize wall = new RoomSize (0, 0);
			wall.setWallWidth(wallWidth);
			wall.setWallHeight(wallHeight);
			
			wallSize = (int) (wall.getWallWidth() * wall.getWallHeight());
			wallTotal = wallTotal + wallSize;
			System.out.println(wallSize);
		}
		
		int tinsNeededCM = (int) Math.ceil((double) wallTotal / cheapMax.totalCoverage());
		int tinsNeededAJ = (int) Math.ceil((double) wallTotal / averageJoe.totalCoverage());
		int tinsNeededDP = (int) Math.ceil((double) wallTotal / duluxPaint.totalCoverage());
		
		System.out.println("You would need " + tinsNeededCM + " tins of " + cheapMax.paintName + " . This would cost £" + formatDecimal.format(cheapMax.pricePaint * tinsNeededCM));
		System.out.println("You would have " + (( (cheapMax.totalCoverage() - (wallTotal / 100) * cheapMax.litresPaint) ) ) + " of paint left.");
		
		System.out.println("You would need " + tinsNeededAJ + " tins of " + averageJoe.paintName + " . This would cost £" + formatDecimal.format(averageJoe.pricePaint * tinsNeededAJ));
		System.out.println("You would have " + (( (averageJoe.totalCoverage() - (wallTotal / 100) * averageJoe.litresPaint) ) ) + " of paint left.");
		
		System.out.println("You would need " + tinsNeededDP + " tins of " + duluxPaint.paintName + " . This would cost £" + formatDecimal.format(duluxPaint.pricePaint * tinsNeededDP));
		System.out.println("You would have " + (( (duluxPaint.totalCoverage() - (wallTotal / 100) * duluxPaint.litresPaint) ) ) + " of paint left.");

		userInput.close();
	}

}
